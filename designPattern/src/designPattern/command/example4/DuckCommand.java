package designPattern.command.example4;

public class DuckCommand implements Command {

	private CookApi cookApi = null;
	
	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}
	
	private int tableNum;
	
	public DuckCommand(int tableNum) {
		this.tableNum = tableNum;
	}
	
	@Override
	public void execute() {
		this.cookApi.cook(tableNum,"cook duck.. ");
	}
	
	@Override
	public int getTableNum() {
		return tableNum;
	}

}
