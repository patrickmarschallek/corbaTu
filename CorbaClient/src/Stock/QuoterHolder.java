package Stock;

/**
 * Generated from IDL interface "Quoter".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 19.05.2013 14:51:30
 */

public final class QuoterHolder	implements org.omg.CORBA.portable.Streamable{
	 public Quoter value;
	public QuoterHolder()
	{
	}
	public QuoterHolder (final Quoter initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return QuoterHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = QuoterHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		QuoterHelper.write (_out,value);
	}
}
