import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        int size = 50;
        chekerboard(size,graphics);
    }

    private static void chekerboard(int size, Graphics graphics) {
        int k = 20;
        int k2 = 20;
        Color brown = new Color(84, 48, 32);
        Color lightbrown = new Color(192, 146, 86);
        Color darkbrown = new Color(47, 25, 16);

        graphics.setColor(darkbrown);
        graphics.fillRect(0, 0, 440, 440);

        for (int z = 0; z < 4; z++) {
            k = 20;
            for (int i = 0; i < 4; i++) {
                graphics.setColor(brown);
                graphics.fillRect(k, k2, size, size);
                k = k + size;
                graphics.setColor(lightbrown);
                graphics.fillRect(k, k2, size, size);
                k = k + size;

            }
            k = 20;
            k2 = k2 + size;
            for (int o = 0; o < 4; o++) {
                graphics.setColor(lightbrown);
                graphics.fillRect(k, k2, size, size);
                k = k + size;
                graphics.setColor(brown);
                graphics.fillRect(k, k2, size, size);
                k = k + size;
            }
            k2 = k2 + size;
        }



    }

    // Don't touch the code below
    static int WIDTH = 440;
    static int HEIGHT = 461;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Chess");
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