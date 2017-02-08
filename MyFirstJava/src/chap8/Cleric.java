package chap8;

import java.util.Random;

public class Cleric {

	//フィールド宣言
	String name; 			//名前
	int HP = 50; 			//体力
	final int MAX_HP = 50; //最大体力
	int MP = 10; 			//魔法ポイント
	final int MAX_MP = 10; //最大魔法ポイント



	//魔法セルフエイドメソッド
	public void selfAid(){
		System.out.println(this.name+"はセルフエイドを唱えた。");
		this.HP = this.MAX_HP; //体力が最大まで回復する
		this.MP-= 5;			//魔法ポイントを5消費する
		System.out.println(this.name +"はHPが最大値まで回復した。" );
	}
	//特技 祈り
	public int play(int sec){
	System.out.println(this.name +"は、"+ sec + "秒間祈った。");
	//理論上の回復量を乱数を用いて決定する
	int recover = new Random().nextInt(3) + sec;
	//実際の回復量を計算する
	int recoverActual = Math.min(this.MAX_HP - this.MP, recover);
	
	this.MP +=recoverActual;
	System.out.println("recover =" +" recover "+ "recoverActual"+ recoverActual);
	System.out.println("MPが" + recoverActual + "回復した。");
	
	return recoverActual;
	
	




	}
}


