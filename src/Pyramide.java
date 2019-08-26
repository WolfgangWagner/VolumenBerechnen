import java.util.Scanner;

public class Pyramide extends Körper {

	protected double hoehe;
	protected double breite;
	protected double tiefe;
	

	
//	Konstruktoren
	
	public Pyramide(double hoehe, double breite, double tiefe) {
		super();
		this.hoehe = hoehe;
		this.breite = breite;
		this.tiefe = tiefe;
	}
	
	public double getHoehe() {
		return hoehe;
	}
	
//	Getter und Setter
	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}
	public double getBreite() {
		return breite;
	}
	public void setBreite(double breite) {
		this.breite = breite;
	}
	public double getTiefe() {
		return tiefe;
	}
	public void setTiefe(double laenge) {
		this.tiefe = laenge;
	}
	public Pyramide() {
		super();
	}
	
//	Methoden
	public double volumenPyramide() {
		volumen = ((breite * tiefe) * hoehe) / 3;
		return volumen;
	}
	
	public void maßeEinlesen() {
		System.out.println("Geben Sie die Höhe, die Breite und die Tiefe (in cm) der Pyramide in die Konsole ein.");
		Scanner sc4 = new Scanner(System.in);
		hoehe = sc4.nextDouble();
		breite = sc4.nextDouble();
		tiefe = sc4.nextDouble();
	}
	
//	Formel zur Berechnung des Volumens von Pyramiden: 1/3 * (g * h)
	
	
	
}
