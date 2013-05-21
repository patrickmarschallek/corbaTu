package Stock;


/**
 * Generated from IDL interface "AMI_Notifying_QuoterHandler".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 8:33:43 PM
 */

public interface AMI_Notifying_QuoterHandlerOperations
	extends org.omg.Messaging.ReplyHandlerOperations
{
	/* constants */
	/* operations  */
	void register_callback_name();
	void register_callback_name_excep(org.omg.Messaging.ExceptionHolder excep_holder);
	void unregister_callback_name();
	void unregister_callback_name_excep(org.omg.Messaging.ExceptionHolder excep_holder);
}
