import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrialForGUI extends JFrame implements ActionListener {
  private JMenuItem item1 = new JMenuItem("Open");
  private JMenuItem item2 = new JMenuItem("Cancel");
  private JPanel panel;
  private JFrame frame;
  private JButton button1;
  private JButton button2;
  private int width;
  private int height;
  
  public TrialForGUI() {
    JFrame F = new JFrame("Test");
    JMenuBar menubar = new JMenuBar();
    JMenu menu1 = new JMenu("File");
    item1.addActionListener(this);
    item2.addActionListener(this);
    menu1.add(item1);
    menu1.add(item2);
    menubar.add(menu1);
    F.setJMenuBar(menubar);
    F.setSize(300,100);
    F.setVisible(true);
    Container cont = F.getContentPane();
    cont.setLayout(null);
    JTextField txt = new JTextField();
    txt.setBounds(50, 50, 150, 30);
    txt.setText("Hello");
    Font font = new Font("Arial", Font.BOLD, 20);
    txt.setFont(font);
    cont.add(txt);
  }
  public void TrialForGUI(int w, int h) {
        frame = new JFrame();
        panel = new JPanel(new GridLayout(1,2));
        button1 = new JButton("Button1");
        button2 = new JButton("Button2");
        width = w;
        height = h;
    }
}
