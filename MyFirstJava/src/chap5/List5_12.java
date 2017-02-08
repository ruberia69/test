package chap5;

public class List5_12 {
	
	//int型配列を受け取り、すべての要素を表示するメソッド
	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.println(i);
			
		}
			
}
	
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		printArray(a); //配列を渡す

	}

}
