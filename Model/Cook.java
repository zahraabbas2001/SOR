package Model;

public class Cook extends Employee {
    private double salary;
    private double taxRate;

    public Cook(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
        this.taxRate = 0.18;
    }

    public Cook() {
        this.salary = 0.0;
        this.taxRate = 0.18;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public double getTaxRate() {
        return this.taxRate;
    }

    public double calculateExpense() {
        return this.getSalary() + this.getSalary() * this.getTaxRate();
    }
}
