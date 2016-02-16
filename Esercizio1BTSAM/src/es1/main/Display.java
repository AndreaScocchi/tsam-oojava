package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */


public class Display {
	
	Shape[] shape;
	
	public Shape[] getShape(){
		return shape;
	}
	public void setShapes(Shape[] shape){
		this.shape=shape;
	}
	public double totalPerimeter() {
		double tot=0;
		for (Shape s: shape){
			tot+=s.perimeter();
			
		}
		return tot;
	}
	
	public double totalArea() {
		double tot=0;
		for (Shape s: shape){
			tot+=s.area();
		}
		return tot;
	}
	
}
