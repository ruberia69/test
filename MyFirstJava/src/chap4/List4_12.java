package chap4;

public class List4_12 {

	public static void main(String[] args) {
		
		int[] a = { 1, 2, 3 };
		int[] b;
		
		b = a;
		b[0] = 100;
		System.out.println("a[0] = " + a[0]);
		
		System.out.println("------リスト4-14 nullの利用------");
		b = null;
		System.out.println("a[0] =" + a[0]);
		System.out.println("b[0] = " + b[0]);
	}
}
