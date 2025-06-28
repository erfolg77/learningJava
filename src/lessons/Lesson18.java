package lessons;
import java.util.Scanner;

public class Lesson18 {

	public static void main(String[] args) {
		//User inputs for number
		//Get summ and average from 4 numbers
		Scanner scan = new Scanner(System.in);
		
	
		
		int i=0;
		int summ=0;
		while(i<4) {
			System.out.print("Enter number "+(i+1)+"");
			int number = scan.nextInt();
			summ +=number;
			i++;
			
		}
		System.out.println("All number sum is "+ summ);
		
		int average = summ/4;
		System.out.println("Averaga of 4 numbers is " + average);
		
//		System.out.println("Enter number 2. >");
//		int number2 = scan.nextInt();
//		
//		System.out.println("Enter number 3. >");
//		int number3 = scan.nextInt();
//		
//		System.out.println("Enter number 4. >");
//		int number4 = scan.nextInt();
//		

	}

}
