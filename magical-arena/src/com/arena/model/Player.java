
package com.arena.model;

	public class Player {

		private String name;
		private int health;
		private int strength;
		private int attack;

		public Player(String name, int health, int strength, int attack) {
			super();
			this.name = name;
			this.health = health;
			this.strength = strength;
			this.attack = attack;
		}

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

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isAlive() {
			return health > 0;
		}

		@Override
		public String toString() {
			return "Player [name=" + name + ", health=" + health + ", strength=" + strength + ", attack=" + attack + "]";
		}
		
	

	}



