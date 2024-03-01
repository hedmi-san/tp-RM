
package application;

import java.awt.*;
import javax.swing.*;

public class Circle extends JPanel {

    public void paint(Graphics g) {

        g.setColor(Color.PINK);
        g.drawOval(70, 10, 200, 200);
        g.drawOval(110, 110, 200, 200);
        g.setColor(Color.BLACK);
        g.drawString("id1", 160, 100);
        g.drawString("id2", 200, 230);
        g.setColor(Color.RED);
        g.fillOval(160, 100, 15, 15);
        g.setColor(Color.GREEN);
        g.fillOval(200, 200, 15, 15);

    }

}
