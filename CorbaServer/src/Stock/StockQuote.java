package Stock;

/**
 * Generated from IDL struct "StockQuote".
 *
 * @author JacORB IDL compiler V 3.2, 07-Dec-2012
 * @version generated at May 21, 2013 8:33:43 PM
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
