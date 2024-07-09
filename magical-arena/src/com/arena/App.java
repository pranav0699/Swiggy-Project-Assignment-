package com.arena;

import com.arena.model.Player;
import com.arena.service.GameEngine;
import com.arena.service.RandomDiceRoller;
import com.arena.service.SimpleArena;

public class App {

	public static void main(String[] args) {
		Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);

        RandomDiceRoller diceRoller = new RandomDiceRoller();
        SimpleArena arena = new SimpleArena(diceRoller);
        GameEngine gameEngine = new GameEngine(arena);

        gameEngine.startGame(playerA, playerB);
	}

}
