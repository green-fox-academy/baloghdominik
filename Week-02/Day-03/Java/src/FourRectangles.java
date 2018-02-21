import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        int x = 0;
        int y = 0;

        for (int i = 0; i < 4; i++) {
            int R = (int)(Math.random( )*256);
            int G = (int)(Math.random( )*256);
            int B = (int)(Math.random( )*256);
            Color randomColor = new Color(R, G, B);
            graphics.setColor(randomColor);
            x = (int)(Math.random( )*250);
            y = (int)(Math.random( )*250);
            graphics.fillRect(x, y, 10, 10);
        }


    }

    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}