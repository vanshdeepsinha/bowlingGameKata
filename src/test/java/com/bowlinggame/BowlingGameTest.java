package com.bowlinggame;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {
	
	private BowlingGame bowlingGame;
	
	@Before
	public void setup() {
		bowlingGame = new BowlingGame();
	}
	
	@Test
	public void startBowlingGame() {
		assertNotNull(bowlingGame);
	}
	
	@Test
	public void canRollBall() {
		bowlingGame.rollBall(0);
	}
	
	@Test
	public void shouldReturnZeroScore() {
		 for(int i=0; i< 20; i++) {
			 bowlingGame.rollBall(0);
		 }
		 
		 assertEquals(0, bowlingGame.getScore());
	 }
	
	@Test
	public void canScoreGameofOnes() {
		
		/*The ball will be thrown 20 times to score 1*/
		for(int i=0; i< 20; i++) {
			 bowlingGame.rollBall(1);
		 }
		 assertEquals(20, bowlingGame.getScore());
	}
	
	@Test
	public void canScoreSpare() {
		bowlingGame.rollBall(5); /*
								  It will be 5+5 for the spare and 3 as bonus and 3 extra so 16
		                         */
		bowlingGame.rollBall(5);
		bowlingGame.rollBall(3);
		
		for (int i =0; i < 17; i++) {
			bowlingGame.rollBall(0);
		}
		
		assertEquals(16, bowlingGame.getScore());
	}
	
	@Test
	public void canScoreStrikeByTwo3s() {
		/*
		  It will be 10 for strike and 3+3 are two extra 
		  after that another 6
		 */
		bowlingGame.rollBall(10);
		bowlingGame.rollBall(3);
		bowlingGame.rollBall(3);
		
		for (int i=0; i<16; i++) {
			 bowlingGame.rollBall(0);
		   }
		   assertEquals(22, bowlingGame.getScore());
	}
	
}
