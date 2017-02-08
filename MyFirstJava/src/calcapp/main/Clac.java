package calcapp.main;

//import calcapp.logics.calclogic;
import calcapp.logics.*1;

public class Clac {

	public static void main(String[] args) {
		int a =10; int b =2;
		//int total = calcapp.logics.calclogic.tasu(a,b);
		//int delta = calcapp.logics.calclogic.hiku(a,b);
		
		int total = calclogic.tasu(a,b);
		int delta = calclogic.hiku(a,b);
		System.out.println("足すと" + total + "、引くと" + delta);


	}

}
