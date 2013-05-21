package Stock;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Notifying_Quoter".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 9:29:04 PM
 */

public class Notifying_QuoterPOATie
	extends Notifying_QuoterPOA
{
	private Notifying_QuoterOperations _delegate;

	private POA _poa;
	public Notifying_QuoterPOATie(Notifying_QuoterOperations delegate)
	{
		_delegate = delegate;
	}
	public Notifying_QuoterPOATie(Notifying_QuoterOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public Stock.Notifying_Quoter _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		Stock.Notifying_Quoter __r = Stock.Notifying_QuoterHelper.narrow(__o);
		return __r;
	}
	public Stock.Notifying_Quoter _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		Stock.Notifying_Quoter __r = Stock.Notifying_QuoterHelper.narrow(__o);
		return __r;
	}
	public Notifying_QuoterOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(Notifying_QuoterOperations delegate)
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
	public void unregister_callback_id(int stockId, Stock.CallbackHandler handler) throws Stock.InvalidStockException
	{
_delegate.unregister_callback_id(stockId,handler);
	}

	public void register_callback_id(int stockId, Stock.CallbackHandler handler) throws Stock.InvalidStockException
	{
_delegate.register_callback_id(stockId,handler);
	}

	public void unregister_callback_name(java.lang.String stockName, Stock.CallbackHandler handler) throws Stock.InvalidStockException
	{
_delegate.unregister_callback_name(stockName,handler);
	}

	public void register_callback_name(java.lang.String stockName, Stock.CallbackHandler handler) throws Stock.InvalidStockException
	{
_delegate.register_callback_name(stockName,handler);
	}

}
