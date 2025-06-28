package lessons_class;
import java_class.Car;

public class Lesson33 {
	//29.05.2025
	// Car class objects
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		
		
		// BMW X5 2005, 5000 False
		Car car1 = new Car("BMW X5 2005", 5000.01, false);
		//create 5 car objects
		Car carAudi = new Car("Audi A3 2014", 11000, false);
		Car tesla = new Car("Tesla Model S", 100004, true);
		Car opelAstra = new Car("Opel Astra 2017", 13000, false);
		Car volvo = new Car("Volvo xv90", 65160, true);
		Car nissan = new Car("Nissan Pathfinder", 6540,false);
		
//		car1.writeAboutCar();
//		carAudi.writeAboutCar();
//		tesla.writeAboutCar();
//		opelAstra.writeAboutCar();
//		volvo.writeAboutCar();
//		nissan.writeAboutCar();
		
		Car[] carArray = {car1, carAudi, tesla, opelAstra, volvo, nissan};
		int i=1;
		for( Car oneCar:carArray) {
			System.out.print(i+". ");
			oneCar.writeAboutCar();
			i++;
		}
		
		System.out.println("Car count in array is "+ carArray.length);
		
		System.out.println("Cars that Janis can buy");
		double janisCapital = 7000.05;
		//Check whic cars Janis can buy
		for(Car oneCar: carArray) {
			oneCar.buyCar(janisCapital);
			
		}
		
		
		//Print only new Car models!!!!!
		System.out.println("All new Cars are:");
		for(Car oneCar:carArray) {
			if(oneCar.isNew == true) {
				System.out.print(" " + oneCar.model);
			}
		}
		
		//1.) Print all old Cars
		//2.) Print car models, that are more expensive than 10 000.
		//3.) Find in car Array Tesla. What is Tesla price ?
		//4.) Count all new Cars
		
		
	}

}
