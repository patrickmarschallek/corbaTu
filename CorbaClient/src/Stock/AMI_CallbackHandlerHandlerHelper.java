package Stock;


/**
 * Generated from IDL interface "AMI_CallbackHandlerHandler".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 8:33:43 PM
 */

public abstract class AMI_CallbackHandlerHandlerHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(AMI_CallbackHandlerHandlerHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:Stock/AMI_CallbackHandlerHandler:1.0", "AMI_CallbackHandlerHandler");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final Stock.AMI_CallbackHandlerHandler s)
	{
			any.insert_Object(s);
	}
	public static Stock.AMI_CallbackHandlerHandler extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:Stock/AMI_CallbackHandlerHandler:1.0";
	}
	public static AMI_CallbackHandlerHandler read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(Stock._AMI_CallbackHandlerHandlerStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final Stock.AMI_CallbackHandlerHandler s)
	{
		_out.write_Object(s);
	}
	public static Stock.AMI_CallbackHandlerHandler narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof Stock.AMI_CallbackHandlerHandler)
		{
			return (Stock.AMI_CallbackHandlerHandler)obj;
		}
		else if (obj._is_a("IDL:Stock/AMI_CallbackHandlerHandler:1.0"))
		{
			Stock._AMI_CallbackHandlerHandlerStub stub;
			stub = new Stock._AMI_CallbackHandlerHandlerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static Stock.AMI_CallbackHandlerHandler unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof Stock.AMI_CallbackHandlerHandler)
		{
			return (Stock.AMI_CallbackHandlerHandler)obj;
		}
		else
		{
			Stock._AMI_CallbackHandlerHandlerStub stub;
			stub = new Stock._AMI_CallbackHandlerHandlerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
