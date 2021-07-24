package Hero;

public class CatapultHero extends Hero{
	public static final double Hp = 15000;
	public static final double Mp = 0;
	public static final double Attack = 300;
	public static final double Defense = 250;
	public static final double Range = 400;
	public static final double Level= 50;
	
	public CatapultHero(String name, double hp, double mp, double attack, double defense, double range) {
		super(name, hp, mp, attack, defense, range);
		// TODO Auto-generated constructor stub
	}
	public void Summon() {
	    System.out.println("Hero + Army");
	  }
	public CatapultHero() {
		
	}

}
