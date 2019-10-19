package com.ginurban.OOP_PointInCircle;

public class Circle {

	private Point center;
	private int radius;
	
	public Circle(Point center, int radius) {
		this.radius = radius;
		this.center = center;
	}
	
	
	
	@Override
	public String toString() {
		return "Circle [center= (" + this.center.getX() + ", " + this.center.getY() + ") , radius=" + radius + "]";
	}



	public int getX(){
		return this.center.getX();
	}
	
	public int getY(){
		return this.center.getY();
	}

	public int getRadius() {
		return this.radius;
	}

	
	
}
