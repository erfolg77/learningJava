package lessons_class;
import java_class.Worker;

import java.util.ArrayList;

import java_class.Home;
import java_enum.HomeType;
import java_enum.Profession;



public class Lesson37 {
	//08.06.2025.
	//New Worker clas objects
	//With new Homes
	public static void main(String[] args) {
		Home home1 = new Home("Jelgava street 11", HomeType.House);
		Home home2= new Home("Karklu street 22-3", HomeType.Flat);
		Home home3 = new Home("Rožu street 102", HomeType.Castle);
		Home home4 = new Home("Pagrabu street 22-13", HomeType.Flat);
		Home home5 = new Home("Ziedu street 23", HomeType.Villa);
		Home home6 = new Home("Upes street 2", HomeType.Tent);
		
		
		Worker worker1 = new Worker(Profession.Cleaner, false, 2.5, "Daniels", home4);
		Worker worker2 = new Worker(Profession.Cook, true, 6.7, "Filip", home1);
		Worker worker3 = new Worker(Profession.Manager, false, 12.5,"Alex", home6);
		
		//Adding houses to workers
		worker1.addAnatherHomeToWorker(home2);
		worker1.addAnatherHomeToWorker(home3);
		
		worker2.addAnatherHomeToWorker(home6);
		worker2.addAnatherHomeToWorker(home5);
		
		worker3.addAnatherHomeToWorker(home4);
		
		// TODO Auto-generated method stub
		
		//Print all Alex homes
		worker3.printAllWorkersHomes();
		
		worker2.printAllWorkersHomes();
		
		//Worker1 count all houses
		System.out.println("Daniels has " + worker1.homeList.size() +" homes!");
		
		//Find worker names who lives in flat
		ArrayList<Worker> workerList = new ArrayList<Worker>();
		workerList.add(worker1);
		workerList.add(worker2);
		workerList.add(worker3);
		
		//
		System.out.println("Workers who has flats ");
		for(Worker oneWorker: workerList) {
			for(Home oneHome: oneWorker.homeList) {
				if(oneHome.type == HomeType.Flat) {
					System.out.print(oneWorker.name  +" ");
					break;
				}
				
			}
			
		}
		
		

	}

}
