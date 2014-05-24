package designPattern.memento.example4;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	private List<Command> undoCmds = new ArrayList<Command>();

	private List<Command> redoCmds = new ArrayList<Command>();

	private List<Memento[]> undoMementos = new ArrayList<Memento[]>();
	private List<Memento[]> redoMementos = new ArrayList<Memento[]>();

	private Command addCmd = null;
	private Command substractCmd = null;

	public void setAddCmd(Command addCmd) {
		this.addCmd = addCmd;
	}

	public void setSubstractCmd(Command substractCmd) {
		this.substractCmd = substractCmd;
	}

	public void addPressed() {
		Memento m1 = this.addCmd.createMemento();
		this.addCmd.execute();

		undoCmds.add(this.addCmd);

		Memento m2 = this.addCmd.createMemento();
		this.undoMementos.add(new Memento[] { m1, m2 });
	}

	public void substractPressed() {
		Memento m1 = this.substractCmd.createMemento();

		this.substractCmd.execute();

		undoCmds.add(this.substractCmd);

		Memento m2 = this.substractCmd.createMemento();

		this.undoMementos.add(new Memento[] { m1, m2 });
	}
	
	public void undoPressed() {
		if(undoCmds.size() > 0) {
			Command cmd = undoCmds.get(undoCmds.size() -1);
			
			Memento[] ms = undoMementos.get(undoCmds.size() -1);
			
			cmd.undo(ms[0]);
			
			redoCmds.add(cmd);
			
			redoMementos.add(ms);
			
			undoCmds.remove(cmd);
			
			undoMementos.remove(ms);
		} else {
			System.out.println("no command can undo ....");
		}
	}
	
	public void redoPressed() {
		if(redoCmds.size() > 0) {
			Command cmd = redoCmds.get(redoCmds.size() -1);
			
			Memento[] ms = redoMementos.get(redoCmds.size() -1);
			
			cmd.redo(ms[1]);
			
			redoCmds.add(cmd);
			
			redoMementos.add(ms);
			
			undoCmds.remove(cmd);
			
			redoMementos.remove(ms);
		} else {
			System.out.println("no command can redo ...");
		}
	}
}
