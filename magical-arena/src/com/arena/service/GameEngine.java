package com.arena.service;

import com.arena.interfaces.GameArena;
import com.arena.model.Player;

public class GameEngine {
	
	private GameArena arena;

    public GameEngine(GameArena arena) {
        this.arena = arena;
    }

    public void startGame(Player player1, Player player2) {
        arena.startMatch(player1, player2);
    }

}
