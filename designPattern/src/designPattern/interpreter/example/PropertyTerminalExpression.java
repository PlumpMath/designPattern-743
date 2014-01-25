package designPattern.interpreter.example;


public class PropertyTerminalExpression extends ReadXmlExpression{

	private String propertyName="";
	
	public PropertyTerminalExpression(String propertyName) {
		this.propertyName = propertyName;
	}

	@Override
	public String[] interpret(Context context) {
		
		String[] ss= new String[1];

		ss[0] = context.getPreElement().getAttribute(this.propertyName);
		return ss;
	}

}
