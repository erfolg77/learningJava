package artjoms_ustinovs;


import java.util.Scanner;
//Artjoms Ustinovs 18.05.2025



public class pdFunkcijas1 {

	static MetodsPD callFun = new MetodsPD(); 
	static Scanner scan = new Scanner(System.in);
	
	public static void main (String[] args) {
		System.out.println("The 4th task------------------");
		
		System.out.println("Enter your full name");
		String name= scan.next();
		String surname= scan.next();
		
		callFun.sayHelloToWorker(name, surname);
		
		System.out.println("The 5th task------------------");
		
		System.out.println("Enter two numbers:");
		int num1= scan.nextInt();
		int num2= scan.nextInt();
		callFun.multiplyNum(num1, num2);
		
		System.out.println("The 6th task------------------");
		
		System.out.println("Enter two numbers:");
		int min= scan.nextInt();
		int max= scan.nextInt();
		callFun.writeNumberRange(min, max);
		
		System.out.println("The 7th task------------------");
		
		callFun.transport(args);
		
		System.out.println("The 8th task------------------");
		callFun.weight(args);
		
		System.out.println("The 9th task------------------");
		try{
			System.out.println("Enter two numbers:");
			int numb1= scan.nextInt();
			int numb2= scan.nextInt();
			callFun.try_catch(numb1, numb2);
		}catch(Exception e) {
			System.out.println("You've done do,ething wrong!");

		}
		System.out.println("The 10th task------------------");
		
		System.out.println("Enter two numbers:");
		double numF1= scan.nextInt();
		double numF2= scan.nextInt();
		callFun.mathTask(numF1, numF2);
		System.out.println("The 11th task------------------");
		
		callFun.myOSName();
		System.out.println("The 12th task------------------");
		
		callFun.time();
		
		
	}
	
}
