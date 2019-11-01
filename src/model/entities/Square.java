package model.entities;

public class Square{

	private Double lado;
	
	public Square() {
		
	}	

	public Square(Double lado) {
		
		this.lado = lado;
	}

	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}

	public double area(double lado) {
		return lado * lado;
	}

	public double perimeter(double lado) {
		return 4 * lado;
	}	
}
