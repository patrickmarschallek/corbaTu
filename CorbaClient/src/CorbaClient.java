import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;

import Stock.Quoter;
import Stock.QuoterHelper;
import Stock.StockQuote;

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

			StockQuote stockQuote;
			try {
				int stockId = Integer.parseInt(args[0]);
				stockQuote = quoterRef.getQuoteById(stockId);
			} catch (NumberFormatException e) {
				stockQuote = quoterRef.getQuoteByName(args[0]);
			}
			System.out.println(stockQuote);

		} catch (Exception e) {
			System.out.println("ERROR : " + e);
			e.printStackTrace(System.out);
		}
	}
}