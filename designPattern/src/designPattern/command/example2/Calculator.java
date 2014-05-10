package designPattern.command.example2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	private Command addCmd = null;
	
	private Command substractCmd = null;

	private List<Command> undoCmds = new ArrayList<Command>();
	
	private List<Command> redoCmds= new ArrayList<Command>();
	
	public void setAddCmd(Command addCmd) {
		this.addCmd = addCmd;
	}

	public void setSubstractCmd(Command substractCmd) {
		this.substractCmd = substractCmd;
	}
	
	public void addPressed() {
		this.addCmd.execute();
		undoCmds.add(this.addCmd);
	}
	
	public void substractPressed() {
		this.substractCmd.execute();
		undoCmds.add(this.substractCmd);
	}
	
	public void undoPressed() {
		if(this.undoCmds.size() >0) {
			Command cmd = this.undoCmds.get(this.undoCmds.size()-1);
			cmd.undo();
			this.redoCmds.add(cmd);
			this.undoCmds.remove(cmd);
		} else {
			System.out.println("no operation can be cancel!");
		}
	}
	
	public void redoPressed() {
		if(this.redoCmds.size()>0) {
			Command cmd = this.redoCmds.get(this.redoCmds.size()-1);
			cmd.execute();
			this.undoCmds.add(cmd);
			this.redoCmds.remove(cmd);
		} else {
			System.out.println("no opeation can be redo");
		}
	}
}
