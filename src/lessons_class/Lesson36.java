package lessons_class;
import java.util.ArrayList;
import java_class.Worker;
import java_enum.Profession;

import java.util.Scanner;
import java_class.Home;
import java_enum.HomeType;

public class Lesson36 {

	public static void main(String[] args) {
		ArrayList<Worker> workerList = new ArrayList<Worker>();
		Worker worker1 = new Worker(Profession.Driver, true, 5, "Alfred", new Home("Tallinas street 22-15", HomeType.Flat));
		workerList.add(worker1);
		workerList.add(new Worker(Profession.Manager, false, 15, "Irina", new Home("Gobas street 14", HomeType.Castle)));
		workerList.add(new Worker(Profession.Cleaner, false, 2.5, "Milana", null));
		workerList.add(new Worker(Profession.OfficeWorker, true, 6.2, "Timur", new Home("Rīgas street 45-3", HomeType.Villa)));
		workerList.add(new Worker(Profession.Shopkeeper, true, 8.2, "Nikita", new Home("Alpu street 6-3", HomeType.House)) );
		workerList.add(new Worker(Profession.Builder, false, 9.2, "Dmitry", new Home("Zvaigžņu street 12-8", HomeType.Tent)) );
		
		System.out.println("Fifth worker is "+ workerList.get(4).name);
		System.out.println("Full information about all workers!");
		//Information about all workers
		for(Worker oneWorker: workerList) {
			oneWorker.printWorkerData();
			
		}
		//Irina salary per day
		System.out.println("Irinas salary per day is " + workerList.get(1).salaryPerDay());
		
		//All worker salary per day 
		System.out.println("All worker salaries per day");
		for(Worker oneWorker: workerList) {
			System.out.println(oneWorker.name +" salary per day " + oneWorker.salaryPerDay());
			
		}
		
		Scanner sk1= new Scanner(System.in);
		
		System.out.print("Enter work days>");
		double workDays = sk1.nextDouble();
		
		System.out.println("All worker salary for " + workDays +" days");
		
		double companySumToPay=0;
		for(Worker w: workerList) {
			double totalSalary = w.salaryPerWorkDays(workDays);
			companySumToPay  += totalSalary;
			System.out.println(w.name +" get " + totalSalary + " €");
			
		}
		System.out.println("Total sum,that company must pay is " +companySumToPay);
		
		//All workers get pay increase for hour +0.5 euro. Only Nikita dont get promotion.
		for(Worker w: workerList) {
			if( w.name.equals("Nikita")) {
				continue;
			}else {
				w.salaryPerHour +=0.5;
				System.out.println(w.name + " new sallary per hour is " + w.salaryPerHour);
			}
			
		}
		
		
		//Find Builder in the company!
		for(Worker w:workerList) {
			if(w.profosione == Profession.Builder) {
				System.out.println("Builder is " + w.name);
			}
			
		}
		System.out.println("All tired worker!");
		//Find all tired workers
		for(Worker w:workerList) {
			if(w.isTired ==true) {
				System.out.println(w.name +" must take some rest!");
			}
		}
		
	}
}

