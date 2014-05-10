package designPattern.command;

public class Invoker {
	private Command command = null;

	public void runCommand() {
		command.execute();
	}

	public void setCommand(Command command) {
		this.command = command;
	}
}
