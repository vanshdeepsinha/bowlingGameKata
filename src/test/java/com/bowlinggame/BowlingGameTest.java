package com.bowlinggame;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BowlingGameTest {
	
	@Test
	public void startBowlingGame() {
		BowlingGame bowlingGame = new BowlingGame();
		assertNotNull(bowlingGame);
	}

}
