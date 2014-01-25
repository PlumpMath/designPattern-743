package designPattern.interpreter.example;

import java.util.ArrayList;
import java.util.Collection;

import org.w3c.dom.Element;

public class ElementExpression extends ReadXmlExpression{

	private Collection<ReadXmlExpression> elements = new ArrayList<ReadXmlExpression>();
	
	private String elementName="";
	
	public ElementExpression(String elementName) {
		this.elementName = elementName;
	}
	
	public boolean addElement(ReadXmlExpression element){
		return this.elements.add(element);
	}
	
	public boolean removeElement(ReadXmlExpression element) {
		return this.elements.remove(element);
	}
	@Override
	public String[] interpret(Context context) {
		Element parentElement = context.getPreElement();
		
		if(parentElement==null) {
			context.setPreElement(context.getDocument().getDocumentElement());
		} else{
			Element nowElement = context.getNowElement(parentElement, elementName);
			context.setPreElement(nowElement);
		}
		
		String [] ss = null;
		
		for(ReadXmlExpression element:elements){
			ss = element.interpret(context);
		}
		return ss;
	}

}
