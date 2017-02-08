package chap9;

/*
 * 魔法使いクラス
 */

public class Wizard {

	//フィールド
	String name; //名前
	int hp; 	 //体力

	//魔法メソッド
	void heal(Hero h) {
		h.hp += 10;		//勇者の体力hpを10ポイントアップ
		System.out.println(h.name +"のHPを10回復した!");

	}



}
