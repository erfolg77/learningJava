package lessons;
import java.util.Scanner;

public class Lesson8 {
	//04.05.2025
	// OR - VAI - ИЛИ 
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		//Mēs varam doties mācīties LU par sporta skolotāju
		// Ja mums atzīme sportā ir lielāka vienāda par 6
		// Vai arī atzīme latviešu valoda ir lielāka vienāda par 5
		//vai atzīme fizika ir lielāka vienāda par 7
		
		
		System.out.print("Ievadi savu atzīmi sportā");
		int atzSport = myScanner.nextInt();
		
		System.out.print("Ievadi savu atzīmi latviešu valodā");
		int atzLatV = myScanner.nextInt();
		
		System.out.print("Ievadi savu atzīmi fizika");
		int atzFiz = myScanner.nextInt();
		
		
		
		if( atzSport >=6 || atzLatV >= 5 || atzFiz >=7) {
			System.out.println("Tu vari doties mācīties LU par sporta skolotāju");
		}else {
			System.out.println("Tavas atzīmes ir pārāk mazas, lai mācīties LU!");
		}
		

	}

}
