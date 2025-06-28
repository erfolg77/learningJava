package lessons_fynctions;


import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;

public class Lesson30 {
	//24.05.2025.
	//HashMap interger
	public static void main(String[] args) {
		HashMap<String, Integer> myMarks = new HashMap<String, Integer>();
		myMarks.put("Math", 8);
		myMarks.put("Informaticks",4);
		myMarks.put("English", 6);
		myMarks.put("Sports", 1);
		myMarks.put("Literature", 3);
		myMarks.put("Art", 10);
		myMarks.put("Music", 7);
		
		System.out.println("Mark count " + myMarks.size());
		
		//Sum all marks
		int markSum =0;
		for(int oneMark: myMarks.values()) {
			
			markSum+=oneMark;
		}
		System.out.println("Total sum of marks is " + markSum);
		
		double averageMark = (double)markSum / myMarks.size();
		DecimalFormat decimalFormat = new DecimalFormat("####0.00");
		System.out.println("Average mark is " +decimalFormat.format(averageMark));
		
		
		//Find min and Max grade
		int minGrade = 10;
		
		Entry<String, Integer> minSet=null;
		
		int maxGrade=0;
		Entry<String, Integer> maxSet=null;
		
		for(Entry<String, Integer> oneSet : myMarks.entrySet()) {
			System.out.println(oneSet);
			if(minGrade > oneSet.getValue()) {
				minGrade = oneSet.getValue();
				minSet =oneSet;
			}
			
			if(maxGrade <oneSet.getValue()) {
				maxGrade = oneSet.getValue();
				maxSet=oneSet;
				
			}
		}
		
		System.out.println("Min grade is "+ minSet.getValue() + " in " +minSet.getKey());
		System.out.println("Max grade is "+ maxSet.getValue() + " in " +maxSet.getKey());
		
	}

}
