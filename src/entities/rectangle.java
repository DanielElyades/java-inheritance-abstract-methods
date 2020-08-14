package entities;

import entities.anums.Color;

public class rectangle extends Shape {
	
	private Double width;
	private Double height;
	
	public rectangle() {
		}
	
	public void setWight(Double wight) {
		this.width = wight;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWight() {
		return width;
	}

	public Double getHeight() {
		return height;
	}

	public rectangle(Color color, Double wight, Double height) {
		super(color);
		this.width = wight;
		this.height = height;
	}


	@Override
	public double area() {
		
		return width * height;
	}

}
