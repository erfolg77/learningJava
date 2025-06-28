package kirils_kuzmins;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


//Kirils Kuzmins 18.05.2025
public class MetodsPD {

	
	    static String[] transports = {"bus", "horse", "car", "plane", "bycicle", "skateboard"};
	    static int[] weight = {45, 78, 100, 120, 68, 34, 77};
	
	    public static void sayHelloToWorker(String name, String surname) {
	       
	    	System.out.println("Sveiki, " + name + " " + surname + "!");
	    }
	
	    public static void multiplyNum(int num1, int num2) {
	        
	    	System.out.println("Reizinajums: " + (num1 * num2));
	    }
	    
	    
	    public static void writeNumberRange(int min, int max) {
	        for (int i = min; i <= max; i++) {
	            
	        	System.out.println(i);
	        }
	    }
	    
	    
	    public static void printTransportList() {
	        
	    	for (int i = 0; i < transports.length; i++) {
	            System.out.println((i + 1) + ". " + transports[i]);
	        }
	    }
	    
	    
	    
	    public static void checkIfContainsCar() {
	        for (String t : transports) {
	            if (t.equals("car")) {
	                System.out.println("In array is 'car'");
	                return;
	            }
	        }
	        System.out.println("In array not found 'car'");
	    }
	    
	    public static void printStartsWithB() {
	        for (String t : transports) {
	            if (t.startsWith("b")) {
	                System.out.println(t);
	            }
	        }
	    }
	    
	    
	    
	    
	    public static void findLongestTransport() {
	        String longest = "";
	        for (String t : transports) {
	            if (t.length() > longest.length()) {
	                longest = t;
	            }
	        }
	        System.out.println("Longest autoname: " + longest);
	    }
	    
	    
	   
	    public static void printWeights() {
	        for (int i = 0; i < weight.length; i++) {
	            System.out.println((i + 1) + ". " + weight[i]);
	        }
	    }
	    
	    
	    public static void averageWeight() {
	        int sum = 0;
	        for (int w : weight) {
	            sum += w;
	        }
	        double avg = (double) sum / weight.length;
	        System.out.println("avg weight: " + avg);
	    }
	    
	    
	    
	    public static void maxWeight() {
	        int max = weight[0];
	        for (int w : weight) {
	            if (w > max) {
	                max = w;
	            }
	        }
	        System.out.println("Max weight: " + max);
	    }

	    
	    public static void minWeight() {
	        int min = weight[0];
	        for (int w : weight) {
	            if (w < min) {
	                min = w;
	            }
	        }
	        System.out.println("min weight: " + min);
	    }
	    
	   
	    
	    public static void subtractNumbers() {
	        Scanner scanner = new Scanner(System.in);
	        try {
	            System.out.print("type num1 ");
	            int a = Integer.parseInt(scanner.nextLine());
	            System.out.print("type num2 ");
	            int b = Integer.parseInt(scanner.nextLine());
	            System.out.println("result - " + (a - b));
	        } catch (Exception e) {
	            System.out.println("Error " + e.getMessage());
	        }
	    } 
	    
	    
	    
	    public static double mathTask(double x, double y) {
	        return Math.pow(x, 5) + Math.sqrt(y);
	    }
	    
	    
	    
	    
	    public static String myOSName() {
	        return System.getProperty("os.name");
	    }
	    
	    
	    public static void time() {
	        LocalTime now = LocalTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	        System.out.println("Time now- " + now.format(formatter));
	    }
	    
	    
}
