package chap8;

public class Matango {

	//フィールドの宣言
	int hp; //お化けキノコの体力
	final int LEVEL= 10; //お化けキノコのレベル
	char suffix;	//識別符号
	//逃げるメソッド
	void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げだした!");
	}
}
