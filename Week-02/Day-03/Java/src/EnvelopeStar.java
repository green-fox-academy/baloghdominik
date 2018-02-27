import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    static int R = 0;
    static int G = 0;
    static int B = 0;

    static int R1 = 0;
    static int G1 = 0;
    static int B1 = 255;

    public static void mainDraw(Graphics graphics) {
        Star(graphics);
    }

    private static void Star(Graphics graphics) {
        //Colors(graphics);
        MainLine(graphics);
        TopLeft(graphics);
        TopRight(graphics);
        BottomLeft(graphics);
        BottomRight(graphics);
    }

    private static void BottomRight(Graphics graphics) {
        int x1 = 200;
        int y1 = 410;
        int x2 = 200;
        int y2 = 200;

        for (int i = 0; i < 20; i++) {
            x2 += 10;
            y1 -= 10;
            graphics.drawLine(x1, y1,x2,y2);
        }
    }

    private static void BottomLeft(Graphics graphics) {
        int x1 = 200;
        int y1 = 410;
        int x2 = 200;
        int y2 = 200;

        for (int i = 0; i < 20; i++) {
            x2 -= 10;
            y1 -= 10;
            graphics.drawLine(x1, y1,x2,y2);
        }
    }

    private static void TopRight(Graphics graphics) {
        int x1 = 410;
        int y1 = 200;
        int x2 = 200;
        int y2 = 200;

        for (int i = 0; i < 20; i++) {
            x1 -= 10;
            y2 -= 10;
            graphics.drawLine(x1, y1,x2,y2);
        }
    }

    private static void TopLeft(Graphics graphics) {
        int x1 = -10;
        int y1 = 200;
        int x2 = 200;
        int y2 = 200;

        for (int i = 0; i < 20; i++) {
            x1 += 10;
            y2 -= 10;
            graphics.drawLine(x1, y1,x2,y2);
        }
    }

    private static void MainLine(Graphics graphics) {
        graphics.drawLine(200, 0,200,400);
    }

    /*private static void Colors(Graphics graphics) {
        int R = (int)(Math.random( )*256);
        int G = (int)(Math.random( )*256);
        int B = (int)(Math.random( )*256);
        Color randomColor = new Color(R, G, B);
        graphics.setColor(randomColor);
    }*/

    private static void ColorLoop(Graphics graphics) {
        if (R < 255 && G == 0 && B == 0) {
            R++;
            System.out.println("R "+ R +" G "+ G +" B "+ B);
        } else if (B < 255 && G == 0 && R == 255) {
            B++;
            System.out.println("R "+ R +" G "+ G +" B "+ B);
        } else if (R <= 255 && R >= 1 && G == 0 && B == 255) {
            R--;
            System.out.println("R "+ R +" G "+ G +" B "+ B);
        } else if (R == 0 && G < 255 && B == 255) {
            G++;
            System.out.println("R "+ R +" G "+ G +" B "+ B);
        } else if (R == 0 && G == 255 && B <= 255 && B >= 1) {
            B--;
            System.out.println("R "+ R +" G "+ G +" B "+ B);
        } else if (R < 255 && G == 255 && B == 0) {
            R++;
            System.out.println("R "+ R +" G "+ G +" B "+ B);
        } else if (R == 255 && G <= 255 && G >= 1 && B == 0){
            G--;
            System.out.println("R "+ R +" G "+ G +" B "+ B);
        }
        Color randomColor = new Color(R, G, B);
        graphics.setColor(randomColor);
    }
    /*private static void bgColorLoop(Graphics graphics) {
        if (R1 < 255 && G1 == 0 && B1 == 0) {
            R1++;
        } else if (B1 < 255 && G1 == 0 && R1 == 255) {
            B1++;
        } else if (R1 <= 255 && R1 >= 1 && G1 == 0 && B1 == 255) {
            R1--;
        } else if (R1 == 0 && G1 < 255 && B1 == 255) {
            G1++;
        } else if (R1 == 0 && G1 == 255 && B1 <= 255 && B1 >= 1) {
            B1--;
        } else if (R1 < 255 && G1 == 255 && B1 == 0) {
            R1++;
        } else if (R1 == 255 && G1 <= 255 && G1 >= 1 && B1 == 0){
            G1--;
        }
        Color randomColor = new Color(R, G, B);
        graphics.setColor(randomColor);
    }*/

    // Canvas
    static int WIDTH = 400;
    static int HEIGHT = 423;

    public static void main(String[] args) throws InterruptedException {
        JFrame jFrame = new JFrame("Star");
        ImagePanel imagePanel = new ImagePanel();

        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(imagePanel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

        imagePanel.setBackground(Color.black);


        while(true) {
            //Color bg = new Color(R1, G1, B1);
            //imagePanel.setBackground(bg);
            imagePanel.repaint();
            Thread.sleep(5);
       }
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            ColorLoop(graphics);
            //bgColorLoop(graphics);
            mainDraw(graphics);

        }
    }
}
