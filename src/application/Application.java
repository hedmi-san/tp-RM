package application;

import java.awt.event.*;
import javax.swing.*;

public class Application {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame();

        f.setTitle("Ma première fenêtre");
        f.setSize(400, 400); // par défaut la taille est (0,0) 
        f.setLocationRelativeTo(null); // milieu de l’écran
        f.setVisible(true); // la fenêtre est pas visible
        f.setResizable(false); // taille inchangeable
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.setLocation(100,100) ; // par défaut, coin supérieur gauche écran 
        JButton b = new JButton("Afficher");
        b.setBounds(150, 10, 95, 30);
        f.add(b);
        JButton btn = new JButton("Circle");
        btn.setBounds(150, 50, 95, 30);
        f.add(btn);
        JLabel l = new JLabel("Premier label", JLabel.CENTER);
        f.add(l);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b.setVisible(false);
                f.add(l);
                l.setVisible(true);
                TextFieldTest t = new TextFieldTest();
            }
        });

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn.setVisible(false);
                b.setVisible(false);
                l.setVisible(false);
                Circle c = new Circle();
                JFrame f2 = new JFrame();
                f2.setTitle("Ma dexieum fenêtre");
                f2.setSize(400, 400); // par défaut la taille est (0,0) 
                f2.setLocationRelativeTo(null); // milieu de l’écran
                f2.setVisible(true); // la fenêtre est pas visible
                f2.setResizable(false); // taille inchangeable
                f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JButton btn2 = new JButton("Simulate");
                btn2.setBounds(290, 10, 95, 30);
                f2.add(btn2);
                f2.add(c);
                btn2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btn2.setVisible(false);
                        WirelessNetworkSimulator w = new WirelessNetworkSimulator();
                        WirelessDevice d1 = new WirelessDevice("d1");
                        WirelessDevice d2 = new WirelessDevice("d2");
                        w.addDevice(d1);
                        w.addDevice(d2);
                        w.simulate(5);
                    }
                });

            }
        });
    }

}
