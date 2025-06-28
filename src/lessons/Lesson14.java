package lessons;
//Dave Babrovskis
//09.05.2025
import java.util.Scanner;
public class Lesson14 {

	public static void main(String[] args) {
		//1-Apple
		//2-Pear
		//3-Cherry
		//4-Banana
		//... - No Fruit
		Scanner sk1 = new Scanner(System.in);
		System.out.println("Enter your fruit choise:");
		
		int choise = sk1.nextInt();
		switch(choise){
		case 1: System.out.println("You will eat apple! "); break;
		case 2: System.out.println("You will eat pear! "); break;
		case 3: System.out.println("You will eat cherry!"); break;
		case 4: System.out.println("You will eat banana! "); break;
		default: System.out.println("No fruit! :(");
		
		}

	}

}
