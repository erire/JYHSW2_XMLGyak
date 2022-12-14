package SaxJYHSW21019;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxJYHSW2 {
	public static void main(String[] args) {
		try {
			SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
			
			SAXParser saxParser = saxParserFactory.newSAXParser();
			
			SaxHandler handler = new SaxHandler();
			
			saxParser.parse(new File("kurzusfelvetell.xml"), handler);
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public class SaxHandler extends DefaultHandler {
		private int indent = 0;
		
		private String formatAttributes(Attributes attributes) {
			int attrLength = attributes.getLength();
			if (attrLength == 0) {
				return "";
			}
			StringBuilder sb = new StringBuilder(", (");
			for (int i = 0; i < attrLength; i++) {
				sb.append(attributes.getLocalName(i) + "=" + attributes.getValue(i));
				if (i < attrLength - 1) {
					sb.append(", ");
				}
			}
		}
	}
}
