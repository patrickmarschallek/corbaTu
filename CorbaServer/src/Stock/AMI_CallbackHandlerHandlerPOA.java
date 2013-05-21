package Stock;


/**
 * Generated from IDL interface "AMI_CallbackHandlerHandler".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 9:29:04 PM
 */

public abstract class AMI_CallbackHandlerHandlerPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, Stock.AMI_CallbackHandlerHandlerOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "push", Integer.valueOf(0));
		m_opsHash.put ( "push_excep", Integer.valueOf(1));
	}
	private String[] ids = {"IDL:Stock/AMI_CallbackHandlerHandler:1.0","IDL:omg.org/Messaging/ReplyHandler:1.0"};
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
				_out = handler.createReply();
				push();
				break;
			}
			case 1: // push_excep
			{
				org.omg.Messaging.ExceptionHolder _arg0=(org.omg.Messaging.ExceptionHolder)((org.omg.CORBA_2_3.portable.InputStream)_input).read_value ("IDL:omg.org/Messaging/ExceptionHolder:1.0");
				_out = handler.createReply();
				push_excep(_arg0);
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
