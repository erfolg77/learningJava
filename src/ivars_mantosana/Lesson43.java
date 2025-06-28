// Ivars Slūka 21/06/2025

package ivars_mantosana;

import java.util.ArrayList;
import java_products.Clothes;
import java_products.Food;
import java_products.Product;

public class Lesson43 {

	public static void main(String[] args) {

		Product product1 = new Product("Pop It", 2.30);
		Product product2 = new Product("Labubu", 14.99);

		Clothes clothes1 = new Clothes("Adidas Shoes", 45.99, true, "45");
		Clothes clothes2 = new Clothes("Fila Jeans", 34.99, false, "L");
		Clothes clothes3 = new Clothes("Sandic Shoes", 12.99, true, "43");

		Food food1 = new Food("Picca Lulu", 14.6, 1.3, false);
		Food food2 = new Food("Bananas", 1.23, 3, true);
		Food food3 = new Food("Lemons", 0.8, 0.4, true);
		Food food4 = new Food("Chocolate Cake", 23.44, 1.5, false);

		ArrayList<Product> productList = new ArrayList<Product>();

		productList.add(product1);
		productList.add(product2);
		productList.add(clothes1);
		productList.add(clothes2);
		productList.add(clothes3);
		productList.add(food1);
		productList.add(food2);
		productList.add(food3);
		productList.add(food4);

		// Find the price of all products
		drawLine();
		double allProductPrice = 0;
		double priceWithPVN = 0;
		for (Product oneProduct : productList) {
			allProductPrice += oneProduct.price;
			priceWithPVN += oneProduct.getPVN();
		}
		System.out.printf("\nPrice of all Products is: %.2f €", allProductPrice);
		System.out.printf("\n21%% VAT: %.2f €", priceWithPVN - allProductPrice);
		System.out.printf("\nPrice of all Products (including 21%% VAT) is: %.2f €\n", priceWithPVN);
		System.out.printf("\nAverage price of all Products is: %.2f €", (allProductPrice / productList.size()));
		System.out.printf("\nAverage price of all Products (including 21%% VAT) is: %.2f €\n\n", (priceWithPVN / productList.size()));

		// Print full description about all clothes
		drawLine();
		System.out.println("\nInformation about all clothes: \n");
		drawLine();
		
		for (Product oneProduct : productList) {
			if (oneProduct instanceof Clothes) {
				((Clothes) oneProduct).aboutClothes();
				drawLine();
			}
		}
		// Print full description about all food
		drawLine();
		System.out.println("Information about all foods: ");
		drawLine();
		
		for (Product oneProduct : productList) {
			if (oneProduct instanceof Food) {
				((Food) oneProduct).aboutFood();
				drawLine();
			}
		}

		// Print only healthy food
		drawLine();
		System.out.println("\nList of healthy foods: ");

		for (Product oneProduct : productList) {
			if (oneProduct instanceof Food && ((Food) oneProduct).isHealthy) {
				System.out.println(oneProduct.name);
			}
		}

		// Print only old clothes
		drawLine();
		System.out.println("\nList of old clothes: ");
		for (Product oneProduct : productList) {
			if (oneProduct instanceof Clothes && ((Clothes) oneProduct).isNew == false) {
				System.out.println(oneProduct.name + "\n");
			}
		}

		// Find most expensive product
		Product mostExpensive = productList.get(0);
		for (Product product : productList) {
			if (product.price > mostExpensive.price) {
				mostExpensive = product;
			}
		}

		drawLine();
		System.out.println("\nThe most expensive product is: " + mostExpensive.name + " with the price of: "
				+ mostExpensive.price + " €\n");

		// Print only Clothes and food name.
		drawLine();
		System.out.println("\nNames of all Clothes and Foods: \n");
		for (Product oneProduct : productList) {
			if (oneProduct instanceof Food || oneProduct instanceof Clothes)
				System.out.println(oneProduct.name);
		}
	}

	public static void drawLine() {
		System.out.println("----------------------------------------------------------------------");
	}
}
