package designPattern.interpreter.example;

import org.w3c.dom.Element;

public class ElementTerminalExpression extends ReadXmlExpression{

	private String elementName="";
	
	public ElementTerminalExpression(String elementName) {
		this.elementName = elementName;
	}

	@Override
	public String[] interpret(Context context) {
		
		Element parentElement = context.getPreElement();
	
		Element element = null;
		
		if(parentElement==null) {
			element = context.getDocument().getDocumentElement();
			context.setPreElement(element);
		} else {
			element = context.getNowElement(parentElement, elementName);
			context.setPreElement(element);
		}
		
		String[] ss= new String[1];

		ss[0] = element.getFirstChild().getNodeValue();
		return ss;
	}

}
