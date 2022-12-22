package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import Model.Restaurant;

public class CalculateExpenseAction implements ActionListener{
    private RestaurantPanel restaurantPanel;

    public ListEmployeeAction(RestaurantPanel restaurantPanel){
        this.restaurantPanel = restaurantPanel;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(restaurantPanel.getRestaurant().getEmployees().size()+1,3));
        for(int i = 0; i<restaurantPanel.getRestaurant().getEmployees().size(); i++){
            panel.add(new JLabel(restaurantPanel.getRestaurant().getEmployees().get(i).getName()));
        }
        panel.setBounds(200,900,200,900);
        restaurantPanel.add(panel);
    }
}