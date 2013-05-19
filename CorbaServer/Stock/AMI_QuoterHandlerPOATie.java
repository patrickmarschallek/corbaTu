package Stock;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "AMI_QuoterHandler".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 19.05.2013 14:51:30
 */

public class AMI_QuoterHandlerPOATie
	extends AMI_QuoterHandlerPOA
{
	private AMI_QuoterHandlerOperations _delegate;

	private POA _poa;
	public AMI_QuoterHandlerPOATie(AMI_QuoterHandlerOperations delegate)
	{
		_delegate = delegate;
	}
	public AMI_QuoterHandlerPOATie(AMI_QuoterHandlerOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public Stock.AMI_QuoterHandler _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		Stock.AMI_QuoterHandler __r = Stock.AMI_QuoterHandlerHelper.narrow(__o);
		return __r;
	}
	public Stock.AMI_QuoterHandler _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		Stock.AMI_QuoterHandler __r = Stock.AMI_QuoterHandlerHelper.narrow(__o);
		return __r;
	}
	public AMI_QuoterHandlerOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(AMI_QuoterHandlerOperations delegate)
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
	public void getQuoteById(Stock.StockQuote ami_return_val)
	{
_delegate.getQuoteById(ami_return_val);
	}

	public void getQuoteById_excep(org.omg.Messaging.ExceptionHolder excep_holder)
	{
_delegate.getQuoteById_excep(excep_holder);
	}

	public void getQuoteByName_excep(org.omg.Messaging.ExceptionHolder excep_holder)
	{
_delegate.getQuoteByName_excep(excep_holder);
	}

	public void getQuoteByName(Stock.StockQuote ami_return_val)
	{
_delegate.getQuoteByName(ami_return_val);
	}

}
