package Model;

import GUI.AddCookAction;

import java.util.ArrayList;

public class Order {

	private ArrayList<AddCookAction.Product> products = new ArrayList<> ();

	public Order() {

	}
	public void addProduct(AddCookAction.Product product) {
		products.add(product);
	}
	public void listOrder() {
		if(products.size()==0) {
			System.out.println("You should order first. You haven't order anything.");
		}
		for(int i=0;i<products.size();i++) {
			System.out.println(products.get(i).getName()+"  "+products.get(i).getSellingPrice());
		}
	}
	public ArrayList<AddCookAction.Product> getOrderedProducts() {
		return this.products;
	}

	public double calculateTotalPrice() {
		double cost=0.0;
		for(int a=0;a<products.size();a++) {
			cost=cost+products.get(a).getSellingPrice();
		}
		return cost;
	}

}


