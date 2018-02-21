import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {
    public static void mainDraw(Graphics graphics) {
        int size = 10;
        steps(size,graphics);

    }

    private static void steps(int size, Graphics graphics) {
        int k = 10;
        Color purple1 = new Color(0, 0, 0);
        graphics.setColor(purple1);
        int size2 = size;

        for(int i = 0; i < 5; i++) {
            graphics.fillRect(k, k, size2 + 2, size2 + 2);
            size2 = size2 * 2;

            k = k * 2;
        }

        int k2 = 10;
        Color black1 = new Color(180, 0, 255);
        graphics.setColor(black1);
        int size3 = size;
        for(int i = 0; i < 5; i++) {
            graphics.fillRect(k2+2, k2+2, size3 - 2, size3 - 2);
            size3 = size3 * 2;

            k2 = k2 * 2;
        }

    }

    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 400;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("TK");
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