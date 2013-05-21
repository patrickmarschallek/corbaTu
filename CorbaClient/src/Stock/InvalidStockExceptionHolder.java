package Stock;

/**
 * Generated from IDL exception "InvalidStockException".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 9:29:04 PM
 */

public final class InvalidStockExceptionHolder
	implements org.omg.CORBA.portable.Streamable
{
	public Stock.InvalidStockException value;

	public InvalidStockExceptionHolder ()
	{
	}
	public InvalidStockExceptionHolder(final Stock.InvalidStockException initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return Stock.InvalidStockExceptionHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = Stock.InvalidStockExceptionHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		Stock.InvalidStockExceptionHelper.write(_out, value);
	}
}
