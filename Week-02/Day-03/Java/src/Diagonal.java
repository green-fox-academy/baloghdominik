import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonal {
    public static void mainDraw(Graphics graphics) {
        // Draw the canvas' diagonals.
        // If it starts from the upper-left corner it should be green, otherwise it should be red.
        Color rgb1 = new Color(4, 255, 0);
        Color rgb2 = new Color(76, 220, 255);
        graphics.setColor(rgb1);
        graphics.drawLine(0, 0, 320, 343);
        graphics.setColor(rgb2);
        graphics.drawLine(0, 343, 320, 0);


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