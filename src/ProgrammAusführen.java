import java.util.Scanner;

public class ProgrammAusführen {

	public void programmAusfuehren() {
		boolean weitermachen = true;
		
		do {
		
		System.out.println("Wollen Sie das Volumen eines Zylinders (1), eines Kegels (2), einer Pyramide (3) oder eines Oktaeders (4) berechnen?");
		Scanner sc4 = new Scanner(System.in);
		int welchenKoerperBerechnen = sc4.nextInt();
		
		if (welchenKoerperBerechnen == 1) {
			Zylinder zylinder1 = new Zylinder();
			zylinder1.maßeEinlesen();
			System.out.println("Das Volumen des Zylinders beträgt: " + zylinder1.volumenZylinder() + " cm³.");
		}
		else if (welchenKoerperBerechnen == 2) {
			Kegel kegel1 = new Kegel();
			kegel1.maßeEinlesen();
			System.out.println("Das Volumen des Zylinders beträgt: " + kegel1.volumenKegel() + " cm³.");
		}
		else if (welchenKoerperBerechnen == 3) {
			Pyramide pyramide1 = new Pyramide();
			pyramide1.maßeEinlesen();
			System.out.println("Das Volumen der Pyramide beträgt: " + pyramide1.volumenPyramide() + " cm³.");
		}
		else if (welchenKoerperBerechnen == 4) {
			Oktaeder oktaeder1 = new Oktaeder();
			oktaeder1.maßeEinlesen();
			System.out.println("Das Volumen des Oktaeders beträgt: " + oktaeder1.volumenOktaeder() + " cm³.");
		}
		else {
			System.out.println("Ungültige Eingabe.");
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
		
		System.out.println("Bis zum nächsten Mal.");
	}
	
}
