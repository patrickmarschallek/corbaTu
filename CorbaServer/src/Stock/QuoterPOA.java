package Stock;


/**
 * Generated from IDL interface "Quoter".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 14.05.2013 09:23:02
 */

public abstract class QuoterPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, Stock.QuoterOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "getQuoteById", Integer.valueOf(0));
		m_opsHash.put ( "getQuoteByName", Integer.valueOf(1));
	}
	private String[] ids = {"IDL:Stock/Quoter:1.0"};
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
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // getQuoteById
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				Stock.StockQuoteHelper.write(_out,getQuoteById(_arg0));
			}
			catch(Stock.InvalidStockException _ex0)
			{
				_out = handler.createExceptionReply();
				Stock.InvalidStockExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getQuoteByName
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				Stock.StockQuoteHelper.write(_out,getQuoteByName(_arg0));
			}
			catch(Stock.InvalidStockException _ex0)
			{
				_out = handler.createExceptionReply();
				Stock.InvalidStockExceptionHelper.write(_out, _ex0);
			}
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
