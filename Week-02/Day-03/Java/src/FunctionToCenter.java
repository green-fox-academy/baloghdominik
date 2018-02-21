import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int x = 15;
        int y = 18;

        tocenter(x,y,graphics);

    }

    private static void tocenter(int x, int y, Graphics graphics) {
        graphics.drawLine(x, y, 200, 200);


        int linex = 0;
        int liney = 0;


            for (int i = 0; i < 20; i++) {
                graphics.drawLine(linex, liney, 200, 200);
                linex += 20;
            }
            for (int o = 0; o < 20; o++) {
                graphics.drawLine(linex, liney, 200, 200);
                liney += 20;
            }
            for (int i = 0; i < 20; i++) {
                graphics.drawLine(linex, liney, 200, 200);
                linex -= 20;
            }
            for (int i = 0; i < 20; i++) {
                graphics.drawLine(linex, liney, 200, 200);
                liney -= 20;
            }
    }

    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 421;
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