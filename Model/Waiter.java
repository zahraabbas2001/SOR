package Model;

import java.util.ArrayList;

public class Waiter extends Employee {

private double orderRate;
	private ArrayList<Order> ordersRecieved;
	public Waiter(int id, String name) 
	{
		super(id,name);
		this.orderRate = 0.10;
		ordersRecieved = new ArrayList<>();
	}
	public Waiter() {
		super();
		orderRate = 0.10;
	    ordersRecieved = new ArrayList<>();
	}

		public double calculateExpense() 
	{
		double waiterWage = 0.0;
		for(int i = 0; i < ordersRecieved.size() ; i++) 
		{
			waiterWage += orderRate * ordersRecieved.get(i).calculateTotalPrice();
		}
		return waiterWage;
	}
}
