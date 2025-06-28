package functions;
//18.05.2025.
//Function file
public class Function1 {

	public static void helloWorldFunction(){
		System.out.println("Hello world from my function!");
	}
	
	public static void helloToPerson(String personName) {
		System.out.println("Hello " + personName +"!");
	}
	
	public static void twoNumberSum(double number1, double number2){
		double numberSum = number1+ number2;
		System.out.println("Two number sum is "+ numberSum);
		
	}
	
	//iegūt kvadratsakni
	//Slikts funkcijas piemērs
	public static void getRoot(int number){
		int rootValue = (int)Math.sqrt(number);
		System.out.println(number + " root value is " +rootValue);
		
	}
	
	public static void printTextByCount(String text, int count) {
		for(int i=1; i<=count; i++) {
			System.out.print(i+". "+text+"   ");
		}
		System.out.println();
		
	}
	
	
}
