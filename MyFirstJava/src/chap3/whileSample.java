package chap3;

public class whileSample {

	public static void main(String[] args) {
		
		int total =0;//合計値の初期化
		int i = 1; //ループカウンターの初期化
		
		//1～100までの整数の合計を求める
		while (i<=100) {
			total += i; //total = total + i;
			i++; // i = i +1;
		}
		System.out.println("1~100までの整数の合計を求める"+total);	

	}

}
