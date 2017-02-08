package chap8;

public class Hero {
	//フィールド変数の宣言
	String name; //名前の宣言
	int hp;     //HPの宣言(体力)

	//メソッド
	// 眠る
	void sleep(){
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");


	}
	// 座る
	void sit(int sec){
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した.");
	}
	// 転ぶ
	void slip(){
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ!");

	}
	// 逃げる
	void run() {
		System.out.println(this.name + "は、逃げだした!");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした。");
	}



	void attack(){}     // 戦う




}
