import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entities.Product;
import Entities.UsedProduct;
import Entities.importedProduct;

public class App {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	List<Product> Lista = new ArrayList<>();
	
	System.out.print("Enter the number of products:");
	int n = sc.nextInt();
	for (int i = 1; i <= n; i++) {
		System.out.println("Product #" + i + " data:");
		System.out.print("Common , used or imported (c/u/i)?" );
		char p = sc.next().charAt(0);
		if(p == 'i') {
			System.out.print("Name:");
			String name = sc.next();
			System.out.print("Price:");
			Double price = sc.nextDouble();
			System.out.print("Customs Fee:");
			Double customsFee = sc.nextDouble();
			importedProduct imp = new importedProduct(name, price, customsFee);
			Lista.add(imp);
		}
		if(p == 'c') {
			System.out.print("Name:");
			String name = sc.next();
			System.out.print("Price:");
			Double price = sc.nextDouble();
			Product c = new Product(name, price);
			Lista.add(c);
		}
		if(p == 'u') {
			System.out.print("Name:");
			String name = sc.next();
			System.out.print("Price:");
			Double price = sc.nextDouble();
			System.out.print("Data de fabricacao (DD/MM/YYYY): ");
			LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			UsedProduct use = new UsedProduct(name, price, date);
			Lista.add(use);
		}
	}
	
	System.out.println();
	System.out.println("ETIQUETAS DE PRECO:");
	System.out.println();
	for (Product x : Lista) {
		System.out.println(x.priceTag());
	}

        sc.close();
	
	}

}
