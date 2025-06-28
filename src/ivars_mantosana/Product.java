// Ivars Slūka 21/06/2025

package ivars_mantosana;

public class Product {

	public String name;
	public double price;
	
	public Product(String name, double price) {
		
		this.name = name;
		this.price = price;
		
		System.out.println("New product \"" + this.name + "\" has been added!");
		
	}
	
	public void aboutProduct() {
		System.out.printf(
				"Name: " + this.name
				+ "\nPrice: " + this.price + " €"
				+ "\n21%% VAT: %.2f €\nPrice(Including 21%% VAT): %.2f €\n", (this.getPVN() - this.price), this.getPVN()
				);
	}

	public double allProductPrice() {
		return this.price;
	}
	
	public double averageProductPrice() {
		return this.price;
	}
	
	
	public double getPVN() {
		return this.price * 1.21;
	}
	
	
}
