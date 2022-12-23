package Model;

import java.util.ArrayList;
public class MenuProduct extends Product 
{
	private ArrayList<Product> products;
	public MenuProduct(String name, ArrayList<Product>products) 
	{
		super(name);
		this.products = products;
		super.setSellingPrice(this.calculateSellingPrice());
		super.setPurchasePrice(this.calculatePurchasePrice());
		super.setUtilityCost(this.calculateUtilityCost());
	}
	public double calculateExpense() 
	{
		double totalExpense = 0.0;
		for(int i = 0 ; i< products.size() ; i++) 
		{
			totalExpense += products.get(i).calculateExpense();
		}
		return totalExpense;
	}
	private double calculatePurchasePrice() 
	{
		double totalPurchasePrice = 0.0;
		for(Product product : products) {
			totalPurchasePrice += product.getPurchasePrice();
		}
		return totalPurchasePrice;
	}
