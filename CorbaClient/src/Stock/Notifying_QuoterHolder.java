package Stock;

/**
 * Generated from IDL interface "Notifying_Quoter".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 3:36:39 PM
 */

public final class Notifying_QuoterHolder	implements org.omg.CORBA.portable.Streamable{
	 public Notifying_Quoter value;
	public Notifying_QuoterHolder()
	{
	}
	public Notifying_QuoterHolder (final Notifying_Quoter initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return Notifying_QuoterHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = Notifying_QuoterHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		Notifying_QuoterHelper.write (_out,value);
	}
}
