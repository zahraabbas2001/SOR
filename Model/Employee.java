package Model;

public class Employee implements Expense {
   
  private static final AtomicInteger count= new AtomicInteger(0);
  private int id;
  private String name;
   
   public Employee (int id, String name){
      this.id=count.incrementAndGet();
      this.name=name;
      
   }
   
   public Employee()
   {
      id=count.incrementAndGet();
      name=" ";
   }
   
   public void setName()
  
  
}
