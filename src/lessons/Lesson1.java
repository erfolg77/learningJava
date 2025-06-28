package lessons;
//class nosaukums sakrīt ar java faila nosaukumu
public class Lesson1 {
//01.05.2025
//Java mainīgie un izvads
	public static void main(String[] args) {
		System.out.println("Hello world from Dave!");
		System.out.println("01.05.2025");
		System.out.print("\tStudenti superīgu Jums dienu");
		System.out.print("\nLieliski pavadīt darba svētkus!");
		
		String myName = "Dave";
		System.out.println("\nMy name is " +myName);
		
		String surname="Babrovskis";
		
		System.out.println("My full name "+ myName +" " +surname);
		
		
		System.out.println(124+76);
		System.out.println("Divu skaitļu reizinājums ir "+ (25*4));
		System.out.println("Divu skaitļu dalījums ir " + (84/6));
		System.out.println(76-24);
		
		int number1 = 67;
		int number2 = 34;
		int sum =  number1 + number2;
		
		
		
		System.out.println(number1 +"and " + number2 +" summ is " + sum);
		
		double divide = (double)number1/number2;
		System.out.println("Two number division is " + String.format("%.2f", divide));
		
		float weight = 92.3f;
		double bucketOfWater = 10.3;
		
		String fullName = myName+surname;
		//String someName=myName surname;
		System.out.println("My full name is "+ fullName);
		System.out.println("My weight is "+weight);
		
		int numX = 7;
		int numY = (int)Math.pow(numX, 3);
				
		//numX*numX*numX;
		System.out.println(numX +" in pow 3 is " + numY);
		//skaitlis =225. iegūt kvadratsakni
		double root1 =Math.sqrt(225);
		System.out.println("Root from 225 is " + root1);
		
		//iegūt faktoriāli no skaitļa 8
		
		System.out.println("Pi number is "+ Math.PI);
		
		//S=?
		//r=5
		int rad=5;
		
		System.out.println("S="+ (int)(Math.PI *rad*rad ));
		
		
		
		
		

	}

}
