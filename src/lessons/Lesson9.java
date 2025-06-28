package lessons;

public class Lesson9 {
	//04.05.2025
	//Random skaitļu generācija
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Izveidot nejaušo skaitli no 1 līdz 100
		int randNum1 =(int) Math.random();
		System.out.println("Nejaušais skaitlis no 1 līdz 100 ir "+ randNum1);
		System.out.println("Nejaušais skaitlis ir " +Math.random());
		
		double randNum2 = Math.random() *1000;
		System.out.println("Rand number 2 ir "+ randNum2);
		
		// Izveidot nejaušu skaitli no 1 līdz 5
		
		int randNum3= (int)(Math.random()*5)+1;
		System.out.println("Rand number 3 ir "+ randNum3);
		
		//Izveidot nejaušo skaitli no 120 līdz 145
		int randNum4 = (int)(Math.random() *25)+120;
		System.out.println("Nejaušais skaitlis 4 ir "+ randNum4);
		
		//Izveidot nejaušo skaitli no 250 līdz 255
		// 250, 251, 252,253,254, 255
		
		int ranNum5 = (int)(Math.random() *6) +250;
		System.out.println("Rand number 5 ir "+ ranNum5);
		
		//Rand number 1 līdz 10
		int randNumb6 = (int)(Math.random() *10) +1;
		System.out.println("Nejaušais skaitlis 6 ir "+ randNumb6);
		
		
		
	}

}
