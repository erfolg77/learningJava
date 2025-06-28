// Ivars Slūka 21/06/2025


package ivars_mantosana;

public class Clothes extends Product{
	
	public boolean isNew;
	public String size;

	public Clothes(String name, double price, boolean isNew, String size) {
		super(name, price);
		this.isNew = isNew;
		this.size = size;
	}

	public void aboutClothes() {
		aboutProduct();
		System.out.println(
				"Is " + super.name + " new?: " + this.isNew
				+ "\nSize: " + this.size + "\n"
				);
	}
}
