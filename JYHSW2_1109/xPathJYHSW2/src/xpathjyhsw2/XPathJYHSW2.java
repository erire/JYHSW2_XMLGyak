package xpathjyhsw2;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.xml.sax.SAXException;

public class XPathJYHSW2 {

	public static void main(String[] args) {
		
	try {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		
		Document document = documentBuilder.parse("studentJYHSW2.xml");
		
		document.getDocumentElement().normalize();
		
		XPath xPath = XPathFactory.newInstance().newXPath();
		
		
		XPathExpression expr1 = xPath.compile("/Class/Student");
		NodeList nodeList = (NodeList) expr1.evaluate(document, XPathConstants.NODESET);
		
		XPathExpression expr2 = xPath.compile("/Class/Student[id=02]");
		NodeList nodeList2 = (NodeList) expr2.evaluate(document, XPathConstants.NODESET);
		
		XPathExpression expr3 = xPath.compile("/Class/Student[*]");
		NodeList nodeList3 = (NodeList) expr3.evaluate(document, XPathConstants.NODESET);
		
		XPathExpression expr4 = xPath.compile("/Class/Student[firt()+1]");
		NodeList nodeList4 = (NodeList) expr4.evaluate(document, XPathConstants.NODESET);
		
		XPathExpression expr5 = xPath.compile("/Class/Student[last()]");
		NodeList nodeList5 = (NodeList) expr5.evaluate(document, XPathConstants.NODESET);
		
		XPathExpression expr6 = xPath.compile("/Class/Student[last()-1]");
		NodeList nodeList6 = (NodeList) expr6.evaluate(document, XPathConstants.NODESET);
		
		XPathExpression expr7 = xPath.compile("/Class/Student[position()<3]");
		NodeList nodeList7 = (NodeList) expr7.evaluate(document, XPathConstants.NODESET);
		
		XPathExpression expr8 = xPath.compile("/Class");
		NodeList nodeList8 = (NodeList) expr8.evaluate(document, XPathConstants.NODESET);
		
		XPathExpression expr9 = xPath.compile("/Class");
		NodeList nodeList9 = (NodeList) expr9.evaluate(document, XPathConstants.NODESET);
		
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			
			System.out.println("\nAktualis elem: " + node.getNodeName());
			
			if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("student")) {
				Element element = (Element) node;
				
				System.out.println("Hallgatoi ID: " + element.getAttribute("id"));
				
				System.out.println("Keresztnev: " + element.getElementsByTagName("keresztnev").item(0).getTextContent());
				
				System.out.println("Vezeteknev: " + element.getElementsByTagName("vezeteknev").item(0).getTextContent());
				
				System.out.println("Becenev: " + element.getElementsByTagName("becenev").item(0).getTextContent());
				
				System.out.println("Kor: " + element.getElementsByTagName("kor").item(0).getTextContent());
			}
		}
	} catch (ParserConfigurationException e) {
		e.printStackTrace();
	} catch (SAXException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (XPathExpressionException e) {
		e.printStackTrace();
	}
	

	}

}
