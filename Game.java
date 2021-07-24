package Main;

import Hero.ArcherHero;
import Hero.CatapultHero;
import Hero.CavalryHero;
import Hero.InfantryHero;

public class Game {

	public Game() {
		
	}

	public static void main(String[] args) {
		ArcherHero archer = new ArcherHero();
		archer.Summon();
		
		CatapultHero catapult = new CatapultHero();
		catapult.Summon();
		
		CavalryHero cavalry = new CavalryHero();
		cavalry.Summon();
		
		InfantryHero infantry = new InfantryHero();
		infantry.Summon();
		
		Player player1 = new Player();
		player1.Play();

		Player player2 = new Player();
		player2.Play();

		Player player3 = new Player();
		player3.Play();

		Player player4 = new Player();
		player4.Play();


	}

	@Override
	public String toString() {
		return "Game [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
