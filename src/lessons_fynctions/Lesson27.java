package lessons_fynctions;
import functions.Function4;
import functions.Function2;

public class Lesson27 {
	//20.05.2025.
	//Text files
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textFilePath = "src/text_files/text1.txt";
		
		//Function4.readTextFile(textFilePath);
		//Function4.writeToFile(textFilePath, "Added some lines");
		String[] computerModels = {"MSI", "ASUS", "Lenova", "Toshiba", "Sony", "Macbook","Acer", "HP"};
		Function2.printArray(computerModels);
		
		String randomComputerModel = Function4.selectRandomArrayObject(computerModels);
		System.out.println("Random model " + randomComputerModel);
		
		
		String computerFile = "src/text_files/computer.txt";
		Function4.writeToFile(computerFile, randomComputerModel);
		
	}

}
