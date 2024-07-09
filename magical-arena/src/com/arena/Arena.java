package com.arena;

import java.util.Random;

public class Arena {

	private Player player1;
	private Player player2;
	private Random dice;

	public Arena(Player player1, Player player2, Random dice) {
		super();
		this.player1 = player1;
		this.player2 = player2;
		this.dice = dice;
	}

	public Arena() {
		super();
	}

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
		Player attacker = player1.getHealth() < player2.getHealth() ? player1 : player2;
		Player defender = attacker == player1 ? player2 : player1;

		while (attacker.isAlive() && defender.isAlive()) {
			System.out.println("Attacker: " + attacker.getHealth() + " Defender: " + defender.getHealth());
			takeTurn(attacker, defender);

			// Swap roles
			Player temp = attacker;
			attacker = defender;
			defender = temp;
		}

		System.out.println("Game Over! Winner: " + (attacker.isAlive() ? "Attacker" : "Defender"));
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

		System.out.println("Attack Roll: " + attackRoll + " Defense Roll: " + defenseRoll);
		System.out.println("Damage: " + damage + " Defense: " + defense + " Net Damage: " + netDamage);
	}

}
