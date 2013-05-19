package Stock;


/**
 * Generated from IDL interface "Quoter".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 19.05.2013 14:51:30
 */

public abstract class QuoterHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(QuoterHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:Stock/Quoter:1.0", "Quoter");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final Stock.Quoter s)
	{
			any.insert_Object(s);
	}
	public static Stock.Quoter extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:Stock/Quoter:1.0";
	}
	public static Quoter read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(Stock._QuoterStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final Stock.Quoter s)
	{
		_out.write_Object(s);
	}
	public static Stock.Quoter narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof Stock.Quoter)
		{
			return (Stock.Quoter)obj;
		}
		else if (obj._is_a("IDL:Stock/Quoter:1.0"))
		{
			Stock._QuoterStub stub;
			stub = new Stock._QuoterStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static Stock.Quoter unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof Stock.Quoter)
		{
			return (Stock.Quoter)obj;
		}
		else
		{
			Stock._QuoterStub stub;
			stub = new Stock._QuoterStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
