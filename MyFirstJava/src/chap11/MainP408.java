package chap11;

public class MainP408 {

	public static void main(String[] args) {

		Hero h = new Hero();
		Matango m = new Matango();
		m.hp = 10;
		m.suffix = 'A';
		System.out.println("勇者"+ h.name + "体力:"+ h.hp +"お化けキノコ" +m.suffix + "体力:" +m.hp );
		
		h.attack(m);
		h.run();
		System.out.println("勇者"+ h.name + "体力:"+ h.hp +"お化けキノコ" +m.suffix + "体力:" +m.hp );


		SuperHero sh = new SuperHero();
		System.out.println("超勇者" + "体力:"+ h.hp +"お化けキノコ" +m.suffix + m.hp );
		sh.run();
	}

}
