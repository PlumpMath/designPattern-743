package designPattern.memento.example2;

public class FlowAMockPrototype implements Cloneable{
	private String flowName;

	private int tempResult;

	private String tempState;

	public FlowAMockPrototype(String flowName) {
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
		try {
			return new MementoImplPrototype((FlowAMockPrototype) this.clone());
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void setMemento(FlowAMockMemento memento) {
		MementoImplPrototype mementoImpl = (MementoImplPrototype) memento;
		this.tempResult = mementoImpl.getFlowMock().tempResult;
		this.tempState = mementoImpl.getFlowMock().tempState;
	}

	private static class MementoImplPrototype implements FlowAMockMemento {
		private FlowAMockPrototype flowMock = null;

		public MementoImplPrototype(FlowAMockPrototype f) {
			this.flowMock = f;
		}
		
		public FlowAMockPrototype getFlowMock() {
			return this.flowMock;
		}
	}
}
