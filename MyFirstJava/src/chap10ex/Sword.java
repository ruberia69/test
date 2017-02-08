package chap10ex;

public class Sword {

	private String name;		// 剣の名前
	private int damage;		// 剣の攻撃力


	//アクセッサメソッド
	public int getDamage() {
		return this.damage;
	}

	public String getName() {
		return this.name;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	public void setName(String name) {
		this.name = name;
	}


}

