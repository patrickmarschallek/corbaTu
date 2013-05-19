
import org.omg.CORBA.ORB;
import org.omg.CORBA.Request;
import org.omg.CORBA.WrongTransaction;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;

import Stock.InvalidStockException;
import Stock.Quoter;
import Stock.QuoterHelper;
import Stock.StockQuote;
import Stock.StockQuoteHolder;

public class CorbaClient {
	public static void main(String args[]) {
		try {

			// Create and initialize the ORB
			ORB orb = ORB.init(args, null);

			// Get the root naming context
			org.omg.CORBA.Object objRef = orb
					.resolve_initial_references("NameService");
			NamingContext ncRef = NamingContextHelper.narrow(objRef);

			// Resolve the object reference in naming
			NameComponent nc = new NameComponent("Quoter", "");
			NameComponent path[] = { nc };
			Quoter quoterRef = QuoterHelper.narrow(ncRef.resolve(path));

			if (args[1].equals("a")) {
				useStaticInvocation(quoterRef, args);
			} else if (args[1].equals("b")) {
				useDynamicInvocation(quoterRef, args);
			} else if (args[1].equals("c")) {
				useOnewayCalls(quoterRef, args);
			} else if (args[1].equals("d")) {
				useAMI(quoterRef, args);

			}

		} catch (Exception e) {
			System.out.println("ERROR : " + e);
			e.printStackTrace(System.out);
		}
	}

	private static void useStaticInvocation(Quoter quoterRef, String args[])
			throws InvalidStockException {
		StockQuote stockQuote;
		try {
			int stockId = Integer.parseInt(args[0]);
			stockQuote = quoterRef.getQuoteById(stockId);
		} catch (NumberFormatException e) {
			stockQuote = quoterRef.getQuoteByName(args[0]);
		}
		printQuote(stockQuote);
	}

	private static void useDynamicInvocation(Quoter quoterRef, String args[]) {

		// Create a Request
		Request r = quoterRef._request("getQuoteById");

		// Add the in string
		// r.add_in_arg().insert_string(args[0]);
		int id = Integer.parseInt(args[0]);
		r.add_in_arg().insert_long(id);

		// Add the Streamable for return value
		StockQuoteHolder quoteHolder = new StockQuoteHolder();
		r.return_value().insert_Streamable(quoteHolder);

		// Invoke the Request
		r.send_deferred();


		try {
			while(!r.poll_response()){
				Thread.sleep(1000);
			}
			r.get_response();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (WrongTransaction e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		StockQuote quote = quoteHolder.value;

		printQuote(quote);
	}

	private static void useOnewayCalls(Quoter quoterRef, String args[]) {

	}

	private static void useAMI(Quoter quoterRef, String args[]) {

	}

	private static void printQuote(StockQuote quote) {
		System.out.println("StockQuote");
		System.out.println("\tID: " + quote.id);
		System.out.println("\tName: " + quote.name);
		System.out.println("\tPrice: " + quote.price);
	}
}