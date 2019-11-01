package model.entities;

public class Triangle {

	private Double ladoA;
	private Double ladoB;
	private Double width;
	private Double height;
		
	public Triangle() {
		
	}
	
	public Triangle(Double ladoA, Double ladoB, Double width, Double height) {
		
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.width = width;
		this.height = height;
	}
	
	public Double getLadoA() {
		return ladoA;
	}

	public void setLadoA(Double ladoA) {
		this.ladoA = ladoA;
	}

	public Double getLadoB() {
		return ladoB;
	}

	public void setLadoB(Double ladoB) {
		this.ladoB = ladoB;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public double area(double width, double height) {
		return (width * height) / 2;
	}
	
	public double perimeter(double ladoA, double ladoB, double width) {
		return 3 * (ladoA + ladoB + width);
	}	
}
