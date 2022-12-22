package Model;

public class Restaurant {

private ArrayList<Employee> employees = new ArrayList<> ();
private ArrayList<Product> products= new ArrayList();
  
  
 public Restaurant() 
	{
		initEmployees();
		initProducts();
	}
	
	private void initEmployees() 
	{
		addCook("Monica",100);
		addWaiter("Ross");
		addWaiter("Phobe");
		addWaiter("Rachel");
	}
	public void listEmployees() 
	{
		for(Employee employee : employees) 
		{
			System.out.println(employee);
		}
	}
