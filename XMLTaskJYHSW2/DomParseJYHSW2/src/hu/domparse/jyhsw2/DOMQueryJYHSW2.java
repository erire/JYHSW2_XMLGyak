package hu.domparse.jyhsw2;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMQueryJYHSW2 {
	static DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
	
	public static void main(int lekerd) {
		
		try {
			
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse("meres.xml");
			
			document.getDocumentElement().normalize();
			
			XPath xPath = XPathFactory.newInstance().newXPath();
			System.out.println("lekerd: " + lekerd);
			switch (lekerd) {
			case 1: {
				XPathExpression expr = xPath.compile("/Meresek/Meresi_Adatok[1]");
				NodeList nodeList = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
				for (int i = 0; i < nodeList.getLength(); i++) {
					Node node = nodeList.item(i);
					
					System.out.println("\nAktualis elem: " + node.getNodeName());
					
					if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("Meresi_Adatok")) {
						Element element = (Element) node;
						
						System.out.println("ID: " + element.getAttribute("kulcs"));
						
						System.out.println("Homerseklet: " + element.getElementsByTagName("homerseklet").item(0).getTextContent());
						
						System.out.println("Szallo por: " + element.getElementsByTagName("szallopor").item(0).getTextContent());
						
						System.out.println("CO: " + element.getElementsByTagName("CO").item(0).getTextContent());
						
						System.out.println("Paratartalom: " + element.getElementsByTagName("Paratartalom").item(0).getTextContent());
					}
				}
				break;
			}
			case 2: {
				XPathExpression expr = xPath.compile("/Meresek/Meresi_Adatok[2]");
				NodeList nodeList = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
				for (int i = 0; i < nodeList.getLength(); i++) {
					Node node = nodeList.item(i);
					
					System.out.println("\nAktualis elem: " + node.getNodeName());
					
					if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("Meresi_Adatok")) {
						Element element = (Element) node;
						
						System.out.println("ID: " + element.getAttribute("kulcs"));
						
						System.out.println("Homerseklet: " + element.getElementsByTagName("homerseklet").item(0).getTextContent());
						
						System.out.println("Szallo por: " + element.getElementsByTagName("szallopor").item(0).getTextContent());
						
						System.out.println("CO: " + element.getElementsByTagName("CO").item(0).getTextContent());
						
						System.out.println("Paratartalom: " + element.getElementsByTagName("Paratartalom").item(0).getTextContent());
					}
				}
				break;
			}
			case 3: {
				XPathExpression expr = xPath.compile("/Meresek/Meresi_Adatok[last()]");
				NodeList nodeList = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
				for (int i = 0; i < nodeList.getLength(); i++) {
					Node node = nodeList.item(i);
					
					System.out.println("\nAktualis elem: " + node.getNodeName());
					
					if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("Meresi_Adatok")) {
						Element element = (Element) node;
						
						System.out.println("ID: " + element.getAttribute("kulcs"));
						
						System.out.println("Homerseklet: " + element.getElementsByTagName("homerseklet").item(0).getTextContent());
						
						System.out.println("Szallo por: " + element.getElementsByTagName("szallopor").item(0).getTextContent());
						
						System.out.println("CO: " + element.getElementsByTagName("CO").item(0).getTextContent());
						
						System.out.println("Paratartalom: " + element.getElementsByTagName("Paratartalom").item(0).getTextContent());
					}
				}
				break;
			}
			case 4: {
				XPathExpression expr = xPath.compile("/Meresek/Meresi_Adatok[homerseklet>5]");
				NodeList nodeList = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
				for (int i = 0; i < nodeList.getLength(); i++) {
					Node node = nodeList.item(i);
					
					System.out.println("\nAktualis elem: " + node.getNodeName());
					
					if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("Meresi_Adatok")) {
						Element element = (Element) node;
						
						System.out.println("ID: " + element.getAttribute("kulcs"));
						
						System.out.println("Homerseklet: " + element.getElementsByTagName("homerseklet").item(0).getTextContent());
						
						System.out.println("Szallo por: " + element.getElementsByTagName("szallopor").item(0).getTextContent());
						
						System.out.println("CO: " + element.getElementsByTagName("CO").item(0).getTextContent());
						
						System.out.println("Paratartalom: " + element.getElementsByTagName("Paratartalom").item(0).getTextContent());
					}
				}
				break;
			}
			case 5: {
				XPathExpression expr = xPath.compile("/Meresek/Meresi_Adatok[homerseklet<5]");
				NodeList nodeList = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
				for (int i = 0; i < nodeList.getLength(); i++) {
					Node node = nodeList.item(i);
					
					System.out.println("\nAktualis elem: " + node.getNodeName());
					
					if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("Meresi_Adatok")) {
						Element element = (Element) node;
						
						System.out.println("ID: " + element.getAttribute("kulcs"));
						
						System.out.println("Homerseklet: " + element.getElementsByTagName("homerseklet").item(0).getTextContent());
						
						System.out.println("Szallo por: " + element.getElementsByTagName("szallopor").item(0).getTextContent());
						
						System.out.println("CO: " + element.getElementsByTagName("CO").item(0).getTextContent());
						
						System.out.println("Paratartalom: " + element.getElementsByTagName("Paratartalom").item(0).getTextContent());
					}
				}
				break;
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
