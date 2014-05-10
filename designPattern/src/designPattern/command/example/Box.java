package designPattern.command.example;

public class Box {

	private Command openCommand;
	
	public void openButtonPressed() {
		openCommand.execute();
	}

	public void setOpenCommand(Command openCommand) {
		this.openCommand = openCommand;
	}
}
