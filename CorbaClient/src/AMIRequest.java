import org.omg.CORBA.ORB;
import org.omg.Messaging.ExceptionHolder;

import Stock.AMI_QuoterHandler;
import Stock.AMI_QuoterHandlerPOA;
import Stock.Quoter;
import Stock.StockQuote;
import Stock._QuoterStub;


public class AMIRequest extends CorbaClientRequest {
	private AMI_QuoterHandler mHandler;
	private boolean mExceptionThrown;
	private volatile StockQuote mResult;

	public void setResult(StockQuote result) {
		if (result == null) {
			mExceptionThrown = true;
		}
		this.mResult = result;
	}

	public AMIRequest(Quoter quoter, ORB orb) {
		super(quoter);
		mHandler = new AMIQuoterHandlerImpl(this)._this(orb);
		mResult = null;
		mExceptionThrown = false;
	}

	@Override
	protected StockQuote getQuoteById(int id) {
		// invoke sendc
		((_QuoterStub) mQuoter).sendc_getQuoteById(mHandler, id);
		while (mResult == null && !mExceptionThrown) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return mResult;
	}

	@Override
	protected StockQuote getQuoteByName(String name) {
		((_QuoterStub) mQuoter).sendc_getQuoteByName(mHandler, name);
		while (mResult == null && !mExceptionThrown) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return mResult;
	}


}

class AMIQuoterHandlerImpl extends AMI_QuoterHandlerPOA {
	private AMIRequest mAmiRequest;

	public AMIQuoterHandlerImpl(AMIRequest amiRequest) {
		mAmiRequest = amiRequest;
	}
	@Override
	public void getQuoteByName(StockQuote ami_return_val) {
		System.out.println("Received StockQuote " + ami_return_val.id + " "
				+ ami_return_val.name + " " + ami_return_val.price);
		mAmiRequest.setResult(ami_return_val);
	}

	@Override
	public void getQuoteByName_excep(ExceptionHolder excep_holder) {
		System.out.println("Exception was thrown: " + excep_holder.toString());
		mAmiRequest.setResult(null);
	}

	@Override
	public void getQuoteById(StockQuote ami_return_val) {
		System.out.println("Received StockQuote " + ami_return_val.id + " "
				+ ami_return_val.name + " " + ami_return_val.price);
		mAmiRequest.setResult(ami_return_val);
	}

	@Override
	public void getQuoteById_excep(ExceptionHolder excep_holder) {
		System.out.println("Exception was thrown: " + excep_holder.toString());
		mAmiRequest.setResult(null);
	}

}
