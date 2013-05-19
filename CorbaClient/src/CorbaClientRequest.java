import Stock.Quoter;
import Stock.StockQuote;

public abstract class CorbaClientRequest {
	protected Quoter mQuoter;

	public CorbaClientRequest(Quoter quoter) {
		mQuoter = quoter;
	}

	public StockQuote getStockQuote(String nameOrId) {
		try {
			int stockId = Integer.parseInt(nameOrId);
			return getQuoteById(stockId);
		} catch (NumberFormatException e) {
			return getQuoteByName(nameOrId);
		}
	}

	protected abstract StockQuote getQuoteById(int id);

	protected abstract StockQuote getQuoteByName(String name);
}
