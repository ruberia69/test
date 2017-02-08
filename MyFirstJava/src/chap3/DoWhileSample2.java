package chap3;

public class DoWhileSample2 {

	public static void main(String[] args) {
		int total = 0; //合計
		int num; //キーボード入力された値
		
		do {
			System.out.println("正の整数を入力してください。");
			num = new java.util.Scanner(System.in).nextInt();
			if (num> 0 ) {
				total = total + num; 
			}
		} 	while (num> 0);
		System.out.println("合計:"+ total );
		
		
		
		

	}

}
