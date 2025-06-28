package java_animals;

import java.lang.classfile.Superclass;

public class FatCat extends Cat {
	public double weight;
	
	public static int fatCatCount =0;
	
	public FatCat(String name, int age, String toy, int catLives, double weight) {
		super(name, age, toy, catLives);
		this.weight = weight;
		
		fatCatCount++;
		
		
	}
	
	public void printFatCatInfo() {
		System.out.println(super.name +" weight is " +this.weight +" kg");
		
	}
	
	public void increaseFat() {
		weight = weight *1.3;
		
	}

}
