package chap3;

public class ContinueSample {

	public static void main(String[] args) {
		int i ;
		for ( i = 0; i <10; i++) {
			if (i == 5) {
				continue;
				
			}
			System.out.println("i = " + i  );
			
		}
		System.out.println("i = " + i );
	}

}
