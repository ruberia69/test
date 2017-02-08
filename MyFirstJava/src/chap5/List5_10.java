package chap5;

public class List5_10 {

	public static int add(int x, int y) {
		return x + y;
	}
	
	public static double add(double x, double y) {
		return x + y;
	}
	public static String add(String x, String y) {
		return x + y;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(add(3.5,2.7)); //1つ目のメソッド
		System.out.println(add(10,20));//2つ目のメソッド
		System.out.println(add("Hello","World")); //3つ目のメソッド
	}

}
