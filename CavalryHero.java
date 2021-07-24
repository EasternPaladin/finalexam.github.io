package Hero;

public class CavalryHero extends Hero{
	public static final double Hp = 12000;
	public static final double Mp = 2000;
	public static final double Attack = 180;
	public static final double Defense = 150;
	public static final double Range = 100;
	public static final double Level= 50;
	
	public CavalryHero(String name, double hp, double mp, double attack, double defense, double range) {
		super(name, hp, mp, attack, defense, range);
		// TODO Auto-generated constructor stub
	}
	public void Summon() {
	    System.out.println("Hero + Army");
	  }
	public CavalryHero() {
		
	}

}
