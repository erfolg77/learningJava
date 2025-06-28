package artjoms_ustinovs;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
//Artjoms Ustinovs 18.05.2025

public class MetodsPD {

	public void sayHelloToWorker(String name, String surname) {		
		System.out.println("Your full name is " + name + 
				" " + surname);
	}
	
	public void multiplyNum(int num1, int num2) {	
		int sum = num1 * num2;
		
		System.out.println("Your number is " + sum);
	}
	
	public void writeNumberRange(int min, int max){	
		
		int randNum = (int)(Math.random()*max)+min+1;	
		System.out.println("(" + min + ":" + max + ")" + randNum);
	}
	
	public void transport(String [] args){	
		
		String[] transports = {"skateboard", "bus", "horse", "car", "plane", 
				 "bycicle", };
		 int i = 0;
		 for (String variable : transports) {
			 if(variable.charAt(0) == 'b') {
				 System.out.print("");
			 }
			 if(variable == "car") {
				 System.out.print("--There is a car!--");
			 }
			 i++;
			 System.out.print(i + ". " + variable + " ");
		}
		 System.out.println();
		 System.out.println("the C task-------");
		 for (String variable : transports) {
			 if(variable.charAt(0) == 'b') {
				 System.out.print(variable + " ");
			 }
		}
		 System.out.println();
		 System.out.println("the d task-------");
         int longest = 0; 
		 String wordlongest = ""; 
		 for(String word : transports) { 
		 	if (word.length() > longest) { 
		 		longest = word.length(); 
		 	} 
		 }
		 
		for(String word : transports) { 
		 	if (word.length() == longest) { 
		 		wordlongest = word; 
		 	} 
		 }
		 System.out.println(wordlongest);
	}
	
	public void weight(String [] args){	
		int[] weight = {45,78,100, 120, 68, 34, 77};
		int i = 0;
		System.out.println("the a task-------");
		for (int variable : weight) {
			 i++;
			 System.out.print(i + ". " + variable + " ");
		}
		System.out.println();
		System.out.println("the b task-------");
		int count = 0;
		int sum = 0;
		int middle = 0;
		for (int variable : weight) {
			sum += variable;
			count++;
		}
		
		middle = sum/count;
		System.out.println(middle);
		
		System.out.println();
		System.out.println("the c task-------");
		
		int the_biggest = 0;
		for(int variable : weight) { 
		 	if (variable > the_biggest) { 
		 		the_biggest = variable; 
		 	} 
		 }
		
		System.out.println(the_biggest);
		
		System.out.println();
		System.out.println("the d task-------");
		
		int the_smallest = weight[0];
		for(int variable : weight) { 
		 	if (variable < the_smallest) { 
		 		the_smallest = variable; 
		 	} 
		 }
		
		System.out.println(the_smallest);
	}
	
	public void try_catch(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	
	public void mathTask(double x, double y) {
		double z= Math.pow(x, 5) + Math.sqrt(y);
		System.out.println("Sum of the function is " + z);
	}
	
	
	public void myOSName(){
		System.out.println(System.getProperty("os.name"));
	}
	
	public void time(){
	    LocalTime myObj = LocalTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
	    String formattedTime = myObj.format(myFormatObj);
	    System.out.println(formattedTime);
	}
}
