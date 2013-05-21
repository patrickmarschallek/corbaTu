package Stock;

/**
 * Generated from IDL struct "StockQuote".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 8:33:43 PM
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
