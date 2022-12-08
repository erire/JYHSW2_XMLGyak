package hu.domparse.jyhsw2;
import org.xml.sax.SAXException;


import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException, TransformerException {
    	Scanner sc = new Scanner(System.in);
    	int exitMainMenu = 0;
    	int exitSubMenu = 0;
    	try {
			while (exitMainMenu != 1) {
				System.out.println("Menu Pontok \r 1. Tabla Olvasas \r 2. Lekerdezes \r 3. Adat Modositas \r"
						+ " 4. Kilepes");
				System.out.println("Valaszon: ");
				int valasztas_1 = sc.nextInt();
				switch (valasztas_1) {
				case 1:
					while (exitSubMenu != 1) {
						System.out.println("Meno pontok \r 1. Meresi Adatok \r 2. Mero Eszkoz \r 3. Szerelo "
								+ "\r 4. Telephely \r 5. Gyarto \r 6. Vezerigazgato \r 7. Kilepes \rValaszon: ");
					int valasztas_2 = sc.nextInt();
					switch (valasztas_2) {
					case 1:
						DomReadJYHSW2.Meresi_Adatok();
						break;
					case 2:
						DomReadJYHSW2.Mero_Eszkoz();
						break;
					case 3:
						DomReadJYHSW2.Szerelo();
						break;
					case 4:
						DomReadJYHSW2.Telephely();
						break;
					case 5:
						DomReadJYHSW2.Gyarto();
						break;
					case 6:
						DomReadJYHSW2.Vezerigazgato();
						break;
					case 7:
						exitSubMenu = 1;
						break;
					}
					}
					exitSubMenu = 0;
					break;
				case 2:
					while (exitSubMenu != 1) {
					System.out.println("Menu pontok \r 1. Elso meresi adat \r 2. Masodik Meresi adat"
							+ "\r 3. Utolso Meresi adat"
							+ "\r 4. 5-nel nagyobb homersekletu meresek adatai \r 5. "
							+ "5-nel kisebb homersekletu meresek adatai  \r 6. Kilepes \rValaszon: ");
					int valasztas_2 = sc.nextInt();
					switch (valasztas_2) {
					case 1:
						DOMQueryJYHSW2.main(1);
						break;
					case 2:
						DOMQueryJYHSW2.main(2);
						break;
					case 3:
						DOMQueryJYHSW2.main(3);
						break;
					case 4:
						DOMQueryJYHSW2.main(4);
						break;
					case 5:
						DOMQueryJYHSW2.main(5);
						break;
					case 6:
						exitSubMenu = 1;
						break;
					}
					}
					exitSubMenu = 0;
					break;
				case 3:
					while (exitSubMenu != 1) {
					System.out.println("Menu pontok \r 1. Meresi Adatok Modositasa"
							+ "\r 2. Mero Eszkoz Adatok Modositasa"
								+ "\r 3. Gyarto Adatok Modositasa"
								+ "\r 4.Telephely Adatok Modositasa "
								+ "\r 5. Szerelo Adatok Modositasa "
								+ "\r 6. Vezerigazgato Adatok Modositasa "
								+ "\r 7. Kilepes \rValaszon: ");
					int valasztas_2 = sc.nextInt();
					switch (valasztas_2) {
					case 1:
						DOMModifyJYHSW2.Meresi_Adatok();
						break;
					case 2:
						DOMModifyJYHSW2.Mero_Eszkoz();
						break;
					case 3:
						DOMModifyJYHSW2.Gyarto();
						break;
					case 4:
						DOMModifyJYHSW2.Telephely();
						break;
					case 5:
						DOMModifyJYHSW2.Szerelo();
						break;
					case 6:
						DOMModifyJYHSW2.Vezerigazgato();
						break;
					case 7:
						exitSubMenu = 1;
						break;
					}
					}
					exitSubMenu = 0;
					break;
				case 4:
					exitMainMenu = 1;
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
    }
}