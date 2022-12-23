package Model;

import java.util.concurrent.atomic.AtomicInteger;

public class Employee implements Expense {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = count.incrementAndGet();
        this.name = name;
    }

    public Employee() {
        this.id = count.incrementAndGet();
        this.name = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        int var10000 = this.getID();
        return "Employee " + var10000 + ": " + this.getName();
    }
    
    public double calculateExpense() {
        return 0.0;
    }
}
