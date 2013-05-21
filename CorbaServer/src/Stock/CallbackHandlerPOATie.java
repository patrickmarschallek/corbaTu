package Stock;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "CallbackHandler".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 9:29:04 PM
 */

public class CallbackHandlerPOATie
	extends CallbackHandlerPOA
{
	private CallbackHandlerOperations _delegate;

	private POA _poa;
	public CallbackHandlerPOATie(CallbackHandlerOperations delegate)
	{
		_delegate = delegate;
	}
	public CallbackHandlerPOATie(CallbackHandlerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public Stock.CallbackHandler _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		Stock.CallbackHandler __r = Stock.CallbackHandlerHelper.narrow(__o);
		return __r;
	}
	public Stock.CallbackHandler _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		Stock.CallbackHandler __r = Stock.CallbackHandlerHelper.narrow(__o);
		return __r;
	}
	public CallbackHandlerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CallbackHandlerOperations delegate)
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
	public void push(Stock.StockQuote data)
	{
_delegate.push(data);
	}

}
