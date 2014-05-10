package designPattern.command.example2;

public class SubstractCommand implements Command {
	
	private OperationApi operation = null;
	
	private int opeNum;
	@Override
	public void execute() {
		this.operation.substract(opeNum);
	}

	@Override
	public void undo() {
		this.operation.add(opeNum);
	}

	public SubstractCommand(OperationApi operation, int opeNum) {
		this.operation = operation;
		this.opeNum = opeNum;
	}

}
