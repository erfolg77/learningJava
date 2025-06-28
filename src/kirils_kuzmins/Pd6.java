package kirils_kuzmins;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Pd6 {
//Kirils Kuzmins
	//24.05.2025
	
	public static void writeToHashMap(String key, String value) {
		HashMap<String, String> animalsMap = new HashMap<String, String>();

		File animFile = new File("src/text_files/animals.txt");
		try {
		//Scanner sk1 = new Scanner(animFile);
		FileWriter writer = new FileWriter(animFile,true);
		writer.write("\n"+key+" "+value);
		writer.close();
			
		}catch(Exception e) {
			System.out.println("Error"+e.toString());
		}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//task 4	
		HashMap<String, String> animalsMap = new HashMap<String, String>();

		animalsMap.put("tree", "woodpeacker");
		animalsMap.put("sea", "whale");
		animalsMap.put("forest", "deer");
		animalsMap.put("lake", "pike");
		animalsMap.put("river", "bass");
		animalsMap.put("hill", "goat");
		animalsMap.put("meadow", "grasshopper");
	
	//task5	
		System.out.println(animalsMap);
		
	//task6
		System.out.println("Sea animal is -  "+animalsMap.get("sea"));

	//task7
		System.out.println("Total animals - " + animalsMap.size());
		
	//task8
		System.out.println("Hill animal is -  "+animalsMap.get("hill"));
		
	//task9
		System.out.println("Contains 'garden'? " + animalsMap.containsKey("garden"));
		
	//task10
		if (animalsMap.containsKey("meadow")) {
            System.out.println("Animal in meadow: " + animalsMap.get("meadow"));
        }else {
        	System.out.println(" 'meadow' not found");
        }
		
	//task11-12
		writeToHashMap("swamp","hippo");
	
	//task13
		List<String> animals = new ArrayList<>(animalsMap.values());
        String randomAnimal = animals.get(new Random().nextInt(animals.size()));
        System.out.println("Random animal: " + randomAnimal);
        
        
		System.out.println(animalsMap.values().getClass().getName());
	}

}
