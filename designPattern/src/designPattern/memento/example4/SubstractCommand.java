package designPattern.memento.example4;

public class SubstractCommand extends AbstractCommand {

	private int opeNum;

	public SubstractCommand(int opeNum) {
		this.opeNum = opeNum;
	}

	@Override
	public void execute() {
		this.operation.substract(opeNum);
	}

}
