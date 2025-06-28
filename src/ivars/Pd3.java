// Ivars Slūka
// 10-05-2025

package ivars;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pd3 {

	public static void main(String[] args) {

//	4. Pieprasi lietotājam ievadīt ārā temperatūru
//		a. Jā ārā temperatūrā ir 0 vai mazāka, tad ir nepieciešams uzvilkt siltu
//		jaku
//		b. Pretēja gadījuma siltu jaku nav nepieciešams vilkt

		Scanner input = new Scanner(System.in);
		System.out.print("Lūdzu ievadiet āra temperatūtu: ");
		int temperature = input.nextInt();

		if (temperature <= 0) {
			System.out.println("Ārā ir vēss, uzvelciet siltu jaku!");
		} else {
			System.out.println("Ārā nav tik vēss, silto jaku varat nevilkt.");
		}

//	5. Izveido jaunu mainīgo int rNum1, kas ir nejauš skaitlis no 7 līdz 11

		int rNum1 = (int) (Math.random() * 5) + 7;
		System.out.println("Nejaušs skaitlis no 7 - 11 ir: " + rNum1);

//	6. Izveido jaunu mainīgo int rNum2, kas ir nejauš skaitlis no 24 līdz 25

		int rNum2 = (int) (Math.random() * 2) + 24;
		System.out.println("Nejaušs skaitlis no 24 - 25 ir: " + rNum2);

//	7. Pieprasi lietotājam ievadīt preces numuru. Ar Switch case palīdzību
//	realizē programmu.
//		a. Ja preces numurs ir 1 – Datorpele
//		b. Ja preces numurs ir 2 – Austiņās
//		c. Ja preces numurs ir 3 – Klaviatūra
//		d. Ja preces numurs ir 4 - USB Fleška
//		e. Ja preces numurs ir 5 - Planšete
//		f. Default – Tādas preces nav

		System.out.print("Lūdzu ievadiet preces numuru: ");
		int productNumber = input.nextInt();
		String product = switch (productNumber) {

		case 1 -> "Datorpele";
		case 2 -> "Austiņas";
		case 3 -> "Klaviatūra";
		case 4 -> "USB fleška";
		case 5 -> "Planšete";
		default -> {
			System.out.println("Tādas preces nav.");
			yield "Nothing";
		}
		};

		System.out.println("Jūsu izvēlētā prece ir: " + product);

//	8. Pieprasi lietotājam ievadīt skaitli X;
//		a. Pārbaudi vai skaitlis X pieder diapazonam [25;114]

		System.out.print("Lūdzu ievadiet skaitļa 'x' vērtību: ");
		int number = input.nextInt();
		if (number >= 25 && number <= 114) {
			System.out.println("Skaitlis " + number + " pieder diapazonam [25; 114]");
		} else {
			System.out.println("Skaitlis " + number + " nepieder diapazonam [25; 114]");
		}

//	9. Ar cikla palīdzību izvadi 6 reizes šodienas datumu

		LocalDate today = LocalDate.now();
		int counter = 0;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		while (counter < 6) {
			System.out.println("Šodienas datums ir: " + today.format(formatter));
			counter++;
		}

//	10.Ar cikla palīdzību izvadi skaitļus – 3,4,5,6,7,8,9,10,11,12

		int counter2 = 3;
		while (counter2 < 13) {
			System.out.print(counter2 + " ");
			counter2++;
		}

//	11.Ar cikla palīdzību izvadi skaitļus – 90,91,92,93,94,95,96,97,98,99

		System.out.println();
		int counter3 = 90;
		while (counter3 < 100) {
			System.out.print(counter3 + " ");
			counter3++;
		}

	}

}
