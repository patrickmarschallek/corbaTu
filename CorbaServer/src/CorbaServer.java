import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import Stock.InvalidStockException;
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
			quoterImpl.setORB(orb);

			// get object reference from the servant
			org.omg.CORBA.Object ref = rootpoa.servant_to_reference(quoterImpl);
			Quoter href = QuoterHelper.narrow(ref);

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

			System.out.println("QuoterServer ready and waiting ...");

			// wait for invocations from clients
			orb.run();
		}

		catch (Exception e) {
			System.err.println("ERROR: " + e);
			e.printStackTrace(System.out);
		}

		System.out.println("HelloServer Exiting ...");

	}
}

class QuoterServant extends QuoterPOA {
	private ORB orb;

	public void setORB(ORB orb_val) {
		orb = orb_val;
	}

	@Override
	public StockQuote getQuoteByName(String stockName)
			throws InvalidStockException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StockQuote getQuoteById(int stockId) throws InvalidStockException {
		// TODO Auto-generated method stub
		return null;
	}
	
		  // implement shutdown() method
	public void shutdown() {
		orb.shutdown(false);
	}

}

