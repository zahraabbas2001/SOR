package Model;

import java.util.ArrayList;

public class Order 
{
	public ArrayList<Product> orderedProducts;
	
	public Order() 
	{
		orderedProducts = new ArrayList<>();
	}
	public void addProduct(Product product) {
		orderedProducts.add(product);
	}
	public void listOrder() 
	{
		if(orderedProducts.size()==0)
		{
			System.out.println("You have not ordered anything yet");
		}
		else 
		{
			for (Product orderedProduct: orderedProducts)
			{
				System.out.println(orderedProduct);
			}
		}
	}

