package lessons;
import java.util.Scanner;

public class Lesson13 {
//09.05.2025
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		System.out.print("How much litr of gasoline you want to buy:");
		double litrs = myScanner.nextDouble();
		double gasolinePrice = 1.54;
		
		System.out.println("You entered " +litrs);
		
		if(litrs >= 20) {
			System.out.println("You can go to Rēzekne and go back home");
		}else {
			System.out.println("You can not drive to Rēzkne!");
		}
		double totalPay = litrs *gasolinePrice;
		System.out.println("You must pay " + totalPay +"€");
		
		
	}

}
