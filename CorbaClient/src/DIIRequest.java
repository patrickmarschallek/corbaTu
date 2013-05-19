import org.omg.CORBA.Request;
import org.omg.CORBA.WrongTransaction;

import Stock.Quoter;
import Stock.StockQuote;
import Stock.StockQuoteHolder;


public class DIIRequest extends CorbaClientRequest {

	public DIIRequest(Quoter quoter) {
		super(quoter);
	}

	@Override
	protected StockQuote getQuoteById(int id) {
		Request r = mQuoter._request("getQuoteById");

		// Add the in string
		// r.add_in_arg().insert_string(args[0]);
		r.add_in_arg().insert_long(id);

		return executeRequest(r);
	}

	@Override
	protected StockQuote getQuoteByName(String name) {
		Request r = mQuoter._request("getQuoteByName");

		// Add the in string
		// r.add_in_arg().insert_string(args[0]);
		r.add_in_arg().insert_string(name);

		return executeRequest(r);
	}

	private StockQuote executeRequest(Request r) {
		// Add the Streamable for return value
		StockQuoteHolder quoteHolder = new StockQuoteHolder();
		r.return_value().insert_Streamable(quoteHolder);

		// Invoke the Request
		r.send_deferred();

		try {
			while (!r.poll_response()) {
				Thread.sleep(1000);
			}
			r.get_response();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WrongTransaction e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		r.return_value().extract_Streamable();
		System.out.println(quoteHolder._type());
		System.out.println(quoteHolder.value);

		return quoteHolder.value;
	}

}
