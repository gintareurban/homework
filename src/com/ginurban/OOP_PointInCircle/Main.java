package com.ginurban.OOP_PointInCircle;

public class Main {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle(new Point(3,3), 10);
		
		Point point1 = new Point(3, -7);
		
		MoveController mc = new MoveController(point1, circle1);
		mc.printResult();
		mc.pointMoveUp();
		mc.printResult();
		mc.pointMoveUp();
		mc.printResult();
		mc.pointMoveRight();
		mc.printResult();
		mc.pointMoveDown();
		mc.printResult();
		mc.pointMoveDown();
		mc.printResult();
		mc.pointMoveDown();
		mc.printResult();
	

	}

}
