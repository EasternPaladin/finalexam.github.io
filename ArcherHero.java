package Hero;

public class ArcherHero extends Hero{
	public static final double Hp = 10000;
	public static final double Mp = 1000;
	public static final double Attack = 150;
	public static final double Defense = 100;
	public static final double Range = 200;
	public static final double Level= 50;

	public ArcherHero(String name, double hp, double mp, double attack, double defense, double range) {
		super(name, hp, mp, attack, defense, range);
		// TODO Auto-generated constructor stub
	}
	public void Summon() {
	    System.out.println("Hero + Army");
	  }
	public ArcherHero() {
		
	}

}
