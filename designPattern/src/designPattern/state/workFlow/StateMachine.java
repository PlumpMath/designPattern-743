package designPattern.state.workFlow;

public class StateMachine {

	private State state = null;
	private Object businessVO = null;
	
	public void doWork() {
		this.state.doWork(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Object getBusinessVO() {
		return businessVO;
	}

	public void setBusinessVO(Object businessVO) {
		this.businessVO = businessVO;
	}
	
	
}
