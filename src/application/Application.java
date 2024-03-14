package application;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Ma première fenêtre");
        f.setSize(400, 400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
                l.setVisible(true);
                TextFieldTest t = new TextFieldTest();
            }
        });
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame f2 = new JFrame();
                f2.setTitle("Ma dexieum fenêtre");
                f2.setSize(600, 600);
                f2.setLocationRelativeTo(null);
                f2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Set to dispose on close
                JButton btn2 = new JButton("Simulate");
                btn2.setBounds(490, 10, 95, 30);
                f2.add(btn2);
                JButton btn3 = new JButton("modify");
                btn3.setBounds(390, 10, 95, 30);
                JTextArea area = new JTextArea();
                area.setBounds(450, 50, 150, 170);
                area.setEditable(false);
                f2.add(area);
                f2.add(btn3);
                Circle c = new Circle();
                f2.add(c);
                btn2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        OutputStream outStream = new OutputStream() {
                            public void write(int b) throws IOException {
                                area.append(String.valueOf((char) b));
                            }
                        };
                        System.setOut(new PrintStream(outStream));
                        WirelessNetworkSimulator w = new WirelessNetworkSimulator();
                        WirelessDevice d1 = new WirelessDevice("d1");
                        WirelessDevice d2 = new WirelessDevice("d2");
                        w.addDevice(d1);
                        w.addDevice(d2);
                        if (c.calculateDistance() <= 200) {
                            w.simulate(0.1);
                        } else {
                            System.out.println("there is no connexion");
                        }
                        
                    }
                });
                btn3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        
                    }
                });

                f2.setVisible(true);
            }
        });

        f.setVisible(true);
    }
}
