package GUI;

import javax.swing.*;

import Model.Restaurant;
import Model.Waiter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderPanel extends JPanel {
    public Restaurant restaurant;

	public OrderPanel(Restaurant restaurant) {
		JPanel panel = new JPanel();


		JButton createOrder = new JButton("Create Order");
		this.add(createOrder);
		createOrder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel panel = new JPanel();
				panel.setLayout(new GridLayout(5,2));
				Waiter waiter = restaurant.assignWaiter();
				JOptionPane dialog = new JOptionPane("Hi I'm " + waiter.getName()+". What would you like to order?");

				JLabel label = new JLabel("Product: ");
				panel.add(label);
				JLabel label1 = new JLabel("Count: ");
				panel.add(label1);
				JTable table = new JTable();
				JLabel label2 = new JLabel("Price: ");
				panel.add(label2);

				JButton finalize = new JButton("Finalize");
				JOptionPane dialog1 = new JOptionPane("Your order is completed. Total price is "+waiter.calculateExpense());
			}
		});
			this.add(panel);
	}
}