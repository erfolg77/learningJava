package lessons_class;
import java_class.Product;


public class Lesson32 {
	//27.05.2025
	//Class objects
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product myProduct = new Product();
		//System.out.println("My product name is "+ myProduct.productName);
		//System.out.println("My product price is " + myProduct.price);
		myProduct.printProductDescription();
		
		//TV LG OLED 55,  299.99
		Product productTV = new Product();
		productTV.productName ="TV LG OLED 55";
		productTV.price = 299.99;
		productTV.printProductDescription();
		//System.out.println("Product name "+ productTV.productName +". Price:" +productTV.price);
		
		//product. Notebook  MSI. price = 1050
		Product notebook = new Product();
		notebook.productName = "Notebook MSI katana";
		notebook.price = 1050;
		notebook.printProductDescription();
		//System.out.println("Product name " + notebook.productName +". Price " + notebook.price);
		
		
		//Create product
		//1.-  Fridge Standart, 240
		//2.- Tea Can , 30
		//3. - Razor Gaming Mouse, 99
		//4. - Gaming Headset Sony, 150

	}

}
