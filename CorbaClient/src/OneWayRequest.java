import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;

import Stock.CallbackHandler;
import Stock.CallbackHandlerPOA;
import Stock.InvalidStockException;
import Stock.Notifying_Quoter;
import Stock.Quoter;
import Stock.StockQuote;


public class OneWayRequest extends CorbaClientRequest {

	private volatile StockQuote oneWayResult;
	private CallbackHandler callback;
	private Notifying_Quoter notifyQuoterRef;
	private ORB orb;
	
	public OneWayRequest(Quoter quoter, ORB orb, Notifying_Quoter notifyQuoterRef) {
		super(quoter);
		this.callback = new CallbackHandlerImpl(this)._this(orb);
		this.notifyQuoterRef = notifyQuoterRef;
		this.oneWayResult = null;
		this.orb = orb;

	}

	@Override
	protected StockQuote getQuoteById(int id) {

		POA rootpoa;
		try {
			rootpoa = POAHelper.narrow(orb
					.resolve_initial_references("RootPOA"));

			rootpoa.the_POAManager().activate();
		} catch (InvalidName e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AdapterInactive e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			notifyQuoterRef.register_callback_id(id, callback);
		} catch (InvalidStockException e) {
			e.printStackTrace();

			return null;
		}
		System.out.println("Waiting for response...");
		while (oneWayResult == null) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// orb.run();
		return oneWayResult;
	}

	@Override
	protected StockQuote getQuoteByName(String name) {
		POA rootpoa;
		try {
			rootpoa = POAHelper.narrow(orb
					.resolve_initial_references("RootPOA"));

			rootpoa.the_POAManager().activate();
		} catch (InvalidName e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AdapterInactive e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			notifyQuoterRef.register_callback_name(name, callback);
		} catch (InvalidStockException e) {
			e.printStackTrace();

			return null;
		}
		System.out.println("Waiting for response...");
		while (oneWayResult == null) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// orb.run();
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
