package designPattern.memento.example;

public class FlowAMementoCareTaker {

	private FlowAMockMemento memento = null;
	
	public void saveMemento (FlowAMockMemento memento) {
		this.memento = memento;
	}
	
	public FlowAMockMemento retriveMemento() {
		return this.memento;
	}
}
