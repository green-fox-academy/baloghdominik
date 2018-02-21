import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.

            Color rgb1 = new Color(4, 255, 0);
            Color rgb2 = new Color(76, 220, 255);
            Color rgb3 = new Color(215, 0, 255);
            Color rgb4 = new Color(255, 130, 0);
            graphics.setColor(rgb1);
            graphics.drawLine(20, 100, 200, 100);
            graphics.setColor(rgb2);
            graphics.drawLine(200, 100, 200, 280);
            graphics.setColor(rgb3);
            graphics.drawLine(20, 280, 200, 280);
            graphics.setColor(rgb4);
            graphics.drawLine(20, 100, 20, 280);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}