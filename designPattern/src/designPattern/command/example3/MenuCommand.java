package designPattern.command.example3;

import java.util.ArrayList;
import java.util.Collection;

public class MenuCommand implements Command {

	private Collection<Command> col =new ArrayList<Command>();
	
	public void addCommand(Command cmd) {
		col.add(cmd);
	}
	@Override
	public void execute() {
		for(Command cmd :col) {
			cmd.execute();
		}
	}

}
