package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RestaurantPanel extends JPanel {
    private AddCookAction AddCookAction;
    private Restaurant restaurant;

    public RestaurantPanel(Restaurant restaurant) {
        this.restaurant = restaurant;

        JPanel panel = new JPanel();
        JButton listEmployeesButton = new JButton("List Employees");
        JButton addCookButton = new JButton("Add Cook");
        JButton addWaiterButton = new JButton("Add Waiter");
        JButton calculateExpensesButton = new JButton("Calculate Expenses");

        this.add(listEmployeesButton);
        this.add(addCookButton);
        this.add(addWaiterButton);
        this.add(calculateExpensesButton);
        
        listEmployeesButton.addActionListener(new ListEmployeeAction(this));
        this.add(panel);

        addCookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JLable label = new JLabel("Name: ");
                JLabel label2 = new JLabel("Salary: ");
                panel.add(label);
                panel.add(label2);
                JButton add = new JButton("Add:");
                panel.add(add);
                add.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        JPanel panel2 = new JPanel();
                        JFrame frame = new JFrame();
                        frame.getContentPane().add(panel2);
                        JOptionPane dialog = new JOptionPane("Cook added successfully");
                        panel2.add(dialog);
                    }
                });
            }
        });
        this.add(panel);

        addWaiterButton.addActionListener(new ActionListener() {
	
            public void actionPerformed(ActionEvent e) {
                JLabel label = new JLabel("Name: ");
                panel.add(label);
                JButton button = new JButton("Add");
                panel.add(button);
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane dialog = new JOptionPane("Waiter added successfully");
                        panel.add(dialog);
                    }
                });
            }
        });
        calculateExpensesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double totalExpenses = restaurant.calculateTotalExpenses();
                JOptionPane dialog = new JOptionPane("Total Expenses: " + totalExpenses);
                panel.add(dialog);
            }
        });
    }        
    public Restaurant getRestaurant(){
        return restaurant;
    }
}