package designPattern.command.example3;

public class DuckCommand implements Command {
	private CookApi cookApi = null;

	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}

	@Override
	public void execute() {
		this.cookApi.cook("cook duck.. ");
	}

}
