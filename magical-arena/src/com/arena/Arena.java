package com.arena;

import java.util.Random;

public class Arena {
	private Player player1;
	private Player player2;
	private Random dice;

	public Arena(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		this.dice = new Random();
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public Random getDice() {
		return dice;
	}

	public void setDice(Random dice) {
		this.dice = dice;
	}

	private int rollDice() {
		return dice.nextInt(6) + 1;
	}

	public void startMatch() {
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

		System.out.println("Game Over! Winner: " + (attacker.isAlive() ? attacker : defender));
	}

	private void takeTurn(Player attacker, Player defender) {
		int attackRoll = rollDice();
		int defenseRoll = rollDice();

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
