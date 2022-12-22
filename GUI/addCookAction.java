package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JWindow;

public class AddCookAction extends JPanel implements ActionListener {
    private Restaurant restaurant;

    public AddCookAction(Restaurant restaurant) {
        this.restaurant = restaurant;
        setLayout(new BorderLayout());
    }

    public void actionPerformed(ActionEvent e) {
        JWindow window = new JWindow();
        window.setLayout(new GridLayout(3, 2));

        JTextField nameField = new JTextField();
        JFormattedTextField salaryField = new JFormattedTextField(NumberFormat.getNumberInstance());
        JButton addButton = new JButton("Add");

        window.add(new JLabel("Name:"));
        window.add(nameField);
        window.add(new JLabel("Salary:"));
        window.add(salaryField);
        window.add(addButton);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                double salary = Double.parseDouble(salaryField.getText());
                Cook cook = new Cook(name, salary);
                restaurant.addCook(cook);
            }
        });
    }
}
