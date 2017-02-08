package chap8;

public class Main2 {

	public static void main(String[] args) {
		//勇者インスタンスの生成と初期化
		Hero h = new Hero(); //勇者インスタンスの生成
		h.name = "ミナト"; //勇者クラスのフィールド nameの初期化
		h.hp = 100;		   //勇者クラスのフィールド hpの初期化

		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';

		//冒険のはじまり
		h.slip(); //勇者は転ぶ
		m1.run(); //お化けキノコAが逃げる
		m2.run(); //お化けキノコBも逃げる
		h.run();  //勇者も逃げる

	}

}
