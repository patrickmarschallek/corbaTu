package Stock;


/**
 * Generated from IDL interface "AMI_Notifying_QuoterHandler".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 8:33:43 PM
 */

public abstract class AMI_Notifying_QuoterHandlerPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, Stock.AMI_Notifying_QuoterHandlerOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "register_callback_name", Integer.valueOf(0));
		m_opsHash.put ( "register_callback_name_excep", Integer.valueOf(1));
		m_opsHash.put ( "unregister_callback_name_excep", Integer.valueOf(2));
		m_opsHash.put ( "unregister_callback_name", Integer.valueOf(3));
	}
	private String[] ids = {"IDL:Stock/AMI_Notifying_QuoterHandler:1.0","IDL:omg.org/Messaging/ReplyHandler:1.0"};
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
			case 0: // register_callback_name
			{
				_out = handler.createReply();
				register_callback_name();
				break;
			}
			case 1: // register_callback_name_excep
			{
				org.omg.Messaging.ExceptionHolder _arg0=(org.omg.Messaging.ExceptionHolder)((org.omg.CORBA_2_3.portable.InputStream)_input).read_value ("IDL:omg.org/Messaging/ExceptionHolder:1.0");
				_out = handler.createReply();
				register_callback_name_excep(_arg0);
				break;
			}
			case 2: // unregister_callback_name_excep
			{
				org.omg.Messaging.ExceptionHolder _arg0=(org.omg.Messaging.ExceptionHolder)((org.omg.CORBA_2_3.portable.InputStream)_input).read_value ("IDL:omg.org/Messaging/ExceptionHolder:1.0");
				_out = handler.createReply();
				unregister_callback_name_excep(_arg0);
				break;
			}
			case 3: // unregister_callback_name
			{
				_out = handler.createReply();
				unregister_callback_name();
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
