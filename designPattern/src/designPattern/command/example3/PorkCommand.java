package designPattern.command.example3;

public class PorkCommand implements Command {

	private CookApi cookApi = null;

	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}

	@Override
	public void execute() {
		this.cookApi.cook("cook pork.. ");
	}

}
