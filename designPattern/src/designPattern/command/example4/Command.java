package designPattern.command.example4;

public interface Command {
	public void execute();
	
	public void setCookApi(CookApi cookApi);
	
	public int getTableNum();
}
