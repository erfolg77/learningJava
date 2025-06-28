package lessons;
import java.util.Scanner;


//04.05.2025
// String equals
public class Lesson6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sk1 = new Scanner(System.in);
		
		String password = "qwerty";
		System.out.print("Enter your password >");
		String userpwd = sk1.nextLine();
		
		if(userpwd.equals(password)){
			System.out.println("You entered right password! Welcome!");
			
		}else{
			System.out.println("Frong password! Access denied!");
		}
		
		
		
	}
}
