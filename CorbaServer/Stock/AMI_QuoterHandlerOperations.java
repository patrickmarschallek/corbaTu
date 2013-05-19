package Stock;


/**
 * Generated from IDL interface "AMI_QuoterHandler".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 19.05.2013 14:51:30
 */

public interface AMI_QuoterHandlerOperations
	extends org.omg.Messaging.ReplyHandlerOperations
{
	/* constants */
	/* operations  */
	void getQuoteByName(Stock.StockQuote ami_return_val);
	void getQuoteByName_excep(org.omg.Messaging.ExceptionHolder excep_holder);
	void getQuoteById(Stock.StockQuote ami_return_val);
	void getQuoteById_excep(org.omg.Messaging.ExceptionHolder excep_holder);
}
