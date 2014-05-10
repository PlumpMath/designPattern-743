package designPattern.command;

public class ConcreteCommand implements Command {

	private Receiver receiver = null;

	private String state;

	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.action();
	}

}
