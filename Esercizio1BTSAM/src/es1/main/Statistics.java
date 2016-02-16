package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */



public class Statistics {
	
	
	public double perimeter;
	public double area;
	Statistics statistics;
	
	public Statistics(double perimeter, double area) {
		this.perimeter = perimeter;
		this.area = area;
	}
	public void add(Statistics statistics) {
		this.area += statistics.area;
		this.perimeter += statistics.perimeter;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	public double getArea() {
		return this.area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
}
