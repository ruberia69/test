package chap11;

public class Hero {

	//フィールド宣言
	String name = "ミナト";
	int hp = 100;

	//攻撃メソッド
	public void attack(Matango m){
		int damage = 10;  // 敵へ与えるダメージ
		System.out.println(this.name + "の攻撃！");
		m.hp -= damage;
		System.out.println(damage + "ポイントのダメージをあたえた!");
	}

	//逃げるメソッド
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}

}
