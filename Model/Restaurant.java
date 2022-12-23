package Model;

import GUI.AddCookAction;
import Model.Beverage;

import java.util.ArrayList;
import java.util.Random;

public class Restaurant {
	private ArrayList<Employee> employees = new ArrayList<>();
	private ArrayList<AddCookAction.Product> products = new ArrayList<>();

	public Restaurant() {
		initEmployees();
		initProducts();
	}

	private void initEmployees() {

		addCook("Monica", 100);

		addWaiter("Ross");
		addWaiter("Phobe");
		addWaiter("Rachel");
	}

	private void initProducts() {

		// Parameters for GUI.AddCookAction.Product Constructor:
		// GUI.AddCookAction.Product Name, Selling Price, Purchase Price and Utility Cost

		products.add(new MainDish("Pizza", 6, 2, 2));
		products.add(new MainDish("Burger", 5, 1.5, 2));

		products.add(new Beverage("Coke", 2, 0.5));
		products.add(new Beverage("Lemonade", 2, 0.3));

		products.add(new Dessert("Tiramusu", 4, 1, 1));
		products.add(new Dessert("Cake", 3, 0.5, 1));
		products.add(new Dessert("Ice Cream", 3, 0.5, 0.5));

		ArrayList<AddCookAction.Product> HGproducts = new ArrayList<>();
		HGproducts.add(new MainDish("Pizza", 6, 2, 2));
		HGproducts.add(new Beverage("Coke", 2, 0.5));
		HGproducts.add(new Dessert("Tiramusu", 4, 1, 1));
		products.add(new MenuProduct("Hunger Games Menu", HGproducts));

		ArrayList<AddCookAction.Product> Kidsproducts = new ArrayList<>();
		Kidsproducts.add(new MainDish("Burger", 5, 1.5, 2));
		Kidsproducts.add(new Beverage("Lemonade", 2, 0.3));
		Kidsproducts.add(new Dessert("Ice Cream", 3, 0.5, 0.5));
		products.add(new MenuProduct("Kids Menu", Kidsproducts));
	}

	public void listEmployees() {
		System.out.println(employees.toString());
	}
	public void addCook(String name, double salary) {
		employees.add(new Cook(employees.size()+1, name, salary));
	}

	public void addWaiter(String name) {
		employees.add(new Waiter(employees.size()+1, name));
	}

	public Waiter assignWaiter() {
		Random a =new Random();
		int b=a.nextInt(this.employees.size());
		for(int i=0;i<employees.size();i++) {

			if(employees.get(b) instanceof Waiter) {
				//return (Model.Waiter) employees.get(b);
				break;
			}
			else {
				b=a.nextInt(this.employees.size());}


		}
		return (Waiter) employees.get(b);


	}

	public double calculateExpenses() {
		double expenses = 0.0;
		for (int a = 0; a < employees.size(); a++) {
			expenses=expenses+ this.employees.get(a).calculateExpense();
			for (int i = 0; i < employees.size(); i++) {
				if(this.employees.get(i) instanceof Waiter) {
					for(Order order : ((Waiter) employees.get(i)).getOrdersReceived()){
						for(AddCookAction.Product p : order.getOrderedProducts()){
							expenses = expenses + p.calculateExpense();
						}
					}
				}
				//expenses=expenses+((Model.Waiter) employees.get(a)).getOrdersReceived().
			}
		}
		return expenses;
	}

	public double calculateRevenue() {
		double revenue = 0.0;
		for (int i = 0; i < employees.size(); i++) {
			if (this.employees.get(i) instanceof Waiter) {
				for (Order order : ((Waiter) employees.get(i)).getOrdersReceived()) {
					revenue += order.calculateTotalPrice();
				}
			}
		}
		return revenue;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}


	public ArrayList<AddCookAction.Product> getProducts() {
		return products;
	}

}
