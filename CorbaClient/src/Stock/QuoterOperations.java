package Stock;


/**
 * Generated from IDL interface "Quoter".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 19.05.2013 14:51:30
 */

public interface QuoterOperations
{
	/* constants */
	/* operations  */
	Stock.StockQuote getQuoteByName(java.lang.String stockName) throws Stock.InvalidStockException;
	Stock.StockQuote getQuoteById(int stockId) throws Stock.InvalidStockException;
}
