import Stock.CallbackHandler;
import Stock.CallbackHandlerPOA;
import Stock.InvalidStockException;
import Stock.Notifying_Quoter;
import Stock.Quoter;
import Stock.StockQuote;
import org.omg.CORBA.ORB;


public class OneWayRequest extends CorbaClientRequest {

	private volatile StockQuote oneWayResult;
	private CallbackHandler callback;
	private Notifying_Quoter notifyQuoterRef;
	private ORB orb;
	
	public OneWayRequest(Quoter quoter, ORB orb, Notifying_Quoter notifyQuoterRef) {
		super(quoter);
		this.callback = new CallbackHandlerImpl(this)._this(orb);
		this.notifyQuoterRef = notifyQuoterRef;
		this.orb = orb;
	}

	@Override
	protected StockQuote getQuoteById(int id) {
		return null;
	}

	@Override
	protected StockQuote getQuoteByName(String name) {
		try {
			notifyQuoterRef.register_callback_name(name, callback);
		} catch (InvalidStockException e) {
			e.printStackTrace();
		}
		
		orb.run();
		return oneWayResult;
	}
	
	class CallbackHandlerImpl extends CallbackHandlerPOA{

		private OneWayRequest oneWayReq;
		public CallbackHandlerImpl(OneWayRequest oneWayReq){
			this.oneWayReq = oneWayReq;
		}
		
		@Override
		public void push(StockQuote data) {
			System.out.println("Received StockQuote " + data.id + " "
					+ data.name + " " + data.price);
			oneWayReq.setOneWayResult(data);			
		}
		
	}
	
	public StockQuote getOneWayResult() {
		return oneWayResult;
	}

	public void setOneWayResult(StockQuote oneWayResult) {
		this.oneWayResult = oneWayResult;
	}

}
