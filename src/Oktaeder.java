import java.util.Scanner;

public class Oktaeder extends K�rper{

	protected double seitenlaenge;

	
//	Konstruktoren
	public Oktaeder(int seitenlaenge) {
		super();
		this.seitenlaenge = seitenlaenge;
	}

	public Oktaeder() {
	super();
	}

//	Getter und Setter
	public double getSeitenlaenge() {
		return seitenlaenge;
	}

	public void setSeitenlaenge(int seitenlaenge) {
		this.seitenlaenge = seitenlaenge;
	}
	
//	Methoden
	
	public double volumenOktaeder() {
		volumen = (Math.pow(seitenlaenge, 3) * Math.sqrt(2)) / 3;
		return volumen;
	}
	
	public void ma�eEinlesen() {
	System.out.println("Geben Sie die Seitenl�nge (in cm) des Oktaeders in die Konsole ein.");
	Scanner sc6 = new Scanner(System.in);
	seitenlaenge = sc6.nextDouble();
	}
	
	
//	Die Formel zur Volumenberechnung des Oktaeders: v = ((Seitenl�nge)� * Wurzel aus 2) / 3
	
}
