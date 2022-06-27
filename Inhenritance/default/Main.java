import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import products.Product;
import products.ImportedProduct;
 
public class Main {

	public static void main(String[] args) {
		
		/*
		 * Create a program to read data from N products. At the end, show the price tag
		 * of each product in the same order they were entered. Every product has a name
		 * and price. Imported products have a customs fee. That specific data must be added to the price tag.
		 * The tax and customs must be added to the final price of the product
		 */
		
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		System.out.println("How many products do you want to buy: ");
		int products = sc.nextInt();
		
		for (int i = 0; i <products;i++) {
			System.out.println("Product #"+ (i+1) +" data");
			
			System.out.println("It is the product commom, imported? (c/i)? ");
			char productStatus = sc.next().charAt(0);
			System.out.println("Name of product: ");
			String name = sc.next();			
			System.out.println("Price of product: ");
			double price = sc.nextDouble();
			
			if(productStatus == 'c') {
				list.add(new Product(name, price));
			}
			else {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}	
		}	
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}

}
