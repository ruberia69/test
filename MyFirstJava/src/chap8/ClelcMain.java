package chap8;

public class ClelcMain {

	public static void main(String[] args) {

		//聖職者クレリックの生成
		Cleric c = new Cleric();
		c.name = "そーそーX";
		System.out.println("クレリックの体力"+ c.HP +"クレリックの魔法能力" +c.MP );
		c.HP = 40;	//体力を減らす
		System.out.println("クレリックの体力"+ c.HP +"クレリックの魔法能力" +c.MP );
		c.selfAid();//魔法を唱える
		System.out.println("クレリックの体力"+ c.HP +"クレリックの魔法能力" +c.MP );
		
		int recoverActual = c.play(10);
		System.out.println(recoverActual);
		
		
		
		
	}

}
