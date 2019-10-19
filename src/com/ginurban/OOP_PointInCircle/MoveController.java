package com.ginurban.OOP_PointInCircle;

public class MoveController {

		private Point point;
		private Circle circle;
		private boolean allowMove;
		
		public MoveController(Point point, Circle circle) {
			this.point = point;
			this.circle = circle;
		}
		
		public void printResult() {
			System.out.println("Circle [ center = (" + circle.getX() + ", " + circle.getY() + "), radius = " + circle.getRadius() + "], Point = (" + point.getX() + ", " + point.getY() + ")");
		}


		private boolean checkAllowMove(int point_x, int point_y, Circle circle) {
			if ((point_x - circle.getX()) * (point_x - circle.getX()) + 
		            (point_y - circle.getY()) * (point_y - circle.getY()) <= circle.getRadius() * circle.getRadius()) {
				allowMove = true;
			}  else {
				allowMove = false;
			}
			
			return allowMove;
		}
		
		public void pointMoveLeft() {
			if (checkAllowMove(this.point.getX() - 1, this.point.getY(), this.circle)) {
				this.point.moveLeft();
			}
		}
		
		public void pointMoveRight() {
			if (checkAllowMove(this.point.getX() + 1, this.point.getY(), this.circle)) {
				this.point.moveRight();
			}
		}
		
		public void pointMoveUp() {
			if (checkAllowMove(this.point.getX(), this.point.getY() + 1, this.circle)) {
				this.point.moveUp();
			}
		}
		
		public void pointMoveDown() {
			if (checkAllowMove(this.point.getX(), this.point.getY() - 1, this.circle)) {
				this.point.moveDown();
			}
		}
		
		
		
		
	
	
}
