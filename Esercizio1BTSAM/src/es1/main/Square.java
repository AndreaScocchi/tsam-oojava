package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */

public class Square extends Shape {
	
	double side;
	
	public void setSide(double s) {	
		this.side = s;
	}

	public double perimeter() {
		double p;
		p = side * 4;
		return p;
	}

	public double area() {
		double a;
		a = side * side;
		return a;
	}

}
