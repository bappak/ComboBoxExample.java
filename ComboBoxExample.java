import javax.swing.*;
import java.awt.event.*;

public class ComboBoxExample {
    JFrame f;

    ComboBoxExample() {
    f = new JFrame("ComboBox Example");
    final JLabel label = new JLabel();
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setSize(500,200);
    JButton b = new JButton("SHOW ME");
    b.setBounds(300,150,100,50);
    String languages[] = {"C" , "C++" , "C#" , "JAVA" , "PHP" , "MYSQL" , "PYTHON" , "RUBY"};
    final JComboBox cb = new JComboBox(languages);
    cb.setBounds(80,150,130,50);
    f.add(cb);
    f.add(label);
    f.add(b);
    f.setLayout(null);
    f.setSize(410,410);
    f.setVisible(true);
    b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String data = "Programming Language Selected:" + cb.getItemAt(cb.getSelectedIndex());
            label.setText(data);
        }
    });
    
}

public static void main(String[] args) {
        new ComboBoxExample();
    }
    
}
