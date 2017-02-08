package chap5;

//値渡し

public class List5_13a {

	public static void incNum(int num) {
		num++; //num = num +1
		System.out.println("incNum内のnum＝" + num);
	}
	
	public static void main(String[] args) {
		int n = 5;
		incNum(n);
		System.out.println("メインメソッド内のn＝" + n);

	}

}
