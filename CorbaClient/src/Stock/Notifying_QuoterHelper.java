package Stock;


/**
 * Generated from IDL interface "Notifying_Quoter".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 3:36:39 PM
 */

public abstract class Notifying_QuoterHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(Notifying_QuoterHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:Stock/Notifying_Quoter:1.0", "Notifying_Quoter");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final Stock.Notifying_Quoter s)
	{
			any.insert_Object(s);
	}
	public static Stock.Notifying_Quoter extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:Stock/Notifying_Quoter:1.0";
	}
	public static Notifying_Quoter read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(Stock._Notifying_QuoterStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final Stock.Notifying_Quoter s)
	{
		_out.write_Object(s);
	}
	public static Stock.Notifying_Quoter narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof Stock.Notifying_Quoter)
		{
			return (Stock.Notifying_Quoter)obj;
		}
		else if (obj._is_a("IDL:Stock/Notifying_Quoter:1.0"))
		{
			Stock._Notifying_QuoterStub stub;
			stub = new Stock._Notifying_QuoterStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static Stock.Notifying_Quoter unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof Stock.Notifying_Quoter)
		{
			return (Stock.Notifying_Quoter)obj;
		}
		else
		{
			Stock._Notifying_QuoterStub stub;
			stub = new Stock._Notifying_QuoterStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
