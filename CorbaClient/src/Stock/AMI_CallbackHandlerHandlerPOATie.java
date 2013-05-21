package Stock;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "AMI_CallbackHandlerHandler".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 9:29:04 PM
 */

public class AMI_CallbackHandlerHandlerPOATie
	extends AMI_CallbackHandlerHandlerPOA
{
	private AMI_CallbackHandlerHandlerOperations _delegate;

	private POA _poa;
	public AMI_CallbackHandlerHandlerPOATie(AMI_CallbackHandlerHandlerOperations delegate)
	{
		_delegate = delegate;
	}
	public AMI_CallbackHandlerHandlerPOATie(AMI_CallbackHandlerHandlerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public Stock.AMI_CallbackHandlerHandler _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		Stock.AMI_CallbackHandlerHandler __r = Stock.AMI_CallbackHandlerHandlerHelper.narrow(__o);
		return __r;
	}
	public Stock.AMI_CallbackHandlerHandler _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		Stock.AMI_CallbackHandlerHandler __r = Stock.AMI_CallbackHandlerHandlerHelper.narrow(__o);
		return __r;
	}
	public AMI_CallbackHandlerHandlerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(AMI_CallbackHandlerHandlerOperations delegate)
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
	public void push()
	{
_delegate.push();
	}

	public void push_excep(org.omg.Messaging.ExceptionHolder excep_holder)
	{
_delegate.push_excep(excep_holder);
	}

}
