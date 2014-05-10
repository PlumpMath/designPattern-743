package designPattern.command.example2;

public class Client {

	public static void main(String[] args) {
		OperationApi operation = new Operation();
		AddCommand addCmd = new AddCommand(operation,5);
		SubstractCommand substractCmd = new SubstractCommand(operation, 3);
		
		
		Calculator calculator = new Calculator();
		calculator.setAddCmd(addCmd);
		calculator.setSubstractCmd(substractCmd);
		
		calculator.addPressed();
		System.out.println(operation.getResult());
		
		calculator.substractPressed();
		System.out.println(operation.getResult());
		
		calculator.undoPressed();
		System.out.println(operation.getResult());
		
		calculator.undoPressed();
		System.out.println(operation.getResult());
		
		calculator.redoPressed();
		System.out.println(operation.getResult());
		
		calculator.redoPressed();
		System.out.println(operation.getResult());
	}

}
