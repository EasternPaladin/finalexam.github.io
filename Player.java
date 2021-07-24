package Main;

import Army.Army;
import Hero.Hero;
import Tower.Castle;

public class Player {
	Castle[] playerCastle;
	Hero[] playerHero;
	Army[] playerArmy;
	
	public void Play() {
		System.out.println("Castle"+getNumber());
		System.out.println("Hero"+getNumber());
		System.out.println("Army"+getNumber());
	}
	private String getNumber() {
		// TODO Auto-generated method stub
		return null;
	}
	public Player(Castle[] playerCastle, Hero[] playerHero, Army[] playerArmy) {
		super();
		this.playerCastle = playerCastle;
		this.playerHero = playerHero;
		this.playerArmy = playerArmy;
	}

	public Castle[] getPlayerCastle() {
		return playerCastle;
	}

	public void setPlayerCastle(Castle[] playerCastle) {
		this.playerCastle = playerCastle;
	}

	public Hero[] getPlayerHero() {
		return playerHero;
	}

	public void setPlayerHero(Hero[] playerHero) {
		this.playerHero = playerHero;
	}

	public Army[] getPlayerArmy() {
		return playerArmy;
	}

	public void setPlayerArmy(Army[] playerArmy) {
		this.playerArmy = playerArmy;
	}

	public Player() {
		// TODO Auto-generated constructor stub
	}

}
