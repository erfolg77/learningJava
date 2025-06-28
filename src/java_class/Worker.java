package java_class;
import java_enum.Profession;

import java.util.ArrayList;

import java_class.Home;
import java_enum.HomeType;

public class Worker {
	public static String companyName ="SIA MC+";
	public static int work_hours = 8;
		
	
	public Profession profosione;
	public String name;
	public boolean isTired;
	public double salaryPerHour;
	public Home workerHome;
	
	public ArrayList<Home> homeList;
	
	public Worker(Profession prof, boolean isTired, double salary, String name, Home workerHome) {
		this.profosione = prof;
		this.isTired = isTired;
		this.salaryPerHour = salary;
		this.name = name;
		this.workerHome = workerHome;
		
		this.homeList = new ArrayList<Home>();
		if(this.workerHome != null) {
			this.homeList.add(this.workerHome);
		}
		
		System.out.println("Worker " + this.name +" created!");
		
	}
	
	public void addAnatherHomeToWorker(Home homeToAdd) {
		this.homeList.add(homeToAdd);
	}
	
	public void printAllWorkersHomes() {
		System.out.println(this.name +" all homes are:");
		for(Home oneHome:homeList) {
			oneHome.printInfoAboutHome();
		}
		
	}
	
	public void printWorkerData() {
		
		System.out.println("Name "+ this.name +". Professione " +this.profosione + ". IsTired " +
		this.isTired +". Salary" +  this.salaryPerHour +
		". Works in " + companyName +". Hours "+ work_hours);
		
		
		if(workerHome != null) {
			System.out.println(this.name + " home is:");
			workerHome.printInfoAboutHome();
		}else{
			System.out.println(this.name + " has no home! ");
		}
		
		
	}
	
	public double salaryPerDay(){
		
		return work_hours * this.salaryPerHour;
		
	}
	
	public double salaryPerWorkDays(double workDays) {
		
		return this.salaryPerDay() * workDays;
	}
	
}
