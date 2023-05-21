package com.bowlinggame;

public class BowlingGame {
	
	private int score = 0;

	public void rollBall(int pinsDown) {
		
		score += pinsDown;
	
	}

	public int getScore() {

		return score;
	}

}
