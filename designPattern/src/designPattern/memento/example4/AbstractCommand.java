package designPattern.memento.example4;

public abstract class AbstractCommand implements Command {

	public abstract void execute();
	
	protected OperationApi operation = null;
	
	public void setOperation(OperationApi operation) {
		this.operation = operation;
	}
	public Memento createMemento() {
		return this.operation.createMemento();
	}
	
	public void redo (Memento m) {
		this.operation.setMemento(m);
	}
	
	public void undo(Memento m) {
		this.operation.setMemento(m);
	}
}
