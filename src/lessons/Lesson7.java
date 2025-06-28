package lessons;
import java.util.Scanner;

public class Lesson7 {

	//04. 05.2025
	//IF AND
	public static void main(String[] args) {
		Scanner sk1 = new Scanner(System.in);
		// Vai skaitlis X pieder diapazonam [25:100]
		System.out.print("Ievadi skaitli X");
		int skX = sk1.nextInt();
		
		if(skX >= 25 && skX <=100) {
			System.out.println(skX +" pieder diapazonam [25:100]");
			
		}else {
			System.out.println(skX +" nepieder diapazonam [25:100]");
			
		}
		
		
		
		
		// TODO Auto-generated method stub
		//Mēs varam doties mācīties par programmētājiem RTU
		// Atzīme programmēšana ir lielāka vai vienāda ar  9
		// un atzīme matemātika ir lielāka vienāda 7
		// un atzīme angļu valoda ir lielāka vienāda par 8
		System.out.print("Ievadi savu atzīmi programmēšana >");
		int atzProg = sk1.nextInt();
		
		System.out.print("Ievadi savu atzīmi matemātika >");
		int atzMat = sk1.nextInt();
		
		System.out.println("Ievadi savu atzīmi angļu valodā >");
		int atzAnglu = sk1.nextInt();
		
		if(atzProg >=9 &&  atzMat >=7 && atzAnglu >= 8) {
			System.out.println("Tu vari doties studēt RTU par programmētāju");
			
			
		}else {
			System.out.println("Tavas atzīmes ir par zemu! Dodies studēt uz LU!");
			
			
		}
		

	}

}
