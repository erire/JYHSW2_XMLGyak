package hu.domparse.jyhsw2;

import java.io.File;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMModifyJYHSW2 {
	static Scanner sc = new Scanner(System.in);
	static String filePath = "C:\\Users\\Ede\\eclipse-workspace\\DomParseJYHSW2\\meres.xml";
	static File inputFile = new File("meres.xml");
	static DocumentBuilderFactory dbFactory = 
            DocumentBuilderFactory.newInstance();
	public static void Meresi_Adatok() {
	     try {

		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

		Document document = dBuilder.parse(inputFile);

		Node students = 
                    document.getElementsByTagName("Meresi_Adatok").item(0);
		
		System.out.println("Adja meg az uj homersekletet: ");
		String homer = sc.nextLine();
		System.out.println("Adja meg az uj Szallo port: ");
		String szallo = sc.nextLine();
		System.out.println("Adja meg az uj CO-t: ");
		String CO = sc.nextLine();
		System.out.println("Adja meg az uj Paratartalmat: ");
		String para = sc.nextLine();
		
		NamedNodeMap attr = students.getAttributes();
		Node nodeAttr = attr.getNamedItem("kulcs");
		System.out.println("Adja meg az ID-t: ");
		int kulcs = sc.nextInt();

		NodeList list = students.getChildNodes();
		
		
		
		NodeList nList = document.getElementsByTagName("Meresi_Adatok");
		for (int i = 0;i < nList.getLength();i++){
			Node nNode = nList.item(i);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				 Element Element = (Element) nNode;
				if (i+1 == kulcs) {
					Node node1 = Element.getElementsByTagName("homerseklet").item(0);
					node1.setTextContent(homer);
					Node node2 = Element.getElementsByTagName("szallopor").item(0);
					node2.setTextContent(szallo);
					Node node3 = Element.getElementsByTagName("CO").item(0);
					node3.setTextContent(CO);
					Node node4 = Element.getElementsByTagName("Paratartalom").item(0);
					node4.setTextContent(para);
				}
			}
		}


		TransformerFactory transformerFactory = 
			          TransformerFactory.newInstance();
		Transformer transformer=
                              transformerFactory.newTransformer();
		DOMSource source = new DOMSource(document);
		StreamResult result=new StreamResult(new File(filePath));
		transformer.transform(source, result);

	      } catch (Exception e) {
		   e.printStackTrace();
	   }
	}
	public static void Mero_Eszkoz() {
	     try {

		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

		Document document = dBuilder.parse(inputFile);

		Node students = 
                   document.getElementsByTagName("Mero_Eszkoz").item(0);
		
		System.out.println("Adja meg az uj tipust: ");
		String tip = sc.nextLine();
		System.out.println("Adja meg az uj iranyito szamot: ");
		String irany = sc.nextLine();
		System.out.println("Adja meg az uj telepulest: ");
		String telep = sc.nextLine();
		System.out.println("Adja meg az uj utcat: ");
		String utca = sc.nextLine();
		System.out.println("Adja meg az uj hazszamot: ");
		String hazszam = sc.nextLine();
		System.out.println("Adja meg az uj gyartas idot: ");
		String gyartido = sc.nextLine();
		
		NamedNodeMap attr = students.getAttributes();
		Node nodeAttr = attr.getNamedItem("kulcs");
		System.out.println("Adja meg az ID-t: ");
		int kulcs = sc.nextInt();

		NodeList list = students.getChildNodes();
		
		
		
		NodeList nList = document.getElementsByTagName("Mero_Eszkoz");
		for (int i = 0;i < nList.getLength();i++){
			Node nNode = nList.item(i);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				 Element Element = (Element) nNode;
				if (i+1 == kulcs) {
					Node node1 = Element.getElementsByTagName("tipus").item(0);
					node1.setTextContent(tip);
					Node node2 = Element.getElementsByTagName("iranyito_szam").item(0);
					node2.setTextContent(irany);
					Node node3 = Element.getElementsByTagName("telepules").item(0);
					node3.setTextContent(telep);
					Node node4 = Element.getElementsByTagName("utca").item(0);
					node4.setTextContent(utca);
					Node node5 = Element.getElementsByTagName("hazszam").item(0);
					node5.setTextContent(hazszam);
					Node node6 = Element.getElementsByTagName("gyartas_ido").item(0);
					node6.setTextContent(gyartido);
				}
			}
		}


		TransformerFactory transformerFactory = 
			          TransformerFactory.newInstance();
		Transformer transformer=
                             transformerFactory.newTransformer();
		DOMSource source = new DOMSource(document);
		StreamResult result=new StreamResult(new File(filePath));
		transformer.transform(source, result);

	      } catch (Exception e) {
		   e.printStackTrace();
	   }
	}
	public static void Gyarto() {
	     try {

		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

		Document document = dBuilder.parse(inputFile);

		Node students = 
                  document.getElementsByTagName("Gyarto").item(0);
		
		System.out.println("Adja meg az uj Ceg nevet: ");
		String cegnev = sc.nextLine();
		System.out.println("Adja meg az uj Telefonszamot: ");
		String telefonszam = sc.nextLine();
		System.out.println("Adja meg az uj emailt: ");
		String email = sc.nextLine();
		System.out.println("Adja meg az uj iranyito szamot: ");
		String irany = sc.nextLine();
		System.out.println("Adja meg az uj telepulest: ");
		String telep = sc.nextLine();
		System.out.println("Adja meg az uj utcat: ");
		String utca = sc.nextLine();
		System.out.println("Adja meg az uj hazszamot: ");
		String hazszam = sc.nextLine();
		
		NamedNodeMap attr = students.getAttributes();
		Node nodeAttr = attr.getNamedItem("kulcs");
		System.out.println("Adja meg az ID-t: ");
		int kulcs = sc.nextInt();

		NodeList list = students.getChildNodes();
		
		
		
		NodeList nList = document.getElementsByTagName("Gyarto");
		for (int i = 0;i < nList.getLength();i++){
			Node nNode = nList.item(i);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				 Element Element = (Element) nNode;
				if (i+1 == kulcs) {
					Node node1 = Element.getElementsByTagName("Cegnev").item(0);
					node1.setTextContent(cegnev);
					Node node6 = Element.getElementsByTagName("telefonszam").item(0);
					node6.setTextContent(telefonszam);
					Node node7 = Element.getElementsByTagName("email").item(0);
					node7.setTextContent(email);
					Node node2 = Element.getElementsByTagName("iranyito_szam").item(0);
					node2.setTextContent(irany);
					Node node3 = Element.getElementsByTagName("telepules").item(0);
					node3.setTextContent(telep);
					Node node4 = Element.getElementsByTagName("utca").item(0);
					node4.setTextContent(utca);
					Node node5 = Element.getElementsByTagName("hazszam").item(0);
					node5.setTextContent(hazszam);
				}
			}
		}


		TransformerFactory transformerFactory = 
			          TransformerFactory.newInstance();
		Transformer transformer=
                            transformerFactory.newTransformer();
		DOMSource source = new DOMSource(document);
		StreamResult result=new StreamResult(new File(filePath));
		transformer.transform(source, result);

	      } catch (Exception e) {
		   e.printStackTrace();
	   }
	}
	public static void Telephely() {
	     try {

		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

		Document document = dBuilder.parse(inputFile);

		Node students = 
                 document.getElementsByTagName("Telephely").item(0);
		
		System.out.println("Adja meg az uj Telefonszamot: ");
		String telefonszam = sc.nextLine();
		System.out.println("Adja meg az uj emailt: ");
		String email = sc.nextLine();
		System.out.println("Adja meg az uj iranyito szamot: ");
		String irany = sc.nextLine();
		System.out.println("Adja meg az uj telepulest: ");
		String telep = sc.nextLine();
		System.out.println("Adja meg az uj utcat: ");
		String utca = sc.nextLine();
		System.out.println("Adja meg az uj hazszamot: ");
		String hazszam = sc.nextLine();
		
		NamedNodeMap attr = students.getAttributes();
		Node nodeAttr = attr.getNamedItem("kulcs");
		System.out.println("Adja meg az ID-t: ");
		int kulcs = sc.nextInt();

		NodeList list = students.getChildNodes();
		
		
		
		NodeList nList = document.getElementsByTagName("Telephely");
		for (int i = 0;i < nList.getLength();i++){
			Node nNode = nList.item(i);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				 Element Element = (Element) nNode;
				if (i+1 == kulcs) {
					Node node6 = Element.getElementsByTagName("telefonszam").item(0);
					node6.setTextContent(telefonszam);
					Node node7 = Element.getElementsByTagName("email").item(0);
					node7.setTextContent(email);
					Node node2 = Element.getElementsByTagName("iranyito_szam").item(0);
					node2.setTextContent(irany);
					Node node3 = Element.getElementsByTagName("telepules").item(0);
					node3.setTextContent(telep);
					Node node4 = Element.getElementsByTagName("utca").item(0);
					node4.setTextContent(utca);
					Node node5 = Element.getElementsByTagName("hazszam").item(0);
					node5.setTextContent(hazszam);
				}
			}
		}


		TransformerFactory transformerFactory = 
			          TransformerFactory.newInstance();
		Transformer transformer=
                           transformerFactory.newTransformer();
		DOMSource source = new DOMSource(document);
		StreamResult result=new StreamResult(new File(filePath));
		transformer.transform(source, result);

	      } catch (Exception e) {
		   e.printStackTrace();
	   }
	}
	public static void Szerelo() {
	     try {

		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

		Document document = dBuilder.parse(inputFile);

		Node students = 
                document.getElementsByTagName("Szerelo").item(0);
		
		System.out.println("Adja meg az uj nevet: ");
		String nev = sc.nextLine();
		System.out.println("Adja meg az uj Fizetest: ");
		String kereset = sc.nextLine();
		System.out.println("Adja meg az uj javitasi hataridot: ");
		String javitIdo = sc.nextLine();
		
		NamedNodeMap attr = students.getAttributes();
		Node nodeAttr = attr.getNamedItem("kulcs");
		System.out.println("Adja meg az ID-t: ");
		int kulcs = sc.nextInt();

		NodeList list = students.getChildNodes();
		
		
		
		NodeList nList = document.getElementsByTagName("Szerelo");
		for (int i = 0;i < nList.getLength();i++){
			Node nNode = nList.item(i);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				 Element Element = (Element) nNode;
				if (i+1 == kulcs) {
					Node node1 = Element.getElementsByTagName("nev").item(0);
					node1.setTextContent(nev);
					Node node2 = Element.getElementsByTagName("kereset").item(0);
					node2.setTextContent(kereset);
					Node node3 = Element.getElementsByTagName("javitas_hatarido").item(0);
					node3.setTextContent(javitIdo);
				}
			}
		}


		TransformerFactory transformerFactory = 
			          TransformerFactory.newInstance();
		Transformer transformer=
                          transformerFactory.newTransformer();
		DOMSource source = new DOMSource(document);
		StreamResult result=new StreamResult(new File(filePath));
		transformer.transform(source, result);

	      } catch (Exception e) {
		   e.printStackTrace();
	   }
	}
}
