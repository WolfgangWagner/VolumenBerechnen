import java.util.Scanner;

public class Kegel extends K�rper {

	double hoehe;
	double radius;
	
//	Volumenformel f�r den Zylinder: ((pi * radius^2) * hoehe) / 3)
	
//	Konstruktoren
	public Kegel(double hoehe, double radius) {
		super();
		this.hoehe = hoehe;
		this.radius = radius;
	}
	
	public Kegel() {
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
	public double volumenKegel() {
		volumen = ((Math.PI *(radius * radius))* hoehe) / 3;
		return volumen;
	}
	
	public void ma�eEinlesen() {
	System.out.println("Geben Sie die H�he und den Radius (in cm) des Kegels in die Konsole ein.");
	Scanner sc3 = new Scanner(System.in);
	hoehe = sc3.nextDouble();
	radius = sc3.nextDouble();
	}
	
}
