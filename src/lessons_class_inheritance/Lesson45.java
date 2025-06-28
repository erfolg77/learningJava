package lessons_class_inheritance;
import class_workers.*;

//28.06.2025.
public class Lesson45 {
	public static void drawLine(){
		System.out.println("..........................................................");
		
	}

	public static void main(String[] args) {
		
		//Any 3 workers
		Worker worker1 = new Worker("Laima", 800, "Hesburger Burger Cook");
		Worker worker2 = new Worker("Kaspar", 50, "Bottle Colector");
		Worker worker3 = new Worker("Santa", 1400, "School teacher");
		
		
		//Any 3 Programmists
		Programmer programmer1 = new Programmer("Filip", 2300, new String[] {"Ruby", "C++", "HTML", "CSS"}, false);
		Programmer programmer2 = new Programmer("Laura", 4000, new String[] {"Java"}, true);
		Programmer programmer3 = new Programmer("Ņikita", 1500, new String[] {}, false );
		
		//Any 3 Doctors
		Doctor doctor1 = new Doctor("Max", 2600, DoctorType.HomeDoctor, null);
		Doctor doctor2 = new Doctor("Ingus", 3200, DoctorType.Dentist, "+371 25613567");	
		Doctor doctor3 = new Doctor("Katrina", 1800, DoctorType.Psyholog, "+371 25781368");
		
		Worker[] workerfullList = {worker1, worker2, worker3, programmer1, programmer2, programmer3, doctor1, doctor2, doctor3};
		
		drawLine();
		System.out.println("1. All programmist names");
		for(Worker worker : workerfullList) {
			if(worker instanceof Programmer) {
				System.out.println(worker.name);
			}
		}
		
		
		drawLine();
		System.out.println("All worker Bruto sallary " + Worker.allWorkerSallary);
		
		drawLine();
		System.out.println("All programming languages, that programmers know");
		
		for(Worker worker: workerfullList) {
			if(worker instanceof Programmer) {
				String[] languages = ((Programmer)worker).programmingLanguages;
				for(String pg: languages) {
					System.out.println(pg);
				}
			}
		}
		
		drawLine();
		System.out.println("Who works as Dentis? ");
		
		for(Worker worker:workerfullList) {
			if(worker instanceof Doctor) {
				if(((Doctor)worker).dType == DoctorType.Dentist) {
					System.out.println(worker.name);
				}
			}
		}
		
		
		// 1 - Get all programmist names 
		//2 - How much all Workers, programmists and doctors get Bruto
		// 3 - Get all programming languages, that programmists know
		//4 - Find who works as Dentist
		//5- Find programmists, that works home
	}

}
