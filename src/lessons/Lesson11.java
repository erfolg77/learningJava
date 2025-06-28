package lessons;

public class Lesson11 {
	//04.05.2025
	//Switch-case
	public static void main(String[] args) {
		int month =(int)(Math.random() *12)+1;
		
		System.out.println("Mēneša numurs ir " + month);
		String monthName="";
		
		switch(month) {
		case 1: monthName="Janvāris"; break;
		case 2: monthName="Februāris"; break;
		case 3: monthName="Marts"; break;
		case 4: monthName="Aprīlis"; break;
		case 5: monthName="Maijs"; break;
		case 6: monthName="Jūnijs"; break;
		case 7: monthName="Jūlijs"; break;
		case 8: monthName="Augusts"; break;
		case 9: monthName="Septembris"; break;
		case 10: monthName="Oktobris"; break;
		case 11: monthName="Novembris"; break;
		case 12: monthName="Decembris"; break;
		default: monthName="Unknown"; break;
		
		}
		
		System.out.println("Mēnesis ir "+monthName);
		
		
	}

}
