package functions;
import java.util.Scanner;
//18.05.2025.
//Functions Try Catch
public class Function3 {
	// 5 - 8
	//5,6,7,8
	//
	//(max - min)+1 = 3+1 = 4
	private static Scanner sk1 = new Scanner(System.in);
	public static int generateRandomNumber(int min, int max) {
		
		int range = (max -min)+1;
		int randomNumber =(int)( Math.random() *range) +min;
		
		return randomNumber;
		
	
	}
	
	public static int inputNumber() {

		try {
	
			System.out.print("Enter number");
			int number=sk1.nextInt();
			
			return number;
			
		}catch(Exception e) {
			System.out.println("Data input erro! ");
			System.out.println(e.toString());
			sk1.next();
			return 0;
		}
	
	}
	
	public static int intNumberWhile(){
		int number= 0;
		
		while(true) {
			try {
				System.out.print("Enter number>");
				number=sk1.nextInt();
				
				return number;
			}catch(Exception e){
				System.out.println("Data input erro! "  + e.toString());
				sk1.next();
			}
		}
		
		
		
		
		
	}
	

}
