package lessons;
import java.util.Scanner;

public class Lesson4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Ievadi jebkādu vārdu>");
		String vards = scan1.nextLine();
		
		System.out.println("Tavs ievadītais vārds ir "+ vards);
		System.out.println("Burtu skaits vārdā ir " + vards.length());
		System.out.println("Vārds ar lielajiem burtiem būs " + vards.toUpperCase());
		System.out.println("Vārda pirmais burts ir:"+ vards.charAt(0));
		System.out.println("Vārda pēdējais burts ir " + vards.charAt(vards.length()-1));
		

	}

}
