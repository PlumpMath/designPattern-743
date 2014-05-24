package designPattern.memento.example;

public class FlowAMock {
	private String flowName;

	private int tempResult;

	private String tempState;

	public FlowAMock(String flowName) {
		this.flowName = flowName;
	}

	public void runPhaseOne() {

		tempResult = 3;
		tempState = "PhaseOne";
	}

	public void schema1() {
		this.tempState += ", Schema1";
		System.out.println(this.tempState + " :now run " + tempResult);

		this.tempResult += 11;
	}

	public void schema2() {
		this.tempState += ", Schema2";
		System.out.println(this.tempState + " :now run " + tempResult);

		this.tempResult += 22;
	}

	public FlowAMockMemento createMemento() {
		return new MementoImpl(this.tempResult, this.tempState);
	}

	public void setMemento(FlowAMockMemento memento) {
		MementoImpl mementoImpl = (MementoImpl) memento;
		this.tempResult = mementoImpl.getTempResult();
		this.tempState = mementoImpl.getTempState();
	}

	private static class MementoImpl implements FlowAMockMemento {
		private int tempResult;
		private String tempState;

		public MementoImpl(int tempResult, String tempState) {
			this.tempResult = tempResult;
			this.tempState = tempState;
		}

		public int getTempResult() {
			return tempResult;
		}

		public String getTempState() {
			return tempState;
		}
	}
}
