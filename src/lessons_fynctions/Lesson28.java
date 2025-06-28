package lessons_fynctions;
import java.util.HashMap;
import functions.Function5;
//22.05.2025
//Hash Map
public class Lesson28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> capitalCities = new HashMap<String,String>();
		capitalCities.put("Latvia", "Daugavpils");
		capitalCities.put("Lithuania", "Vilnus");
		capitalCities.put("Estonia", "Tallin");
		capitalCities.put("Poland", "Warsaw");
		capitalCities.put("Germany", "Berlin");
		
		System.out.println(capitalCities);
		System.out.println("Poland capital is "+capitalCities.get("Poland"));
		
		Function5.printHashMapValue(capitalCities);
		//Print all capital cities
		
		Function5.findHashMapObject(capitalCities);
		
		
		
	}

}
