package designPattern.interpreter.example;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Context {
	private Element preElement = null;
	
	private Document document = null;
	
	public Context(String filePathName) throws Exception {
		this.document = XmlUtil.getRoot(filePathName);
	}
	
	public void reInit(){
		preElement = null;
	}
	
	public Element getNowElement(Element parentElement,String elementName)
	{
		NodeList tempNodeList = parentElement.getChildNodes();
		for(int i=0; i<tempNodeList.getLength();i++) {
			if(tempNodeList.item(i) instanceof Element) {
				Element nowElement = (Element) tempNodeList.item(i);
				if(nowElement.getTagName().equals(elementName)){
					return nowElement;
				}
			}
		}
		return null;
	}
	
	public Element getPreElement(){
		return preElement;
	}
	
	public Document getDocument(){
		return document;
	}

	public void setPreElement(Element preElement) {
		this.preElement = preElement;
	}
}
