package hu.domparse.jyhsw2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.sun.tools.javac.Main;

public class DomReadJYHSW2 {
	private static File xmlFile = new File("XMLJYHSW2.xml");

	private static DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

	public static void Meresi_Adatok() throws SAXException,
    IOException, ParserConfigurationException, TransformerException {
		DocumentBuilder dBuilder = factory.newDocumentBuilder();

		Document doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();

		File myObj = new File("Meresi_Adatok.txt");
		FileWriter myWriter = new FileWriter("Meresi_Adatok.txt");
		String element = "\nCurrent Element: ";

		NodeList nList = doc.getElementsByTagName("Meresi_Adatok");
		for (int i = 0;i < nList.getLength();i++){
			Node nNode = nList.item(i);

			System.out.println(element + nNode.getNodeName());
			myWriter.write(element + nNode.getNodeName());

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
				myWriter.write("\rKulcs: " + uid);
				System.out.println("Homerseklet: " + hname);
				myWriter.write("\rHomerseklet: " + hname);
				System.out.println("Szollo por: " + szname);
				myWriter.write("\rSzollo por: " + szname);
				System.out.println("CO: " + COname);
				myWriter.write("\rCO: " + COname);
				System.out.println("Paratartalom: " + pname);
				myWriter.write("\rParatartalom: " + pname);
			}
		}
		myWriter.close();
	}
	public static void Mero_Eszkoz() throws SAXException,
    IOException, ParserConfigurationException {
		DocumentBuilder dBuilder = factory.newDocumentBuilder();

		Document doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();
		
		File myObj = new File("Mero_Eszkoz.txt");
		FileWriter myWriter = new FileWriter("Mero_Eszkoz.txt");
		String element = "\nCurrent Element: ";
		
		NodeList nList = doc.getElementsByTagName("Mero_Eszkoz");
		for (int i = 0;i < nList.getLength();i++){
			Node nNode = nList.item(i);

			System.out.println(element + nNode.getNodeName());

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
				myWriter.write("\rKulcs: " + uid);
				System.out.println("Tipus: " + tipus);
				myWriter.write("\rTipus:" + tipus);
				System.out.println("Cim: " + cim);
				myWriter.write("\rCim: " + cim);
				System.out.println("Gyartas Ido: " + Gyido);
				myWriter.write("\rGyartas Ido: " + Gyido);
			}
		}
		myWriter.close();
	}
	public static void Gyarto() throws SAXException,
    IOException, ParserConfigurationException {
		DocumentBuilder dBuilder = factory.newDocumentBuilder();

		Document doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();
		
		File myObj = new File("Gyarto.txt");
		FileWriter myWriter = new FileWriter("Gyarto.txt");
		String element = "\nCurrent Element: ";


		NodeList nList = doc.getElementsByTagName("Gyarto");
		for (int i = 0;i < nList.getLength();i++){
			Node nNode = nList.item(i);

			System.out.println(element + nNode.getNodeName());

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
				myWriter.write("\rKulcs: " + uid);
				System.out.println("Ceg neve: " + cegnev);
				myWriter.write("\rCeg neve: " + cegnev);
				System.out.println("Telefonszam: " + telefon);
				myWriter.write("\rTelefonszam: " + telefon);
				System.out.println("Email: " + email);
				myWriter.write("\rEmail: " + email);
				System.out.println("Cim: " + cim);
				myWriter.write("\rCim: " + cim);
			}
		}
		myWriter.close();
	}
	
	public static void Telephely() throws SAXException,
    IOException, ParserConfigurationException {
		DocumentBuilder dBuilder = factory.newDocumentBuilder();

		Document doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();
		
		File myObj = new File("Telephely.txt");
		FileWriter myWriter = new FileWriter("Telephely.txt");
		String element = "\nCurrent Element: ";


		NodeList nList = doc.getElementsByTagName("Telephely");
		for (int i = 0;i < nList.getLength();i++){
			Node nNode = nList.item(i);

			System.out.println(element + nNode.getNodeName());

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
				myWriter.write("\rKulcs: " + uid);
				System.out.println("Telefonszam: " + telefon);
				myWriter.write("\rTelefonszam: " + telefon);
				System.out.println("Email: " + email);
				myWriter.write("\rEmail: " + email);
				System.out.println("Cim: " + cim);
				myWriter.write("\rCim: " + cim);
			}
		}
		myWriter.close();
	}
	public static void Szerelo() throws SAXException,
    IOException, ParserConfigurationException {
		DocumentBuilder dBuilder = factory.newDocumentBuilder();

		Document doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();
		
		File myObj = new File("Szerelo.txt");
		FileWriter myWriter = new FileWriter("Szerelo.txt");
		String element = "\nCurrent Element: ";

		NodeList nList = doc.getElementsByTagName("Szerelo");
		for (int i = 0;i < nList.getLength();i++){
			Node nNode = nList.item(i);

			System.out.println(element + nNode.getNodeName());

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
				myWriter.write("\rKulcs: " + uid);
				System.out.println("Nev: " + nev);
				myWriter.write("\rNev: " + nev);
				System.out.println("Kereset: " + keres);
				myWriter.write("\rKereset: " + keres);
				System.out.println("Hatar ido: " + hatarido);
				myWriter.write("\rHatar ido: " + hatarido);
			}
		}
		myWriter.close();
	}
	public static void Vezerigazgato() throws SAXException,
    IOException, ParserConfigurationException {
		DocumentBuilder dBuilder = factory.newDocumentBuilder();

		Document doc = dBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();
		
		File myObj = new File("Vezerigazgato.txt");
		FileWriter myWriter = new FileWriter("Vezerigazgato.txt");
		String element = "\nCurrent Element: ";


		NodeList nList = doc.getElementsByTagName("Vezerigazgato");
		for (int i = 0;i < nList.getLength();i++){
			Node nNode = nList.item(i);

			System.out.println(element + nNode.getNodeName());

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element elem = (Element) nNode;
				String uid = elem.getAttribute("VID");
				
				Node node = elem.getElementsByTagName("nev").item(0);
				String nev = node.getTextContent();
				
				Node node2 = elem.getElementsByTagName("fizettseg").item(0);
				String fizettseg = node2.getTextContent();
				
				Node node3 = elem.getElementsByTagName("szuletesi_datum").item(0);
				String szul = node3.getTextContent();
				
				System.out.println("Kulcs: " + uid);
				myWriter.write("\rKulcs: " + uid);
				System.out.println("nev: " + nev);
				myWriter.write("\rnev: " + nev);
				System.out.println("fizettseg: " + fizettseg);
				myWriter.write("\rfizettseg: " + fizettseg);
				System.out.println("szuletesi_datum: " + szul);
				myWriter.write("\rszuletesi_datum: " + szul);
			}
		}
		myWriter.close();
	}
}
