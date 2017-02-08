package chap8;

public class Main {

	public static void main(String[] args) {
		//勇者よ、この仮想世界に生まれよ！
		Hero h = new Hero(); //勇者インスタンスの生成
		h.name = "ミナト"; //勇者クラスのフィールド nameの初期化
		h.hp = 100;		   //勇者クラスのフィールド hpの初期化


		System.out.println("勇者" + h.name + "を生み出しました!");

		//勇者のメソッドの呼び出してゆく
		h.sit(5); //5秒座れ！
		h.slip(); //転べ
		h.sit(25); //25秒座れ
		h.run();  //逃げろ


		//お化けキノコよ、この仮想世界に生まれよ！
		//勇者よ、戦え！
		//お化けキノコよ、逃げろ！
	}

}
