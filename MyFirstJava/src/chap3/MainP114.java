package chap3;

public class MainP114 {

	public static void main(String[] args) {
		int point = 65;
		String jadge = "";
		
		if (point == 100) {
			System.out.println("優秀");
		}else if(point >=80){
			System.out.println("優");
		}else if(point >=60){
			System.out.println("良");	
		}else{
			System.out.println("落第");
		}

	}

}
