package kr.or.yi.java_study_01.ch05.ActualTest05;

public class PositivePoint extends Point {
	

	public void move(int x, int y) {
		if(x<0||y<0) {
			return;
		}
		super.move(x, y);
		/*
		 * if(x>0 && x>0) {
		 * 
		 * } 
		 * else if(x<0 && y<0) { super.move(0, 0); }
		 *  else if(x<0 || y<0) { return; }
		 */
		
	}

	
	
}
