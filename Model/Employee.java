package Model;

import java.util.concurrent.atomic.AtomicInteger;

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
   
   public void setName(){
   this.name=name;
   }
   public int getID(){
   return id;
   }
   
   public String getName(){
   return name;
   }
  
   
   public String toString(){
   return "Employee " + this.getID() +":" + " " + this.getName(); }
  
   public double calculateExpense(){
   // correct this 
      return 0.0;
   }
}
