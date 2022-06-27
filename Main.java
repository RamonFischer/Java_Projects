import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Create a program to read an integer N and then the data (id, name and salary)
		 * of N employees. There can be no id repetition.
		 * 
		 * Then, make an increase of X percent in the salary of a given employee. For
		 * this, the program must read an id and the value X. If the id informed does
		 * not exist, display a message and abort the method. At the end, show the
		 * updated list of employees
		 */

		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		Employee emp = new Employee();

		// READ DATA:
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();
			
			// While this method is true, the application wont let the Employee use an ID who has already been taken
			while (emp.hasId(list, id)) {
				System.out.print("ID already taken. Try again: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		  }

		// UPTADE SALARY
		System.out.println("-----------------");
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		} 
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);			
		}

		// LIST EMPLOYEE
		System.out.println("-----------------");
		System.out.println("List of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}

}
