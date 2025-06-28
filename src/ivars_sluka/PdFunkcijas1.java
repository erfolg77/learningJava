// Ivars Slūka 18/05/2025

package ivars_sluka;

import functions.Function3;
import functions.MethodsPD;

public class PdFunkcijas1 {
	
	public static void main(String[] args) {
		
		MethodsPD.sayHelloToWorker("Ivars", "Slūka");
		
		MethodsPD.multiplyNum(-9, 9);
		
		MethodsPD.writeNumberRange(-1, 1);
		
		String[] transports = {"bus", "horse", "car", "plane", "bycicle", "skateboard"};
		MethodsPD.printArray(transports);
		
		String valueToFind = "car";
		boolean foundValue = MethodsPD.valueSearchInArray(transports, valueToFind);
		if(foundValue == true)System.out.println(valueToFind +" found in array.");
		else System.out.println(valueToFind + " not found in array.");
		
		char firstLetter = 'b';
		String foundWords = MethodsPD.valueByFirstLetterSearchInArray(transports, firstLetter);
		System.out.println("Ar burtu " + firstLetter + " sākas sekojošie vārdi: " + foundWords);
		
		MethodsPD.findLongestWordInArray(transports);
		
		int[] weight = { 45, 78, 100, 120, 68, 34, 77 };
		MethodsPD.printArray(weight);
		
		double averageWeight = MethodsPD.getAverageWeight(weight);
		System.out.println("Vidējais svars ir: " + averageWeight);
		double minWeight = MethodsPD.getMinValueFromArray(weight); 
		System.out.println("Vismazākais svars ir: " + minWeight);
		double maxWeight = MethodsPD.getMaxValueFromArray(weight);
		System.out.println("Lielākais svars ir: " + maxWeight);
		
		int number1 = MethodsPD.inputNumber();
		int number2 = MethodsPD.inputNumber();
		int sum = number1 - number2;
		System.out.println(number1 + " - " + number2 + " = " + sum);
		
		double mathTaskResult = MethodsPD.mathask(1, 4);
		System.out.println("z = " + mathTaskResult);
		
		String info = MethodsPD.myOSName();
		System.out.println(info);
		
		System.out.println();
		MethodsPD.time();
	}
	
}
