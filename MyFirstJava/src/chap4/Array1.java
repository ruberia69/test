package chap4;

public class Array1 {

	public static void main(String[] args) {

//		int[] ary = new int[5];
//		ary[0] = 5;
//		ary[1] = 3;
//		ary[2] = 7;
//		ary[3] = 1;
//		ary[4] = 6;
//		int[] ary = new int[]{ 2, 3, 4, 5, 6 };
		int[]ary = {1, 2, 3, 4, 5 };
		int num = ary.length;
		System.out.println(num);

		for (int i = 0; i < ary.length; i++) {
			System.out.println("ary[" + i +"] = " + ary[i]);
		}


	}
}
