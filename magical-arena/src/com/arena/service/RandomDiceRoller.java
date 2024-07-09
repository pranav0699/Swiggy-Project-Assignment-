package com.arena.service;

import java.util.Random;

import com.arena.interfaces.DiceRoller;

public class RandomDiceRoller implements DiceRoller {

	private Random random;

	public RandomDiceRoller() {
		this.random = new Random();
	}

	@Override
	public int rollDice() {
		return random.nextInt(6) + 1;
	}

}
