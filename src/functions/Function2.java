package functions;
//Funkcijas darbā ar masīviem
//18.05.2025.
public class Function2 {
	
	public static void printArray(String[] array) {
		//foreach
		int i=1;
		for(String oneObject:array) {
			System.out.print(i +"."+oneObject +"    ");
			i++;
		}
		System.out.println();
	}
	
	public static void printArray(int[] array) {
		int i=1;
		for(int oneObject:array) {
			System.out.print(i +".)"+oneObject +"    ");
			i++;
		}
		System.out.println();
	}
	
	
	public static void printLastObjectFromArray(String[] array) {
		String lastObject = array[array.length -1];
		System.out.println("Last array object is " + lastObject);
	}
	
	public static void printLastObjectFromArray(int[] array) {
		int lastObject=array[array.length -1];
		System.out.println("Last array object is " + lastObject);
		
	}
	
	public static int summArrayNumber(int[] array) {
		int allNumberSum=0;
		for(int oneNumber:array ) {
			allNumberSum +=oneNumber;
		}
		
		return allNumberSum;
	}
	
	
	public static double getAverageValueFromIntArray(int[] array) {
		double averageValue=0;
		
		int arrayObjectSum = summArrayNumber(array);
		
		averageValue =(double) arrayObjectSum / array.length;
		
		return averageValue;
	}
	
	
	//Atrast no masīva viss mazāko atzīmi
	public static int getMinValueFromArray(int[] array) {
		int minValue= array[0];
		
		for(int oneNumber: array) {
			if(oneNumber < minValue) {
				minValue = oneNumber;
			}
		}
		
		
		return minValue;
		
	}
	
	
	//Atrast no masīva visslielāko vērtību
	public static int getMaxValueFromArray(int[] array) {
		int maxValue = array[0];
		
		for(int oneNumber:array) {
			if(oneNumber > maxValue) {
				maxValue = oneNumber;
			}
		}
		
		return maxValue;
	}
	
	// find brend "Coca-cola"
	public static boolean findStringInStringArray(String[] array, String objectName) {
		//String brendToFind ="Coca-cola";
		for(String oneObject: array) {
			if(oneObject.equals(objectName)) {
				return true;
			}
		}

		
		return false;
	}
	
	
	

}