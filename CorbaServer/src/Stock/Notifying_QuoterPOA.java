package Stock;


/**
 * Generated from IDL interface "Notifying_Quoter".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 3:36:39 PM
 */

public abstract class Notifying_QuoterPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, Stock.Notifying_QuoterOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "unregister_callback_name", Integer.valueOf(0));
		m_opsHash.put ( "register_callback_name", Integer.valueOf(1));
	}
	private String[] ids = {"IDL:Stock/Notifying_Quoter:1.0"};
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
			case 0: // unregister_callback_name
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				Stock.CallbackHandler _arg1=Stock.CallbackHandlerHelper.read(_input);
				_out = handler.createReply();
				unregister_callback_name(_arg0,_arg1);
			}
			catch(Stock.InvalidStockException _ex0)
			{
				_out = handler.createExceptionReply();
				Stock.InvalidStockExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // register_callback_name
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				Stock.CallbackHandler _arg1=Stock.CallbackHandlerHelper.read(_input);
				_out = handler.createReply();
				register_callback_name(_arg0,_arg1);
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
