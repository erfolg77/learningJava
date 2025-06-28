// Ivars Slūka
// 16/05/2025

package ivars;

public class Pd4 {

	public static void main(String[] args) {

//		4. Izveido jaunu mainīgo int rNum1, kas ir nejauš skaitlis no 50 līdz 55

		int rNum1 = (int) (Math.random() * 6) + 50;
		System.out.println("Nejaušs skaitlis no 50 - 55 ir: " + rNum1);

//		5. Izveido jaunu mainīgo int rNum2, kas ir nejauš skaitlis no 100 līdz 101

		int rNum2 = (int) (Math.random() * 2) + 100;
		System.out.println("Nejaušs skaitlis no 100 - 101 ir: " + rNum2);

//		6. Izveido jaunu mainīgo int rDāvana, kas ir nejauš skaitlis no 1 līdz 5. 
//		Ar Switch case palīdzību realizē programmu.
//		a. Ja dāvanas numurs ir 1 –Portatīvais dators
//		b. Ja dāvanas numurs ir 2 –Datorpele
//		c. Ja dāvanas numurs ir 3 –Web Kamera
//		d. Default – Zeķes

		int rNum3 = (int) (Math.random() * 5) + 1;

		String rDavana = switch (rNum3) {

		case 1 -> "Portatīvais dators";
		case 2 -> "Datorpele";
		case 3 -> "Web Kamera";
		default -> "Zeķes";

		};

		System.out.println("Apsveicam! Jūsu laimīgais skaitlis ir: " + rNum3 + " un Jūsu laimests ir: " + rDavana);

//		7. Ar cikla palīdzību izvadi skaitļu virkni – 12,14,16,18,20,22,24

		int i = 12;
		while (i <= 24) {
			System.out.print(i + " ");
			i += 2;
		}

//		8. Ar cikla palīdzību izvadi skaitļus 189, 186,183,180, 177, 174, 171, 168

		System.out.println();
		int ii = 189;
		while (ii >= 168) {
			System.out.print(ii + " ");
			ii -= 3;
		}

//		9. Ar cikla palīdzību 7 reizes izvadi tekstu – “MC+ programmēšanas kurs”
		
		System.out.println();
		for (int iii = 0; iii < 7; iii++) {
			System.out.println("MC+ programmēšanas kurss " + (iii + 1));
		}

	}

}
