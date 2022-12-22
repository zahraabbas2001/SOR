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

import Model.Restaurant;

public class AddCookAction extends Jpanel {
    Restaurant restaurant;
    public AddCookAction(Resaurant restaurant){
        this.restaurant = restaurant;
        setLayout(new BorderLayout());
    }
    public void actionPerformed(ActionEvent e){
        JWindows window = new Window();
        window.setLayout(new GridLayout(5,2));
        JTextField name = new JTextField();
        window.add(name);
        JFormattedTextField salary = new JFormattedTextField(NumberFormat.getNumberInstance());
        window.add(salary);
        JButton add = new Button("Add");
        window.add(new JLable("Name= "));
        window.add(name);
        window.add( new JLanle("Salary= "));
        window.add(salary);
        window.add(add);
    }
}