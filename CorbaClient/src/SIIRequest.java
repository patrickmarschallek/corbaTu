import Stock.InvalidStockException;
import Stock.Quoter;
import Stock.StockQuote;


public class SIIRequest extends CorbaClientRequest {

	public SIIRequest(Quoter quoter) {
		super(quoter);
	}

	@Override
	protected StockQuote getQuoteById(int id) {
		try {
			return mQuoter.getQuoteById(id);
		} catch (InvalidStockException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	protected StockQuote getQuoteByName(String name) {
		try {
			return mQuoter.getQuoteByName(name);
		} catch (InvalidStockException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
