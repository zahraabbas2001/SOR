import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddWaiterAction  implements ActionListener {
    private Restaurant restaurant;
    private RestaurantPanel restaurantPanel;

    public AddWaiterAction(RestaurantPanel restaurantPanel,Restaurant restaurant) {
        this.restaurantPanel=restaurantPanel;
        this.restaurant = restaurant;
    }

    public void actionPerformed(ActionEvent w) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        JTextField nameField = new JTextField();
        JTextField salaryField= new JTextField();
        JButton addButton = new JButton("Add");
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Salary:"));
        panel.add(salaryField);
        panel.add(addButton);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                double salary=Double.parseDouble(salaryField.getText());
                Waiter waiter = new Waiter(name,salary);
                restaurant.addWaiter(waiter);
                //update Waiter List??
            }
        });
    }
}
