package Stock;


/**
 * Generated from IDL interface "Notifying_Quoter".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 9:29:04 PM
 */

public interface Notifying_QuoterOperations
{
	/* constants */
	/* operations  */
	void register_callback_name(java.lang.String stockName, Stock.CallbackHandler handler) throws Stock.InvalidStockException;
	void unregister_callback_name(java.lang.String stockName, Stock.CallbackHandler handler) throws Stock.InvalidStockException;
	void register_callback_id(int stockId, Stock.CallbackHandler handler) throws Stock.InvalidStockException;
	void unregister_callback_id(int stockId, Stock.CallbackHandler handler) throws Stock.InvalidStockException;
}
