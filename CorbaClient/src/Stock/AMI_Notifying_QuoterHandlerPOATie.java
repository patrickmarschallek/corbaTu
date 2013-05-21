package Stock;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "AMI_Notifying_QuoterHandler".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 9:29:04 PM
 */

public class AMI_Notifying_QuoterHandlerPOATie
	extends AMI_Notifying_QuoterHandlerPOA
{
	private AMI_Notifying_QuoterHandlerOperations _delegate;

	private POA _poa;
	public AMI_Notifying_QuoterHandlerPOATie(AMI_Notifying_QuoterHandlerOperations delegate)
	{
		_delegate = delegate;
	}
	public AMI_Notifying_QuoterHandlerPOATie(AMI_Notifying_QuoterHandlerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public Stock.AMI_Notifying_QuoterHandler _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		Stock.AMI_Notifying_QuoterHandler __r = Stock.AMI_Notifying_QuoterHandlerHelper.narrow(__o);
		return __r;
	}
	public Stock.AMI_Notifying_QuoterHandler _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		Stock.AMI_Notifying_QuoterHandler __r = Stock.AMI_Notifying_QuoterHandlerHelper.narrow(__o);
		return __r;
	}
	public AMI_Notifying_QuoterHandlerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(AMI_Notifying_QuoterHandlerOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public void register_callback_name()
	{
_delegate.register_callback_name();
	}

	public void register_callback_name_excep(org.omg.Messaging.ExceptionHolder excep_holder)
	{
_delegate.register_callback_name_excep(excep_holder);
	}

	public void unregister_callback_name_excep(org.omg.Messaging.ExceptionHolder excep_holder)
	{
_delegate.unregister_callback_name_excep(excep_holder);
	}

	public void unregister_callback_id()
	{
_delegate.unregister_callback_id();
	}

	public void register_callback_id_excep(org.omg.Messaging.ExceptionHolder excep_holder)
	{
_delegate.register_callback_id_excep(excep_holder);
	}

	public void register_callback_id()
	{
_delegate.register_callback_id();
	}

	public void unregister_callback_id_excep(org.omg.Messaging.ExceptionHolder excep_holder)
	{
_delegate.unregister_callback_id_excep(excep_holder);
	}

	public void unregister_callback_name()
	{
_delegate.unregister_callback_name();
	}

}
