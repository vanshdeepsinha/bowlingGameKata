package com.bowlinggame;

public class BowlingGame {
	
	private int roll =0;
	private int[] rolls = new int[21];

	public void rollBall(int pinsDown) {
		
		rolls[roll++]= pinsDown;
	
	}

	public int getScore() {
		
		int score = 0;
		int cursor =0;
		
		for (int frames = 0; frames < 10; frames++) {
			  if(rolls[cursor] == 10) {
				  score += 10 + rolls[cursor+1]+rolls[cursor+2];
				  cursor +=1;
			  }else if(rolls[cursor]+rolls[cursor+1] == 10) {
				score += 10 + rolls[cursor+2];
				cursor +=2;
			  } else {
				  score += rolls[cursor] + rolls[cursor+1];
				  cursor +=2;
			  }
			 	
		}

		return score;
	}

}
