import java.util.Scanner;

public class Oktaeder extends Körper{

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
	
	public void maßeEinlesen() {
	System.out.println("Geben Sie die Seitenlänge (in cm) des Oktaeders in die Konsole ein.");
	Scanner sc6 = new Scanner(System.in);
	seitenlaenge = sc6.nextDouble();
	}
	
	
//	Die Formel zur Volumenberechnung des Oktaeders: v = ((Seitenlänge)³ * Wurzel aus 2) / 3
	
}
