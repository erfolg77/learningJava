package lessons;
import java.util.Scanner;

public class Lesson5 {
	
//01.05.2025
//IF un pārbaude uz vevumu
	public static void main(String[] args) {
		Scanner sk1 = new Scanner(System.in);
		System.out.print("Ievadi savu vecumu>");
		int age = sk1.nextInt();
		
		System.out.println("Tev ir "+ age+" gadi");
		
		
		if(age >=18) {
			System.out.println("Tu esi pilngadigs! Tu vari apmeklēt mūsu klubu!");
		}else {
			System.out.println("Tu esi nepilngadīgs! Ej uz mājām!");
		}

	}
}
