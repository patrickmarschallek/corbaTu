package Stock;

/**
 * Generated from IDL interface "CallbackHandler".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 8:33:43 PM
 */

public final class CallbackHandlerHolder	implements org.omg.CORBA.portable.Streamable{
	 public CallbackHandler value;
	public CallbackHandlerHolder()
	{
	}
	public CallbackHandlerHolder (final CallbackHandler initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CallbackHandlerHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CallbackHandlerHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CallbackHandlerHelper.write (_out,value);
	}
}
