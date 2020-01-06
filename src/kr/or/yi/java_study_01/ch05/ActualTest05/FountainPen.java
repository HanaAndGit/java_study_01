package kr.or.yi.java_study_01.ch05.ActualTest05;

public class FountainPen extends BallPen implements Refill {
	public void refill(int n) {
		this.setAmount(n);
	}
}
