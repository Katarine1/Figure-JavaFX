package model.entities;

public class Circle {

	private Double radius;
	
	public Circle() {
		super();
	}

	public Circle(Double radius) {		
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	public double area(double radius) {
		return Math.PI * radius * radius;
	}
	
	public double perimeter(double radius) {
		return 2 * Math.PI * radius;
	}	
}
