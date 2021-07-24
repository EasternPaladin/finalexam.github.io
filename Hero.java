package Hero;

public class Hero {
	public String name;
	public double Hp;
	public double Mp;
	public double Attack;
	public double Defense;
	public double Range;

	public Hero(String name, double hp, double mp, double attack, double defense, double range) {
		super();
		this.name = name;
		Hp = hp;
		Mp = mp;
		Attack = attack;
		Defense = defense;
		Range = range;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHp() {
		return Hp;
	}

	public void setHp(double hp) {
		Hp = hp;
	}

	public double getMp() {
		return Mp;
	}

	public void setMp(double mp) {
		Mp = mp;
	}

	public double getAttack() {
		return Attack;
	}

	public void setAttack(double attack) {
		Attack = attack;
	}

	public double getDefense() {
		return Defense;
	}

	public void setDefense(double defense) {
		Defense = defense;
	}

	public double getRange() {
		return Range;
	}

	public void setRange(double range) {
		Range = range;
	}
	 public void Summon() {
		    System.out.println("Hero + Army");
		  }
	public Hero() {
		
			  }
	}


