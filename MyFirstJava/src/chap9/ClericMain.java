package chap9;

public class ClericMain {

	public static void main(String[] args)  {

		Cleric c1 = new Cleric("クレリック1", 40, 7);
		Cleric c2 = new Cleric("クレリック2", 30);
		Cleric c3 = new Cleric("クレリック3");

		System.out.println(c1.name + "   体力hp：" + c1.hp + "   魔法力mp：" + c1.mp);
		System.out.println(c2.name + "   体力hp：" + c2.hp + "   魔法力mp：" + c2.mp);
		System.out.println(c3.name + "   体力hp：" + c3.hp + "   魔法力mp：" + c3.mp);
		System.out.println();
		System.out.println();

		c1.pray(3);
		c1.selfAid();
	}
}
