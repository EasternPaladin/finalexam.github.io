package Hero;

public class InfantryHero extends Hero{
	public static final double Hp = 8000;
	public static final double Mp = 1200;
	public static final double Attack = 100;
	public static final double Defense = 100;
	public static final double Range = 10;
	public static final double Level= 50;
	
	public InfantryHero(String name, double hp, double mp, double attack, double defense, double range) {
		super(name, hp, mp, attack, defense, range);
		// TODO Auto-generated constructor stub
	}
	public void Summon() {
	    System.out.println("Hero + Army");
	  }
	public InfantryHero() {
		
	}

}
