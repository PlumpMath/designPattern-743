package designPattern.command.example4;

import java.util.ArrayList;
import java.util.List;

public class CommandQuene {
	private static List<Command> cmds = new ArrayList<Command>();
	
	public synchronized static void addMenu(MenuCommand menu) {
		for(Command cmd : menu.getCommands()) {
			cmds.add(cmd);
		}
	}
	
	public synchronized static Command getOneCommand() {
		Command cmd = null;
		if(cmds.size() > 0) {
			cmd = cmds.get(0);
			cmds.remove(0);
		}
		return cmd;
	}
}
