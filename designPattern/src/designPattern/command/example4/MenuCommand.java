package designPattern.command.example4;

import java.util.ArrayList;
import java.util.Collection;

public class MenuCommand implements Command {

	private Collection<Command> col =new ArrayList<Command>();
	
	public void addCommand(Command cmd) {
		col.add(cmd);
	}
	@Override
	public void execute() {
		CommandQuene.addMenu(this);
	}
	@Override
	public void setCookApi(CookApi cookApi) {		
	}
	@Override
	public int getTableNum() {
		return 0;
	}

	public Collection<Command> getCommands() {
		return this.col;
	}
}
