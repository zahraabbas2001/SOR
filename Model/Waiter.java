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

}
