package Stock;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "Quoter".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 8:33:43 PM
 */

public class QuoterPOATie
	extends QuoterPOA
{
	private QuoterOperations _delegate;

	private POA _poa;
	public QuoterPOATie(QuoterOperations delegate)
	{
		_delegate = delegate;
	}
	public QuoterPOATie(QuoterOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public Stock.Quoter _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		Stock.Quoter __r = Stock.QuoterHelper.narrow(__o);
		return __r;
	}
	public Stock.Quoter _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		Stock.Quoter __r = Stock.QuoterHelper.narrow(__o);
		return __r;
	}
	public QuoterOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(QuoterOperations delegate)
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
	public Stock.StockQuote getQuoteById(int stockId) throws Stock.InvalidStockException
	{
		return _delegate.getQuoteById(stockId);
	}

	public Stock.StockQuote getQuoteByName(java.lang.String stockName) throws Stock.InvalidStockException
	{
		return _delegate.getQuoteByName(stockName);
	}

}
