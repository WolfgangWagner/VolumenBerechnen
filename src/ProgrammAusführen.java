import java.util.Scanner;

public class ProgrammAusf�hren {

	public void programmAusfuehren() {
		boolean weitermachen = true;
		
		do {
		
		System.out.println("Wollen Sie das Volumen eines Zylinders (1), eines Kegels (2), einer Pyramide (3) oder eines Oktaeders (4) berechnen?");
		Scanner sc4 = new Scanner(System.in);
		int welchenKoerperBerechnen = sc4.nextInt();
		
		if (welchenKoerperBerechnen == 1) {
			Zylinder zylinder1 = new Zylinder();
			zylinder1.ma�eEinlesen();
			System.out.println("Das Volumen des Zylinders betr�gt: " + zylinder1.volumenZylinder() + " cm�.");
		}
		else if (welchenKoerperBerechnen == 2) {
			Kegel kegel1 = new Kegel();
			kegel1.ma�eEinlesen();
			System.out.println("Das Volumen des Zylinders betr�gt: " + kegel1.volumenKegel() + " cm�.");
		}
		else if (welchenKoerperBerechnen == 3) {
			Pyramide pyramide1 = new Pyramide();
			pyramide1.ma�eEinlesen();
			System.out.println("Das Volumen der Pyramide betr�gt: " + pyramide1.volumenPyramide() + " cm�.");
		}
		else if (welchenKoerperBerechnen == 4) {
			Oktaeder oktaeder1 = new Oktaeder();
			oktaeder1.ma�eEinlesen();
			System.out.println("Das Volumen des Oktaeders betr�gt: " + oktaeder1.volumenOktaeder() + " cm�.");
		}
		else {
			System.out.println("Ung�ltige Eingabe.");
		}
		
		System.out.println("Wollen Sie erneut ein Volumen berechnen? Ja (1) oder nein (2)?");
		Scanner sc5 = new Scanner(System.in);
		int jaOderNein = sc5.nextInt();
				if (jaOderNein == 1) {
					weitermachen = true;
				}
				else if (jaOderNein ==2) {
					weitermachen = false;
				}
				else {
					System.out.println("Falsche Eingabe.");
				}
		}
		while (weitermachen == true);
		
		System.out.println("Bis zum n�chsten Mal.");
	}
	
}
