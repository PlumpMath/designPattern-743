package designPattern.interpreter.example;

public class Client {

	public static void main(String[] args) throws Exception {
		Context context = new Context("InterpreterTest.xml");
		
		ElementExpression root = new ElementExpression("root");
		ElementExpression aElement = new ElementExpression("a");
		ElementExpression bElement = new ElementExpression("b");
		ElementTerminalExpression cElement = new ElementTerminalExpression("c");
				
		root.addElement(aElement);
		aElement.addElement(bElement);
		bElement.addElement(cElement);
		
		String ss[] = root.interpret(context);
		System.out.println("c value="+ss[0]);
		
		context.reInit();
		ss  = root.interpret(context);
		
		System.out.println("c value="+ss[0]);
	}

}
