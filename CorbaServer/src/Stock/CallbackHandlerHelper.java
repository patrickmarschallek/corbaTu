package Stock;


/**
 * Generated from IDL interface "CallbackHandler".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 8:33:43 PM
 */

public abstract class CallbackHandlerHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(CallbackHandlerHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:Stock/CallbackHandler:1.0", "CallbackHandler");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final Stock.CallbackHandler s)
	{
			any.insert_Object(s);
	}
	public static Stock.CallbackHandler extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:Stock/CallbackHandler:1.0";
	}
	public static CallbackHandler read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(Stock._CallbackHandlerStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final Stock.CallbackHandler s)
	{
		_out.write_Object(s);
	}
	public static Stock.CallbackHandler narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof Stock.CallbackHandler)
		{
			return (Stock.CallbackHandler)obj;
		}
		else if (obj._is_a("IDL:Stock/CallbackHandler:1.0"))
		{
			Stock._CallbackHandlerStub stub;
			stub = new Stock._CallbackHandlerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static Stock.CallbackHandler unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof Stock.CallbackHandler)
		{
			return (Stock.CallbackHandler)obj;
		}
		else
		{
			Stock._CallbackHandlerStub stub;
			stub = new Stock._CallbackHandlerStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
