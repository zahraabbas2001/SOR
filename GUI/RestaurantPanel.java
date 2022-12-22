package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RestaurantPanel extends JPanel {
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
        
        continue
        ......
