package kr.or.yi.java_study_01.ch05.ActualTest05;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}


	protected void move(int x, int y) {
		this.x = x; 
		this.y = y;
	}

	@Override
	public String toString() {
		return String.format("(%s, %s)의 점", x, y);
	}
	
	
}
