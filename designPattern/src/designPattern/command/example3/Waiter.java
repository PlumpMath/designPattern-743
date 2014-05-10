package designPattern.command.example3;

public class Waiter {
	private MenuCommand menuCommand = new MenuCommand();
	
	public void orderDish(Command cmd) {
		CookApi hotCook = new HotCook();
		CookApi coolCook = new CoolCook();
		
		if(cmd instanceof DuckCommand) {
			((DuckCommand) cmd).setCookApi(hotCook);
		} else if (cmd instanceof ChopCommand) {
			((ChopCommand) cmd).setCookApi(hotCook);
		} else if (cmd instanceof PorkCommand) {
			((PorkCommand) cmd).setCookApi(coolCook);
		}
		
		menuCommand.addCommand(cmd);
	}
	
	public void orderOver() {
		this.menuCommand.execute();
	}
}
