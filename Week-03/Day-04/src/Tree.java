import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {
    static int R = 0;
    static int G = 100;
    static int B = 0;
    static int C = 1;
    static int S = 0;
    static double r = 6.0;
    public static void mainDraw(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        ColorLoop(g);
        changeSize();
        drawTree(g, WIDTH/2, WIDTH, -90, 10, r);
    }

    private static void changeSize() {
        if (r < 6.5 && r >= 5.5 && S == 0) {
            r = r + 0.05;
        } else if (r >= 6.5 && S == 0) {
            S = 1;
            r = r - 0.05;
        } else if (r <= 6.5 && r >= 5.5 && S == 1) {
            r = r - 0.05;
        } else if (r <= 5.5 && S == 1) {
            S = 0;
            r = r + 0.05;
        }
    }

    private static void drawTree(Graphics g, int x1, int y1, double angle, int depth, double r) {
        if (depth == 0)
            return;
        int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * r);
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * r);
        g.drawLine(x1, y1, x2, y2);
        drawTree(g, x2, y2, angle - 20, depth - 1,r);
        drawTree(g, x2, y2, angle - 0, depth - 1,r);
        drawTree(g, x2, y2, angle + 20, depth - 1,r);
    }

    private static void ColorLoop(Graphics graphics) {
        if (G < 255 && G >= 100 && C == 1) {
            G++;
            System.out.println(G+" "+C);
        } else if (G == 255 && C == 1) {
            C = 0;
            G--;
            System.out.println(G+" "+C+" SET 0");
        } else if (G <= 255 && G >= 101 && C == 0){
            G--;
            System.out.println(G+" "+C);
        } else if (G == 100 && C == 0) {
            C = 1;
            G++;
            System.out.println(G+" "+C+" SET 1");
        }
        Color randomColor = new Color(R, G, B);
        graphics.setColor(randomColor);
    }

    // Canvas
    static int WIDTH = 500;
    static int HEIGHT = 523;

    public static void main(String[] args) throws InterruptedException {
        JFrame jFrame = new JFrame("Tree");
        ImagePanel imagePanel = new ImagePanel();

        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(imagePanel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        Color bgColor = new Color(51, 51, 51);
        imagePanel.setBackground(bgColor);

        while(true) {
            imagePanel.repaint();
            Thread.sleep(5);
        }
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            mainDraw(g);
        }
    }
}
