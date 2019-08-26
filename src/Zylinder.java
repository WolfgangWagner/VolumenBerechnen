import java.util.Scanner;

public class Zylinder extends Körper {

	protected double hoehe;
	protected double radius;
	
	
//	Formel zur Berechnung des Volumens von Zylindern: V = pi * r^2 * Hoehe
	
//	Konstruktoren
	public Zylinder(double hoehe, double radius) {
		super();
		this.hoehe = hoehe;
		this.radius = radius;
	}
	
	public Zylinder() {
		super();
	}


//	Getter und Setter
	public double getHoehe() {
		return hoehe;
	}


	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}
	
//	Methoden
	
	public double volumenZylinder() {
		volumen = Math.PI * (radius * radius) * hoehe;
		return volumen;
	}
	
	public void maßeEinlesen() {
	System.out.println("Geben Sie die Höhe und den Radius (in cm) des Zylinders in die Konsole ein.");
	Scanner sc2 = new Scanner(System.in);
	hoehe = sc2.nextDouble();
	radius = sc2.nextDouble();
	
	}
}
