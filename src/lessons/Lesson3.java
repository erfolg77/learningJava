package lessons;
import java.util.Scanner;

public class Lesson3 {

//Mainīgo ievade no klaviaturas
//01.05.2025
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		
		//Y = 3X + root(Z)
		System.out.println("Ievadi X");
		double numX = myScanner.nextDouble();
		
		System.out.println("Ievadi Z");
		double numZ = myScanner.nextDouble();
		
		double skY= 3* numX + Math.sqrt(numZ);
		//x =2   z=4
		System.out.println("Y="+ skY);
		
		
		System.out.println("Ievadi savu vārdu>");
		String vards = myScanner.nextLine();
		
		System.out.println("Labdien! "+vards);
		
		
		
		System.out.println("Ievadi pirmo skaitli>");
		int skaitlis1 = myScanner.nextInt();
		
		System.out.println("Ievadi otro skaitli>");
		int skaitlis2 = myScanner.nextInt();
		
		int summa = skaitlis1+ skaitlis2;
		
		System.out.println(skaitlis1+" un " + skaitlis2 +" summa ir " +summa);
		
	}

}
