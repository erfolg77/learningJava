// Ivars Slūka 21/06/2025

package ivars_mantosana;

public class Food extends Product{

	public double weight;
	public boolean isHealthy;

	public Food(String name, double price, double weight, boolean isHealthy) {
		super(name, price);
		this.weight = weight;
		this.isHealthy = isHealthy;
	}
	
	public void aboutFood() {
		aboutProduct();
		System.out.println("Weight " + this.weight + " kg" + "\nIs healthy?: " + this.isHealthy + "\n");
	}
	
}
