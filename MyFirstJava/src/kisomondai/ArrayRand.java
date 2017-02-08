package kisomondai;

import java.util.Random;
import java.util.Scanner;

public class ArrayRand {

	public static void main(String[] args) {
		System.out.print("要素数:");
		Scanner sc = new Scanner(System.in); //KB入力の受付
		int num =sc.nextInt(); //配列の要素数の取得
		int[] a = new int[num];// 要素数 num の配列

		Random rnd = new Random(); //乱数の取得準備
		//配列aの作成
		for (int i = 0; i < a.length; i++) {
			a[i]= 1 + rnd.nextInt(10);


		}
		//結果の出力
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]=" +a[i]+" ");

		}

	}

}
