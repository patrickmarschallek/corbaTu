
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;

import Stock.Quoter;
import Stock.QuoterHelper;
import Stock.StockQuote;

public class CorbaClient {

    public static StockQuote stockQuote;

    public static void main(String args[]) {
        stockQuote = null;
        try {

            // Create and initialize the ORB
            ORB orb = ORB.init(args, null);

            // Get the root naming context
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContext ncRef = NamingContextHelper.narrow(objRef);

            // Resolve the object reference in naming
            NameComponent nc = new NameComponent("Quoter", "");
            NameComponent path[] = {nc};
            Quoter quoterRef = QuoterHelper.narrow(ncRef.resolve(path));

            CorbaClientRequest request = new SIIRequest(quoterRef);

            if (args[1].equals("b")) {
                request = new DIIRequest(quoterRef);
            } else if (args[1].equals("c")) {
                request = new OneWayRequest(quoterRef);
            } else if (args[1].equals("d")) {
                request = new AMIRequest(quoterRef, orb);
            }
            stockQuote = request.getStockQuote(args[0]);
            printQuote(stockQuote);

        } catch (Exception e) {
            System.out.println("ERROR : " + e);
            e.printStackTrace(System.out);
        }
    }

    private static void printQuote(StockQuote quote) {
        System.out.println("StockQuote");
        System.out.println("\tID: " + quote.id);
        System.out.println("\tName: " + quote.name);
        System.out.println("\tPrice: " + quote.price);
    }

    public static StockQuote getStockQuote() {
        return stockQuote;
    }
    
}