package Stock;

/**
 * Generated from IDL struct "StockQuote".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 14.05.2013 09:23:02
 */

public final class StockQuoteHolder
	implements org.omg.CORBA.portable.Streamable
{
	public Stock.StockQuote value;

	public StockQuoteHolder ()
	{
	}
	public StockQuoteHolder(final Stock.StockQuote initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return Stock.StockQuoteHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = Stock.StockQuoteHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		Stock.StockQuoteHelper.write(_out, value);
	}
}
