package lessons_fynctions;
import functions.Function3;

public class Lesson25 {

	public static void main(String[] args) {
		//5-8
		int randNum1 = Function3.generateRandomNumber(5,8);
		System.out.println("Rand number (5-8) "+ randNum1);
		
		//101,102
		//0-2
		//9,10
		
		System.out.println("RN (101:102)"+Function3.generateRandomNumber(101,102));
		System.out.println("RN (0:2)"+Function3.generateRandomNumber(0,2));
		System.out.println("RN (9:10)"+Function3.generateRandomNumber(9,10));
		
		
		int number1 = Function3.intNumberWhile();
		int number2 = Function3.intNumberWhile();
		
		System.out.println("Two number sum is " + (number1+number2));
				
	}

}
