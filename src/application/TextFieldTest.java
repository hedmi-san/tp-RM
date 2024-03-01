
package application;

import java.awt.event.*;
import javax.swing.*;


public class TextFieldTest implements ActionListener {

    JTextField text1, text2;
    JButton btn;
    {
        JFrame f = new JFrame();
        text1 = new JTextField();
        text1.setBounds(20, 50, 280, 30);
        text2 = new JTextField();
        text2.setBounds(20, 90, 280, 30);
        text2.setEditable(false);
        text1.setText("Tapez votre nom SVP");
        btn = new JButton("Cliquez ici");
        btn.setBounds(100, 140, 100, 40);
        btn.addActionListener(this);
        f.add(text1);
        f.add(text2);
        f.add(btn);
        f.setSize(340, 250);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = text1.getText();
        String result = "";
        if (e.getSource() == btn) {
            result = "Bonjour " + name + ", Bienvenue! ";
        }
        text2.setText(result);
    }
}
