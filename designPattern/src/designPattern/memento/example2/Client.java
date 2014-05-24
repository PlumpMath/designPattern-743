package designPattern.memento.example2;

public class Client {

	public static void main(String[] args) {
		FlowAMockPrototype mock = new FlowAMockPrototype("TestFlow");
		
		mock.runPhaseOne();
		
		FlowAMementoCareTaker careTaker = new FlowAMementoCareTaker();
		
		FlowAMockMemento memento = mock.createMemento();
		
		careTaker.saveMemento(memento);
		
		mock.schema1();
		
		mock.setMemento(memento);
		
		mock.schema2();
	}

}
