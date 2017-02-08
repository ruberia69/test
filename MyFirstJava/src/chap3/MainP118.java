package chap3;

public class MainP118 {

	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
			int fortune = 2;
			switch (fortune) {
				case 1:
					System.out.println("大吉");
					break;
				case 2:
					System.out.println("中吉");
					break;
				case 3:
					System.out.println("吉");
					break;
				case 4:
					System.out.println("凶");
					
				break;

			default:
				System.out.println("凶");
			}
	}

}
