package Stock;


/**
 * Generated from IDL interface "CallbackHandler".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 8:33:43 PM
 */

public abstract class CallbackHandlerPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, Stock.CallbackHandlerOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "push", Integer.valueOf(0));
	}
	private String[] ids = {"IDL:Stock/CallbackHandler:1.0"};
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
			case 0: // push
			{
				Stock.StockQuote _arg0=Stock.StockQuoteHelper.read(_input);
				_out = handler.createReply();
				push(_arg0);
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
