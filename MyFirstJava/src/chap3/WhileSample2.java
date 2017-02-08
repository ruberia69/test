package chap3;

public class WhileSample2 {

	public static void main(String[] args) {
		
		int sai;
		System.out.println("6の目が出るまでサイコロを振り続けます。");
		
		while (true) {
			//1～6のランダム値を sai に代入する
			sai = 1 + (int)(Math.random() * 6.0);
			System.out.println("さいころの目は" + sai + "でした。");
			// 6の目が出たらWhileループから抜ける
			if (sai ==6) {
				break;
			}
			
			
		}
		System.out.println("プログラムを終了します");
	}

}
