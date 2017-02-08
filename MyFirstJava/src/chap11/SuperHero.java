package chap11;

public class SuperHero extends Hero {		/* クラス名を書き換えた */

	//フィールド宣言

	private boolean flying;		/* flyingフィールドを追加 */


	//飛ぶメソッド
	public void fly(){				/* flyを追加 */
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	//着地メソッド
	public void land(){				/* landを追加 */
		this.flying = false;
		System.out.println("着地した！");
	}

	@Override
	public void run() {
		System.out.println("撤退した");



	}



	//@Override
	//public void attack(Matango m) {
		//System.out.println(this.name +"の攻撃!");
		//m.hp-= 5;
		//System.out.println("5ポイントのダメージを与えた。");

		//if (flying) {
		//System.out.println(this.name + "の攻撃!");
		//m.hp -=5;
		//System.out.println("5ポイントのダメージを与えた。");
		//}
@Override
public void attack(Matango m) {

	super.attack(m);
	if (flying)
	super.attack(m);{

	}

	}


}
