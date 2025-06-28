package lubova_dmitrijeva;

import functions.Function2;
import functions.Function3;
import functions.MetodsPD1;

public class PDfunkcijas1 {
	
// 18.05.2025
// Ļubova Dimitrijeva

	public static void main(String[] args) {
	
// 4.
		MetodsPD1.sayHelloToWorker("Olga", "Ivanova");
		
// 5.
		MetodsPD1.multiplyNum(2, 5);
		
// 6.
		MetodsPD1.writeNumberRange(1, 10);
		
System.out.println();
		
// 7.
		String[] transport= {"bus", "horse", "car", "plane", "bicycle", "skateboard"};
		MetodsPD1.printArray(transport);
		
		boolean foundCar = MetodsPD1.findStringInStringArray(transport, "car");
		if(foundCar==true) System.out.println("Car found in array");
		else System.out.println("Car not found in array");
		
		MetodsPD1.findFirstChartInArray(transport, "b");  // grūtības!!!
		
		System.out.println("Longer word is " +MetodsPD1.getMaxLengthFromArray(transport));  // grūtības!!!
		
System.out.println();
		
// 8.
		
		int[] weight={45, 78, 100, 120, 68, 34, 77};
		MetodsPD1.printArray(weight);
		
		double averageWeight = MetodsPD1.getAverageValueFromIntArray(weight);
		System.out.println("Weight average is " +averageWeight);
		
		int arrayMax = MetodsPD1.getMaxValueFromArray(weight);
		System.out.println("Max weight is " +arrayMax);
		
		System.out.println("Minimal weight is " +MetodsPD1.getMinValueFromArray(weight));
		
System.out.println();
		
// 9.
		int number1 = MetodsPD1.intNumberWhile();
		int number2 = MetodsPD1.intNumberWhile();
		
		System.out.println("Divu ciparu starpība ir " +(number1-number2));
		
System.out.println();		
		
// 10.
		double z = MetodsPD1.mathTask(2, 9);
		System.out.println("Z = " +String.format("%.2f", z));
		
System.out.println();
		
// 11.
		String osname = MetodsPD1.myOSName();  // grūtības!!!
		System.out.println("Operētājsistēmas nosaukums: " + osname);
		
System.out.println();
		
// 12. 
		MetodsPD1.time();  // grūtības!!!

		
		
}}
