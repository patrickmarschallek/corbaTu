package Stock;


/**
 * Generated from IDL struct "StockQuote".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 9:29:04 PM
 */

public abstract class StockQuoteHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(StockQuoteHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(Stock.StockQuoteHelper.id(),"StockQuote",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("id", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(3)), null),new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("price", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(7)), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final Stock.StockQuote s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static Stock.StockQuote extract (final org.omg.CORBA.Any any)
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
		return "IDL:Stock/StockQuote:1.0";
	}
	public static Stock.StockQuote read (final org.omg.CORBA.portable.InputStream in)
	{
		Stock.StockQuote result = new Stock.StockQuote();
		result.id=in.read_long();
		result.name=in.read_string();
		result.price=in.read_double();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final Stock.StockQuote s)
	{
		out.write_long(s.id);
		java.lang.String tmpResult0 = s.name;
out.write_string( tmpResult0 );
		out.write_double(s.price);
	}
}
