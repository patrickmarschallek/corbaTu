package Stock;


/**
 * Generated from IDL interface "AMI_QuoterHandler".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 8:33:43 PM
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
