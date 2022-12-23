package Model;

import java.util.ArrayList;

import java.util.ArrayList;

public class Waiter extends Employee {

	private double orderRate;
	private ArrayList<Order>ordersReceived = new ArrayList<>();

	public Waiter(int id, String name) {
		super(id, name);
		orderRate=0.1;
	}

	public ArrayList<Order> getOrdersReceived() {
		return ordersReceived;
	}

	public double calculateExpense() {
		double sum = 0;
		for(int i=0; i<ordersReceived.size(); i++) {
			sum += ordersReceived.get(i).calculateTotalPrice()*orderRate;
		}
		return sum;

	}
	public void createOrder(Order order) {
		ordersReceived.add(order);
	}
}