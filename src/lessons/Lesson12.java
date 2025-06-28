package lessons;
import java.util.Scanner;

public class Lesson12 {
	
	//04.05.2025
	//Kvadrātvienādojuma aprēkināšana

	public static void main(String[] args) {
		Scanner sk1 = new Scanner(System.in);
		
		System.out.print("Ievadi a >");
		int a = sk1.nextInt();
		
		System.out.print("Ievadi b >");
		int b = sk1.nextInt();
		
		System.out.print("Ievadi c >");
		int c = sk1.nextInt();
		
		int d = (b*b) - (4*a*c);
		System.out.println("D="+d);
		
		if(d >0){
			int x1 = (int)(-b - Math.sqrt(d)) / 2*a;
			int x2 = (int)(-b+Math.sqrt(d))/2*a;
			System.out.println("X1="+ x1);
			System.out.println("X2="+ x2);
			
		}else if(d==0) {
			int x1 = (int) -b / 2*a;
			System.out.println("X1=X2="+ x1);
		}else {
			System.out.println("Sakņu nav!");
			
		}
	}

}
