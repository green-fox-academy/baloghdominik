import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        triangles(graphics);
    }

    private static void triangles(Graphics graphics) {
        Colors(graphics);
        MainTriangle(graphics);
        HorizontalLines(graphics);
        LeftToRightLines(graphics);
        RightToLeftLines(graphics);
    }

    private static void RightToLeftLines(Graphics graphics) {
        int x1 = 210;
        int y1 = 37;
        int x2 = 120;
        int y2 = 190;

        for (int i = 0; i < 9; i++) {
            graphics.drawLine(x1,y1,x2,y2);
            x1 += 10;
            y1 += 17;
            x2 += 20;
        }
    }

    private static void LeftToRightLines(Graphics graphics) {
        int x1 = 190;
        int y1 = 37;
        int x2 = 280;
        int y2 = 190;

        for (int i = 0; i < 9; i++) {
            graphics.drawLine(x1,y1,x2,y2);
            x1 -= 10;
            y1 += 17;
            x2 -= 20;
        }
    }

    private static void HorizontalLines(Graphics graphics) {
        int x1 = 200;
        int y1 = 20;
        int x2 = 200;
        int y2 = 20;

        for (int i = 0; i < 10; i++) {
            x1 -= 10;
            y1 += 17;
            x2 += 10;
            y2 += 17;
            graphics.drawLine(x1, y1,x2,y2);
        }
    }

    private static void MainTriangle(Graphics graphics) {
        graphics.drawLine(200, 20,100,190);
        graphics.drawLine(100, 190,300,190);
        graphics.drawLine(300, 190,200,20);
    }

    private static void Colors(Graphics graphics) {
        int R = (int)(Math.random( )*256);
        int G = (int)(Math.random( )*256);
        int B = (int)(Math.random( )*256);
        Color randomColor = new Color(R, G, B);
        graphics.setColor(randomColor);
    }

    // Canvas
    static int WIDTH = 400;
    static int HEIGHT = 400;

    public static void main(String[] args) throws InterruptedException {
        JFrame jFrame = new JFrame("Triangles");
        ImagePanel imagePanel = new ImagePanel();

        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(imagePanel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        imagePanel.setBackground(Color.black);

        while(true) {
        imagePanel.repaint();
        Thread.sleep(100);
        }
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
