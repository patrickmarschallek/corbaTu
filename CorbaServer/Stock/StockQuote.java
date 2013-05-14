package Stock;

/**
 * Generated from IDL struct "StockQuote".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at 14.05.2013 09:23:02
 */

public final class StockQuote
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public StockQuote(){}
	public int id;
	public java.lang.String name = "";
	public double price;
	public StockQuote(int id, java.lang.String name, double price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
