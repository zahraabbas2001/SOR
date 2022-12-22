package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import Model.Restaurant;

public class CalculateExpenseAction implements ActionListener{
    public CalculateExpenseAction(Restaurant restaurant){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));
        JLabel label = new JLabel("Expenses: ");
        panel.add(label);
        JLabel label1 = new JLabel("Revenue: ");
        panel.add(label1);
        JLabel label2 = new JLabel("Profit: ");
        panel.add(label2);
        String ex = (String.valueOf(restaurant.calculateExpenses()));
        String rv = (String.valueOf(restaurant.calculateRevenue()));
        String pr = (String.valueOf(restaurant.calculateRevenue() - restaurant.calculateExpenses()));
        JLabel label3 = new JLabel(ex);
        panel.add(label);
        JLabel label4 = new JLabel(rv);
        panel.add(label1);
        JLabel label5 = new JLabel(pr);
        panel.add(label2);
    }
}