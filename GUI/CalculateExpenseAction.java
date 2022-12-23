package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Model.Restaurant;

public class CalculateExpenseAction implements ActionListener {

    private Restaurant restaurant;

    public CalculateExpenseAction(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame();
frame.setTitle("Calculate Expense"); // set the title of the frame
frame.setLocationRelativeTo(null); // center the frame on the screen
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the program when the frame is closed

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

        frame.add(panel); // add the panel to the frame
        frame.pack(); // set the size of the frame based on the preferred sizes of its components
        frame.setVisible(true); // show the frame
    }
}
