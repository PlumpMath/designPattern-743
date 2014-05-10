package designPattern.command.example;

public class Client {
	public static void main(String[] args) {
		
		MainBoardApi mainBoard = new GigaMainBoard();
		OpenCommand openCommand = new OpenCommand(mainBoard);
		
		Box box = new Box();
		box.setOpenCommand(openCommand);
		
		box.openButtonPressed();
		
	}
}
