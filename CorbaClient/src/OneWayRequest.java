import Stock.Quoter;
import Stock.StockQuote;


public class OneWayRequest extends CorbaClientRequest {

	public OneWayRequest(Quoter quoter) {
		super(quoter);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected StockQuote getQuoteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected StockQuote getQuoteByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
