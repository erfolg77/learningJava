package lessons;

public class Lesson10 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nejauš skaitlis no 1 līdz 4
		//1- Playstation 5
		//2- Steam Deck
		//3- Nintendo Switch 2
		//4- Zeķes
		int loterryNumber = (int)(Math.random() *4)+1;
		System.out.println("Tavs laimīgais skaitlis ir " + loterryNumber);
		
		
		if( loterryNumber ==1) {
			System.out.println("Tava dāvana ir Playstation 5");
		}else if(loterryNumber ==2) {
			System.out.println("Tava dāvana ir Steam Deck");
			
		}else if(loterryNumber == 3) {
			System.out.println("Tava dāvan ir Nintendo Switch 2");
			
		}else {
			System.out.println("Tava dāvana ir jaunas zeķes");
		}
		
		
	}

}
