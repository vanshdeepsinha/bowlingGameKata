package com.bowlinggame;

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
	
}
