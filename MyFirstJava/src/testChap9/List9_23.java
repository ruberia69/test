package testChap9;

public class List9_23 {

	public static void main(String[] args) {
		Hero.setRandomMoney();
		System.out.println("Hero,money:"+ Hero.money);
		
		//勇者h1の生成
		Hero h1 = new Hero();
		System.out.println("h1.money" + h1.money);

	}

}
