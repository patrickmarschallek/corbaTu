import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import Stock.CallbackHandler;
import Stock.InvalidStockException;
import Stock.Notifying_Quoter;
import Stock.Notifying_QuoterHelper;
import Stock.Notifying_QuoterPOA;
import Stock.Quoter;
import Stock.QuoterHelper;
import Stock.QuoterPOA;
import Stock.StockQuote;

public class CorbaServer {
	public static void main(String args[]) {
		try {
			// create and initialize the ORB
			ORB orb = ORB.init(args, null);

			// get reference to rootpoa & activate the POAManager
			POA rootpoa = POAHelper.narrow(orb
					.resolve_initial_references("RootPOA"));
			rootpoa.the_POAManager().activate();

			// create servant and register it with the ORB
			QuoterServant quoterImpl = new QuoterServant();
			quoterImpl.generateTestData();
			quoterImpl.setORB(orb);

			// get object reference from the servant
			org.omg.CORBA.Object ref = rootpoa.servant_to_reference(quoterImpl);
			Quoter href = QuoterHelper.narrow(ref);
			
			// create servant and register it with the ORB
			Notifying_QuoterServant notifyQuoterImpl = new Notifying_QuoterServant();
			notifyQuoterImpl.generateTestData();
			notifyQuoterImpl.setORB(orb);

			// get object reference from the servant
			org.omg.CORBA.Object reftoNotify = rootpoa.servant_to_reference(notifyQuoterImpl);
			Notifying_Quoter hreftoNotify  = Notifying_QuoterHelper.narrow(reftoNotify);

			// get the root naming context
			org.omg.CORBA.Object objRef = orb
					.resolve_initial_references("NameService");
			// Use NamingContextExt which is part of the Interoperable
			// Naming Service (INS) specification.
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

			// bind the Object Reference in Naming
			String name = "Quoter";
			NameComponent path[] = ncRef.to_name(name);
			ncRef.rebind(path, href);
			
			// bind the Object Reference in Naming
			String nameNotifyingQuoter = "Notifying_Quoter";
			NameComponent pathToNotifyingQuoter[] = ncRef.to_name(nameNotifyingQuoter);
			ncRef.rebind(pathToNotifyingQuoter, hreftoNotify);
			

			System.out.println("QuoterServer ready and waiting ...");

			// wait for invocations from clients
			orb.run();
		}

		catch (Exception e) {
			System.err.println("ERROR: " + e);
			e.printStackTrace(System.out);
		}

		System.out.println("QuoterServer Exiting ...");

	}
}

class QuoterServant extends QuoterPOA {
	private ORB orb;

	private List<StockQuote> quotes;

	public void setORB(ORB orb_val) {
		orb = orb_val;
	}

	@Override
	public StockQuote getQuoteByName(String stockName)
			throws InvalidStockException {
		System.out.println("getQuoteByName " + stockName);
		for (StockQuote q : quotes) {
			System.out.println("returning quote");
			if (q.name.equals(stockName)) {
				return q;
			}
		}
		return null;
	}

	@Override
	public StockQuote getQuoteById(int stockId) throws InvalidStockException {
		System.out.println("getQuoteById " + stockId);
		for (StockQuote q : quotes) {
			if (q.id == stockId) {
				System.out.println("returning quote");
				return q;
			}
		}
		return null;
	}
	
		  // implement shutdown() method
	public void shutdown() {
		orb.shutdown(false);
	}

	public void generateTestData() {
		StockQuote quote = new StockQuote(0, "test0", 1.2);
		StockQuote quote1 = new StockQuote(1, "test1", 3.4);
		StockQuote quote2 = new StockQuote(2, "test2", 5.6);

		quotes = new ArrayList();

		quotes.add(quote);
		quotes.add(quote1);
		quotes.add(quote2);
	}
}
	
	class Notifying_QuoterServant extends Notifying_QuoterPOA {
		private ORB orb;

		private List<StockQuote> quotes;

		public void setORB(ORB orb_val) {
			orb = orb_val;
		}
		
		@Override
		public void register_callback_name(String stockName,
				CallbackHandler handler) throws InvalidStockException {
			System.out.println("getQuoteByName " + stockName);
			for (StockQuote q : quotes) {
				if (q.name.equals(stockName)) {
					System.out.println("returning quote");
					handler.push(q);
					handler._release();
				}
			}
		}

		@Override
		public void unregister_callback_name(String stockName,
				CallbackHandler handler) throws InvalidStockException {
			shutdown();
			
		}
		
		@Override
		public void register_callback_id(int stockId, CallbackHandler handler)
				throws InvalidStockException {
			System.out.println("getQuoteById " + stockId);
			for (StockQuote q : quotes) {
				if (q.id == stockId) {
					System.out.println("returning quote");
					handler.push(q);
				}
			}
			
		}

		@Override
		public void unregister_callback_id(int stockId, CallbackHandler handler)
				throws InvalidStockException {
				shutdown();
			
		}
		
	    // implement shutdown() method
		public void shutdown() {
			orb.shutdown(false);
		}

		public void generateTestData() {
			StockQuote quote = new StockQuote(0, "test0", 1.2);
			StockQuote quote1 = new StockQuote(1, "test1", 3.4);
			StockQuote quote2 = new StockQuote(2, "test2", 5.6);

			quotes = new ArrayList();

			quotes.add(quote);
			quotes.add(quote1);
			quotes.add(quote2);
		}

	}
	
