package com.arena.service;

import com.arena.model.Player;
import com.arena.interfaces.DiceRoller;
import com.arena.interfaces.GameArena;

public class SimpleArena implements GameArena {

	private DiceRoller diceRoller;

	public SimpleArena(DiceRoller diceRoller) {
		this.diceRoller = diceRoller;
	}

	@Override
	public void startMatch(Player player1, Player player2) {
		System.out.println("Starting the match!");
		System.out.println(player1);
		System.out.println(player2);
		System.out.println();

		Player attacker = player1.getHealth() < player2.getHealth() ? player1 : player2;
		Player defender = attacker == player1 ? player2 : player1;

		while (attacker.isAlive() && defender.isAlive()) {
			System.out.println("Current Status:");
			System.out.println("Attacker: " + attacker);
			System.out.println("Defender: " + defender);
			takeTurn(attacker, defender);

			// Swap roles
			Player temp = attacker;
			attacker = defender;
			defender = temp;
		}

		System.out.println("Game Over! Winner: " + (attacker.isAlive() ? attacker.getName() : defender.getName()));
	}

	private void takeTurn(Player attacker, Player defender) {
		int attackRoll = diceRoller.rollDice();
		int defenseRoll = diceRoller.rollDice();

		int damage = attacker.getAttack() * attackRoll;
		int defense = defender.getStrength() * defenseRoll;
		int netDamage = damage - defense;

		if (netDamage > 0) {
			defender.setHealth(defender.getHealth() - netDamage);
		}

		System.out.println("\nTurn Summary:");
		System.out.println(attacker.getName() + " rolls the dice: " + attackRoll);
		System.out.println(defender.getName() + " rolls the dice: " + defenseRoll);
		System.out.println("Damage by " + attacker.getName() + ": " + damage);
		System.out.println("Defense by " + defender.getName() + ": " + defense);
		System.out.println("Net damage to " + defender.getName() + ": " + (netDamage > 0 ? netDamage : 0));
		System.out.println();
	}

}
