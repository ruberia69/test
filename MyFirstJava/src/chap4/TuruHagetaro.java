package chap4;

public class TuruHagetaro {

	public static void main(String[] args) {
		
		String name = "鶴　禿太郎";
		String[] subject ={ "国語", "算数", "理科", "社会", "音楽" };
		int[] score = { 10, 50, 60, 20, 5 };
		int total = 0;
		
		System.out.println(name + "君の成績");
		for (int i = 0; i < score.length; i++) {
			if (i == score.length - 1) {
				System.out.print(subject[i] + "：" + score[i]);	
			} else {
				System.out.print(subject[i] + "：" + score[i] + ",  ");	
			}
			total += score[i];
		}
		System.out.println("\n合計点：" + total);
	}
}
