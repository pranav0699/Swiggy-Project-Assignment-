package com.arena;

public class Player {
	
	private int health;
    private int strength;
    private int attack;
	public Player(int health, int strength, int attack) {
		super();
		this.health = health;
		this.strength = strength;
		this.attack = attack;
	}
	public Player() {
		super();
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
    
	public boolean isAlive() {
        return health > 0;
    }

}
