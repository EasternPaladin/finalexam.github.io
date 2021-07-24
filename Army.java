package Army;

public class Army {
	public double Hp;
	public double Attack;
	public double Defense;
	
	public Army(double hp, double attack, double defense) {
		super();
		Hp = hp;
		Attack = attack;
		Defense = defense;
	}

	public double getHp() {
		return Hp;
	}

	public void setHp(double hp) {
		Hp = hp;
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

	public Army() {
		
	}

}
