import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {
        int size = 20;
        steps(size,graphics);

    }

    private static void steps(int size, Graphics graphics) {
        int k = 22;
        Color purple1 = new Color(0, 0, 0);
        graphics.setColor(purple1);

        for(int i = 0; i < 15; i++) {
            graphics.fillRect(k, k, size + 2, size + 2);

            k = k + 22;
        }

        int k2 = 24;
        Color black1 = new Color(180, 0, 255);
        graphics.setColor(black1);

        for(int i = 0; i < 15; i++) {
            graphics.fillRect(k2, k2, size-2, size-2);

            k2 = k2 + 22;
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