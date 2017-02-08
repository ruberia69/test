package chap10ex;

public class Main {

	public static void main(String[] args) {

		Wand wand = new Wand();
		wand.setName("aaa");
		wand.setPower(100);
		System.out.println(wand.getName() + "  " 	+ wand.getPower());

		Wizard wizard = new Wizard();
		wizard.setName("魔法使いA");
		wizard.setHp(50);
		wizard.setMp(50);
		System.out.println(wizard.getHp() + "  " + wizard.getMp());
		
		
		
		wizard.setWand(wand);
		System.out.println(wizard.getName() + "  "	+ wizard.getWand().getName());
	}
}
