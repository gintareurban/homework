package com.ginurban.OOP_PointInCircle;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point moveUp() {
		this.y++;
		return this;
	}

	public Point moveDown() {
		this.y--;
		return this;
		
	}

	public Point moveLeft() {
		this.x--;
		return this;
		
	}

	public Point moveRight() {
		this.x++;
		return this;
		
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
