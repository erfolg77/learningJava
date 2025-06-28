package lubova_dmitrijeva;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//18.05.2025
//Ļubova Dimitrijeva

public class MetodsPD1 {
	
	private static Scanner sk1 = new Scanner(System.in);

	
	public static void sayHelloToWorker(String name, String surname) {  // 4. uzdevums
		System.out.println("Hello " +name+ " " +surname + "!");
	}
	
	public static void multiplyNum(double num1, double num2) {  // 5. uzdevums
		double numReiz = num1*num2;
		System.out.println("Two number multiply is " +numReiz);
	}

	public static void writeNumberRange(int min, int max) {  // 6. uzdevums
		for(int i=min; i<=max; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void printArray(String[] array) {  // 7. uzdevums
		int i=1;
		for(String oneObject:array) { 
			System.out.println(i+ ". " +oneObject+ "  ");
			i++;
		}
	}
	
	public static boolean findStringInStringArray(String[] array, String objectName) {
		for(String oneObject:array) {
			if(oneObject.equals(objectName)) 
				return true;
		}	
		return false;
	}
	
	public static void findFirstChartInArray(String[] array, String findingchart) {
		char targetchart = findingchart.charAt(0);
		for(String oneObject:array) {
			if(oneObject.charAt(0)==targetchart) {
				System.out.print(oneObject+ "  ");
		}}	
		System.out.println();
	}
	
	public static String getMaxLengthFromArray(String[] array) {
		int maxValue = array[0].length();
		String word = array[0];
		
		for(String oneNumber:array) {
			if(oneNumber.length()>maxValue) {
				maxValue = oneNumber.length();
				word = oneNumber;
			}
		}
		return word;
	}
	
	// c un d nav 7 uzdevums
	
	public static void printArray(int[] array) {  // 8. uzdevums
		int i=1;
		for(int oneObject:array) { 
			System.out.println(i+ ".) " +oneObject+ "  ");
			i++;
		}}
	
	public static int summArrayNumber(int[] array) {
		int allNumberSum=0;
		for(int oneNumber:array) {
			allNumberSum +=oneNumber;
		}
		return allNumberSum;
	}
	
	public static double getAverageValueFromIntArray(int[] array) {
		double avarageValue = 0;
		int arrayObjectSum = summArrayNumber(array);
		avarageValue = (double) arrayObjectSum / array.length;
		return avarageValue;
	}
	
	public static int getMaxValueFromArray(int[] array) {
		int maxValue = array [0];
		
		for(int oneNumber:array) {
			if(oneNumber>maxValue) {
				maxValue = oneNumber;
			}
		}
		return maxValue;
	}
	
	public static int getMinValueFromArray(int[] array) {
		int minValue=Integer.MAX_VALUE;  // = array[0]
		
		for(int oneNumber: array) {
			if(oneNumber < minValue) {
				minValue = oneNumber;
			}
		}
		return minValue;
	}
	
	public static int intNumberWhile() {  // 9. uzdevums
		int number = 0;
		
		while(true) {
			try {
			System.out.print("Ievadi skaitļi: ");
			number=sk1.nextInt();
			
			return number;
			
		} catch(Exception e) {
			System.out.println("Data input error!" +e.toString());
			sk1.next();
		}
		}
	}

	public static double mathTask(double x, double y) {  // 10. uzdevums
		double z = Math.pow(x, 5) + Math.sqrt(y);
		
		return z;
	}
	
	public static String myOSName() { // 11. uzdevums
		return System.getProperty("os.name");
	}
	
	public static void time() { // 12. uzdevums
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Laiks: " + now.format(formatter));
    }
	
}
