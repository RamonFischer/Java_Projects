import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import People.GenericPeople;
import People.NaturalPerson;
import People.LegalEntity;

public class Main {

	public static void main(String[] args) {
		//Create a program to read N Data Users which can have 2 types (Legal Entity or Natural Person), that means it can be an Actual Person, or a Company.
		//Then, show the amount of tax they will have to pay.
		//A Natural Person have: Name, Annual Income and Health Care expenses. If the total amount of annual income was less than 20000.00, it only have to pay 15% tax.
		//If it was more, than pay 25%. If the Person had Health Care expanses, 50% of this will be discounted in taxes.
		//An Legal Entity have:Name, Annual Income and Number of employees. If the Company have less than 10 employees, the tax will be 16%, otherwise only pays 14%.
		
		Scanner sc = new Scanner(System.in);
		List<GenericPeople> list = new ArrayList<>();
		System.out.println("How many contribuints: ");
		int contri = sc.nextInt();

		for (int i = 0; i < contri; i++) {
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("Natural or Legal(n/l)?");
			char person1 = sc.next().toLowerCase().charAt(0);
			
			System.out.println("Your Annual Balance: ");
			double annual = sc.nextDouble();
			
			if (person1 == 'n') {
				System.out.println("Your Health Care: ");
				double healthNumber = sc.nextDouble();
				list.add(new NaturalPerson(name, annual, healthNumber));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new LegalEntity(name, annual, numberOfEmployees));
			}
		}
		double sum = 0;
		for (GenericPeople tp : list) {	
			System.out.printf("Name: "+ tp.getName() + String.format(" $%.2f \n", tp.finalIncome()));
			sum+=tp.finalIncome();
		}
		
		System.out.println("All taxes: " + sum);
		sc.close();
	}
}