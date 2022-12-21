import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddWaiterAction  implements ActionListener {
    private Restaurant restaurant;

    public AddWaiterAction(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void actionPerformed(ActionEvent w) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        JTextField nameField = new JTextField();
        JButton addButton = new JButton("Add");
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(addButton);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                Waiter waiter = new Waiter(name);
                restaurant.addWaiter(waiter);
            }
        });
    }
}
