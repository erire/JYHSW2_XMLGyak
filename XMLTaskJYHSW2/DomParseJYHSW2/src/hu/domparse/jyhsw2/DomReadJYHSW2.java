package hu.domparse.jyhsw2;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.sun.tools.javac.Main;

public class DomReadJYHSW2 {
	private static File xmlFile = new File("meres.xml");

	private static DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

	public static void Meresi_Adatok() throws SAXException,
    IOException, ParserConfigurationException {
		DocumentBuilder dBuilder = factory.newDocumentBuilder();

		Document doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();

		//System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

		NodeList nList = doc.getElementsByTagName("Meresi_Adatok");
		for (int i = 0;i < nList.getLength();i++){
			Node nNode = nList.item(i);

			System.out.println("\nCurrent Element: " + nNode.getNodeName());

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element elem = (Element) nNode;
				String uid = elem.getAttribute("kulcs");

				Node node1 = elem.getElementsByTagName("homerseklet").item(0);
				String hname = node1.getTextContent();

				Node node2 = elem.getElementsByTagName("szallopor").item(0);
				String szname = node2.getTextContent();

				Node node3 = elem.getElementsByTagName("CO").item(0);
				String COname = node3.getTextContent();
				
				Node node4 = elem.getElementsByTagName("Paratartalom").item(0);
				String pname = node4.getTextContent();

				System.out.println("Kulcs: " + uid);
				System.out.println("Homerseklet: " + hname);
				System.out.println("Szollo por: " + szname);
				System.out.println("CO: " + COname);
				System.out.println("Paratartalom: " + pname);
			}
		}
	}
	public static void Mero_Eszkoz() throws SAXException,
    IOException, ParserConfigurationException {
		DocumentBuilder dBuilder = factory.newDocumentBuilder();

		Document doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();


		NodeList nList = doc.getElementsByTagName("Mero_Eszkoz");
		for (int i = 0;i < nList.getLength();i++){
			Node nNode = nList.item(i);

			System.out.println("\nCurrent Element: " + nNode.getNodeName());

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element elem = (Element) nNode;
				String uid = elem.getAttribute("kulcs");

				Node node1 = elem.getElementsByTagName("tipus").item(0);
				String tipus = node1.getTextContent();

				Node node2 = elem.getElementsByTagName("cim").item(0);
				String cim = node2.getTextContent();

				Node node3 = elem.getElementsByTagName("gyartas_ido").item(0);
				String Gyido = node3.getTextContent();

				System.out.println("Kulcs: " + uid);
				System.out.println("Tipus: " + tipus);
				System.out.println("Cim: " + cim);
				System.out.println("Gyartas Ido: " + Gyido);
			}
		}
	}
	public static void Gyarto() throws SAXException,
    IOException, ParserConfigurationException {
		DocumentBuilder dBuilder = factory.newDocumentBuilder();

		Document doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();


		NodeList nList = doc.getElementsByTagName("Gyarto");
		for (int i = 0;i < nList.getLength();i++){
			Node nNode = nList.item(i);

			System.out.println("\nCurrent Element: " + nNode.getNodeName());

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element elem = (Element) nNode;
				String uid = elem.getAttribute("kulcs");

				Node node1 = elem.getElementsByTagName("Cegnev").item(0);
				String cegnev = node1.getTextContent();

				Node node2 = elem.getElementsByTagName("telefonszam").item(0);
				String telefon = node2.getTextContent();

				Node node3 = elem.getElementsByTagName("email").item(0);
				String email = node3.getTextContent();
				
				Node node4 = elem.getElementsByTagName("cim").item(0);
				String cim = node4.getTextContent();

				System.out.println("Kulcs: " + uid);
				System.out.println("Ceg neve: " + cegnev);
				System.out.println("Telefonszam: " + telefon);
				System.out.println("Email: " + email);
				System.out.println("Cim: " + cim);
			}
		}
	}
	
	public static void Telephely() throws SAXException,
    IOException, ParserConfigurationException {
		DocumentBuilder dBuilder = factory.newDocumentBuilder();

		Document doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();


		NodeList nList = doc.getElementsByTagName("Telephely");
		for (int i = 0;i < nList.getLength();i++){
			Node nNode = nList.item(i);

			System.out.println("\nCurrent Element: " + nNode.getNodeName());

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element elem = (Element) nNode;
				String uid = elem.getAttribute("kulcs");

				Node node2 = elem.getElementsByTagName("telefonszam").item(0);
				String telefon = node2.getTextContent();

				Node node3 = elem.getElementsByTagName("email").item(0);
				String email = node3.getTextContent();
				
				Node node4 = elem.getElementsByTagName("cim").item(0);
				String cim = node4.getTextContent();

				System.out.println("Kulcs: " + uid);
				System.out.println("Telefonszam: " + telefon);
				System.out.println("Email: " + email);
				System.out.println("Cim: " + cim);
			}
		}
	}
	public static void Szerelo() throws SAXException,
    IOException, ParserConfigurationException {
		DocumentBuilder dBuilder = factory.newDocumentBuilder();

		Document doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();


		NodeList nList = doc.getElementsByTagName("Szerelo");
		for (int i = 0;i < nList.getLength();i++){
			Node nNode = nList.item(i);

			System.out.println("\nCurrent Element: " + nNode.getNodeName());

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element elem = (Element) nNode;
				String uid = elem.getAttribute("kulcs");

				Node node = elem.getElementsByTagName("nev").item(0);
				String nev = node.getTextContent();

				Node node2 = elem.getElementsByTagName("kereset").item(0);
				String keres = node2.getTextContent();
				
				Node node3 = elem.getElementsByTagName("javitas_hatarido").item(0);
				String hatarido = node3.getTextContent();

				System.out.println("Kulcs: " + uid);
				System.out.println("Nev: " + nev);
				System.out.println("Kereset: " + keres);
				System.out.println("Hatar ido: " + hatarido);
			}
		}
	}
	public static void Karbantartas() throws SAXException,
    IOException, ParserConfigurationException {
		DocumentBuilder dBuilder = factory.newDocumentBuilder();

		Document doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();


		NodeList nList = doc.getElementsByTagName("Karbantartas");
		for (int i = 0;i < nList.getLength();i++){
			Node nNode = nList.item(i);

			System.out.println("\nCurrent Element: " + nNode.getNodeName());

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element elem = (Element) nNode;
				Node node = elem.getElementsByTagName("Datum").item(0);
				String datum = node.getTextContent();
				System.out.println("Datum: " + datum);
			}
		}
	}
}
