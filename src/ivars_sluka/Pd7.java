// Ivars Slūka 27/05/2025

package ivars_sluka;

public class Pd7 {

	public static void main(String[] args) {

//		4. Izveido jaunu divdimensiju masīvu numbers =
//		5 12 65
//		33 89 1
//		6 4 56

		int[][] numbers = { 
				{ 5, 12, 65 }, 
				{ 33, 89, 1 }, 
				{ 6, 4, 56 } 
				};

//		5. Nosaki cik kopā ir elementu masīvā

		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			count += numbers[i].length;
		}
		System.out.println("There are " + count + " elements in \"numbers\" array.");

//		6. Izvadi no masīva skaitli 4
		System.out.println(numbers[2][1]);

//		7. Izvadi no masīva skaitli 56
		System.out.println(numbers[2][2]);

//		8. Izvadi no masīva skaitli 12
		System.out.println(numbers[0][1]);

//		9. Izvadi no masīva visus trešās rindas skaitļus (6 4 56)
		System.out.print("All numbers from third row: ");
		for (int num : numbers[2]) {
			System.out.print(num + " ");
		}

//		10.Aprēkini no masīva visu elementu kopējo summu
		System.out.println();
		int sum = 0;
		for (int j = 0; j < numbers.length; j++) {
			for (int k = 0; k < numbers[j].length; k++) {
				sum += numbers[j][k];
			}
		}
		System.out.println("Sum of all numbers in array: " + sum);

//		11.Aprēkini no masīva elementu vidējo vērtību
		double avg = (double) sum / count;
		System.out.println("Average of all numbers in array: " + avg);

//		12.Izveido divdimensiju masīvu clothes = ℎ𝑎𝑡 𝑠𝑢𝑖𝑡 𝑠ℎ𝑜𝑒𝑠
//		𝑡 − 𝑠ℎ𝑖𝑟𝑡 𝑗𝑒𝑎𝑛𝑠 𝑝𝑖𝑗𝑎𝑚𝑎

		String[][] clothes = { 
				{ "hat", "suit", "shoes" }, 
				{ "t-shirt", "jeans", "pijama" } 
				};

//		13.Izvadi lauka visas drēbes no masīva ar pievienotu kārtas numuru
		int index = 1;
		for (int i = 0; i < clothes.length; i++) {
			for (int j = 0; j < clothes[i].length; j++) {
				System.out.println(index + " -> " + clothes[i][j]);
				index ++;
			}
		}
		
		
//		14.Aizvieto apģērbu suit uz jacket
		clothes[0][1] = "jacket";
		
//		15.Pārbaudi vai masīva atrodās jeans (džinsi)
		String searchValue = "jeans";
		boolean found = false;
		
		for (int i = 0; i< clothes.length; i++) {
			for (int j = 0; j < clothes[i].length; j ++) {
				if (clothes[i][j] ==searchValue) {
					found = true;
					break;
				}
			}
			if (found) break;
		}
		
		if (found){
			System.out.println("\"clothes\" array contains " + searchValue);
		} else {
			System.out.println("\"clothes\" array does not contain " + searchValue);
		}
	}

}
