// Ivars Slūka 18/05/2025

package ivars_sluka;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MethodsPD {

	private static Scanner userInput = new Scanner(System.in);

	public static void sayHelloToWorker(String name, String surname) {
		System.out.println("Sveiki, " + name + " " + surname + "!");
	}

	public static void multiplyNum(int num1, int num2) {
		int result = num1 * num2;
		System.out.println("Sareizinot " + num1 + " un " + num2 + " mēs iegūstam skaitli: " + result);
	}

	public static void writeNumberRange(int min, int max) {
		int range = (max - min) + 1;
		int randomNumber = (int) (Math.random() * range) + min;
		System.out.println("Nejaušs skaitlis diapazonā [" + min + "; " + max + "] ir: " + randomNumber);
	}

	public static void printArray(String[] array) {
		int index = 1;
		for (String objectInArray : array) {
			System.out.println(index + ". " + objectInArray);
			index++;
		}
	}

	public static boolean valueSearchInArray(String[] array, String objectName) {
		for (String oneObject : array) {
			if (oneObject.equals(objectName)) {
				return true;
			}
		}
		return false;
	}

	public static String valueByFirstLetterSearchInArray(String[] array, char firstLetter) {
		StringBuilder wordsWithSameFirstLetter = new StringBuilder();
		for (String word : array) {
			if (word.charAt(0) == firstLetter) {
				wordsWithSameFirstLetter.append(word).append("; ");
			}
		}
		return wordsWithSameFirstLetter.toString().trim();
	}

	public static void findLongestWordInArray(String[] array) {
		String longestWord = array[0];
		for (String word : array) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		int size = longestWord.length();
		System.out.println("Garākais vārds masīvā ir \"" + longestWord + "\" tā garums ir " + size + " burti");
	}

	public static void printArray(int[] array) {
		int index = 1;
		for (int objectInArray : array) {
			System.out.println(index + ". " + objectInArray);
			index++;
		}
	}
	
	public static double getAverageWeight(int[] array) {
		double weightSum = 0;
			for(double number : array) {
				weightSum += number;
			}
		double averageWeight = 0;
		averageWeight = (double) weightSum / array.length;
		return averageWeight;
	}

	public static int getMinValueFromArray(int[] array) {
		int minValue = array[0];
		for (int value : array) {
			if (minValue > value) {
				minValue = value;
			}
		}
		return minValue;
	}

	public static int getMaxValueFromArray(int[] array) {
		int maxValue = array[0];
		for (int value : array) {
			if (maxValue < value) {
				maxValue = value;
			}
		}
		return maxValue;
	}
	
	public static int inputNumber() {
		int number = 0;
		while (true) {
			try {
				System.out.print("Ievadiet skaitli: ");
				number = userInput.nextInt();
				return number;
			} catch (Exception e) {
				System.out.println("Ievades kļūda: ");
				System.out.println(e.toString());
				System.out.println("Tas nav derīgs skaitlis. Mēģiniet vēlreiz!");
				userInput.next();
			}
		}
	}
			
	public static double mathask(double x, double y) {
		double z = Math.pow(x, 5) + Math.sqrt(y);
		return z;
	}
	
	public static String myOSName() {
		String osName = System.getProperty("os.name");
		String osVersion = System.getProperty("os.version");
		String osArch = System.getProperty("os.arch");
		String userName = System.getProperty("user.name");
		
		return "System Information:\n"
				+"---------------------\n"
				+"Operating System: " + osName + "\n"
				+"OS Version:       " + osVersion + "\n"
				+"Architecture:     " + osArch + "\n"
				+"User:             " + userName;
	}
	
	public static void time() {
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println("Current time is: " + currentTime.format(formattedTime));
	}

}
