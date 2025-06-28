package lessons;

public class Lesson22 {
	//16.05.2025
	//Arrays - Masivi, 
	public static void main(String[] args) {
		
		String[] carBrands = {"Mazda", "Audi", "Opel", "Ford", "Mercedes", "Nisan", "Toyota", "Tesla", "Volkswagen", "BMW"};
		
		//System.out.println();
		System.out.println(carBrands[3]);
		System.out.println("First car in array is " + carBrands[0]);
		
		System.out.println("Last car in array is " + carBrands[carBrands.length -1]);
		
		System.out.println("Brend count in array is " + carBrands.length);
		
		//Print all cars 
		System.out.println("Car print with WHILE");
		int i=0;
		while(i<carBrands.length) {
			System.out.print(i+1+". "+carBrands[i] +"   ");
			i++;
		}
		
		System.out.println();
		//Print all cars with For
		int s=1;
		for(String oneCar : carBrands) {
			System.out.print(s+". "+oneCar+" ");
			s++;
			
		}
		
	}

}
