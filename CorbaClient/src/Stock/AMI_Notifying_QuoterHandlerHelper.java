package Stock;


/**
 * Generated from IDL interface "AMI_Notifying_QuoterHandler".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 9:29:04 PM
 */

public abstract class AMI_Notifying_QuoterHandlerHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(AMI_Notifying_QuoterHandlerHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:Stock/AMI_Notifying_QuoterHandler:1.0", "AMI_Notifying_QuoterHandler");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final Stock.AMI_Notifying_QuoterHandler s)
	{
			any.insert_Object(s);
	}
	public static Stock.AMI_Notifying_QuoterHandler extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:Stock/AMI_Notifying_QuoterHandler:1.0";
	}
	public static AMI_Notifying_QuoterHandler read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(Stock._AMI_Notifying_QuoterHandlerStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final Stock.AMI_Notifying_QuoterHandler s)
	{
		_out.write_Object(s);
	}
	public static Stock.AMI_Notifying_QuoterHandler narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof Stock.AMI_Notifying_QuoterHandler)
		{
			return (Stock.AMI_Notifying_QuoterHandler)obj;
		}
		else if (obj._is_a("IDL:Stock/AMI_Notifying_QuoterHandler:1.0"))
		{
			Stock._AMI_Notifying_QuoterHandlerStub stub;
			stub = new Stock._AMI_Notifying_QuoterHandlerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static Stock.AMI_Notifying_QuoterHandler unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof Stock.AMI_Notifying_QuoterHandler)
		{
			return (Stock.AMI_Notifying_QuoterHandler)obj;
		}
		else
		{
			Stock._AMI_Notifying_QuoterHandlerStub stub;
			stub = new Stock._AMI_Notifying_QuoterHandlerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
