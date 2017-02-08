package chap3;

public class ContinueSample2 {

	public static void main(String[] args) {
		
		//奇数だけを出力する
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			
			}
			System.out.println("i = " +i);
		}

	}

}
