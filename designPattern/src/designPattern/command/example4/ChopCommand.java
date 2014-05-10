package designPattern.command.example4;

public class ChopCommand implements Command {

	private CookApi cookApi = null;
	
	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}
	
	private int tableNum;
	
	public ChopCommand(int tableNum) {
		this.tableNum = tableNum;
	}
	
	@Override
	public void execute() {
		this.cookApi.cook(tableNum,"cook chop.. ");
	}
	
	@Override
	public int getTableNum() {
		return tableNum;
	}

}
