package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */

public class Circle extends Shape {
	
	double radius;

	public void setRadius(double r) {
		this.radius = r;
	}

	public double perimeter() {
		double p;
		p = 2 * radius * Math.PI;
		return p;
	}
	
	public double area() {
		double a;
		a = radius * radius * Math.PI;
		return a;
	}
}
