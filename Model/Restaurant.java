package Model;

public class Restaurant {

private ArrayList<Employee> employees = new ArrayList<> ();
private ArrayList<Product> products= new ArrayList();
  
  
  public Restaurant (){
    initEmployees();
    initProducts();
    
  }
    
  private void initEmployees(){
  //add employees  from here
  }
  
  public void listEmployees(){
  for(Employee employee:employees){
    System.out.println(employee);
  }}
  
  
  private void initProducts(){
    
    //add products from here
}
  public void addCook(String name, double salary){
    
    Cook cook= new Cook();
    cook.setName(name);
    cook.setSalary(salary);
    employees.add(waiter);
  }
    
    
  public Waiter assignWaiter(){
    ArrayList<Waiter> waiters= new ArrayLists<>();
    for (Employee employee: employees) {
      
       if(employee instanceof Waiter)
       {
         waiters.add((Waiter)employee);
       }
    }
    Random rand = new Random();
    int randomIndex = rand.nextInt(waiters.size());
    return waiters.get(randomIndex);
  }
  
  public double calculateOrderExpenses()
  {
    ArrayList<Order> orderReceivedList = new ArrayList<>();
    double ordersExpense = 0.0;
    for(Employee empoyee: employees)
    {
      
      if(employee instanceof Waiter)
      {
        orderReceivedList = ((Waiter) empoyee).getOrdersReceived();
        for(Order order : orderReceivedList)
        {
          orderExpense += order.calculateOrderExpenses();
        }
      }
    }
    return orderExpense;
  }
  public double calculateExpenses() { return this.calculateEmployeeExpenses() + this.calculateOrderExpenses(); }
  
  public double calculateRevenue()
  {
    ArrayList<Order> orderReceivedList = new ArrayList<>();
    double totalRevenue = 0.0;
    for(Employee employee : employees)
    {
      if(employee instanceof Waiter)
      {
        
        orderReceivedList = ((Waiter) employee).getOrderReceived();
        for(Order order : orderReceivedList)
        {
          ordersExpense += order.calculateOrderExpenses();
        }
      }
    }
    return ordersExpense;
    
    public double calculateExpenses() { return this.calculateEmployeeExpenses() + this.calculateOrderExpenses(); }
    
    public double calculateRevenue()
    {
      ArrayList<Order> orderReceivedList = new ArrayList<>();
      double totalRevenue = 0.0;
      for(Employee employee : employees)
      {
        if(employee instanceof Waiter)
        {
          orderReceivedList = ((Waiter) emplyee).getOrdersReceived();
          for(Order order : orderReceivedList)
          {
            totalRevenue += order.calculateTotalPrice();
          }
        }
      }
      return totalRevenue;
    }
    public ArrayList<Product> getProducts() { return products; }      
}
