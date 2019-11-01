package model.entities;

public class Rectangle {
	
	private Double height;
	private Double width;
	
	public Rectangle() {
		
	}

	public Rectangle(Double height, Double width) {
		
		this.height = height;
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public double area(double width, double height) {
		return width * height;
	}
	
	public double perimeter(double width, double height) {
		return 2 * (width + height);
	}	
}
