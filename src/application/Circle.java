
package application;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Circle extends JPanel {
    int x,y,z,w;
    Random random = new Random();

    public void paint(Graphics g) {
        x =  random.nextInt(300);
        y = random.nextInt(300);
        z =  random.nextInt(300);
        w = random.nextInt(300);
        g.setColor(Color.PINK);
        g.drawOval(x, y, 200, 200);
        g.drawOval(z, w, 200, 200);
        g.setColor(Color.BLACK);
        g.drawString("id1", (x+90), (y+90));
        g.drawString("id2", (z+90), (w+90));
        g.setColor(Color.RED);
        g.fillOval((x+90), (y+90), 15, 15);
        g.setColor(Color.GREEN);
        g.fillOval((z+90), (w+90), 15, 15);
    }
    public double calculateDistance(){
        return Math.sqrt(Math.pow(z - x, 2) + Math.pow(w - y, 2));
    }

}
