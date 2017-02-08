package chap10;

public class MainP378 {

	public static void main(String[] args) {

		//勇者の生成と初期設定
		Hero h = new Hero("ミナト");

		h.setRandomMoney();
		System.out.println("勇者;" +  h.getName()  +"誕生 体力:" +h.getHp() + "所持金" + h.getMoney() );
		//宿屋の生成
		Inn hotel = new Inn();


		//勇者は旅籠に入る
		hotel.checkIn(h);
		System.out.println("勇者は旅籠に入った");
		//System.out.println("勇者"+ h.name + "誕生 体力:" +h.hp +" 所持金"+ h.money);

		//王さんの登場
		King king = new King();
		System.out.println("ここで王様登場。ジャンジャジャーン（ファンファーレの音）");
		king.talk(h);

		//剣の生成
		Sword sword = new Sword();
		//剣の名前を設定
		sword.setName("ながの");
		//勇者は剣を持つ
		h.setSword(sword);
		System.out.println("勇者は"  + h.getSword().getName()  +"を手に入れた。");


	}

}
