package Stock;


/**
 * Generated from IDL exception "InvalidStockException".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 9:29:04 PM
 */

public abstract class InvalidStockExceptionHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(InvalidStockExceptionHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_exception_tc(Stock.InvalidStockExceptionHelper.id(),"InvalidStockException",new org.omg.CORBA.StructMember[0]);
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final Stock.InvalidStockException s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static Stock.InvalidStockException extract (final org.omg.CORBA.Any any)
	{
		org.omg.CORBA.portable.InputStream in = any.create_input_stream();
		try
		{
			return read (in);
		}
		finally
		{
			try
			{
				in.close();
			}
			catch (java.io.IOException e)
			{
			throw new RuntimeException("Unexpected exception " + e.toString() );
			}
		}
	}

	public static String id()
	{
		return "IDL:Stock/InvalidStockException:1.0";
	}
	public static Stock.InvalidStockException read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		final Stock.InvalidStockException result = new Stock.InvalidStockException(id);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final Stock.InvalidStockException s)
	{
		out.write_string(id());
	}
}
