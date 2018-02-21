import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainBowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,

        int size = 80;
        int R = 15;
        int G = 178;
        int B = 255;
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        rainbow(R,G,B,size,graphics);


    }

    private static void rainbow(int r1, int g1, int b1, int size, Graphics graphics) {


        int halfsize1 = size/2 ;
        int xy1 = 160-halfsize1;
        int s = 320;

        for (int i = 0; i < 160; i++) {
            s = s -2;
            int R = (int)(Math.random( )*256);
            int G = (int)(Math.random( )*256);
            int B = (int)(Math.random( )*256);
            Color randomColor = new Color(R, G, B);
            graphics.setColor(randomColor);
            graphics.fillRect(i, i, s, s);
        }

        Color randomColor = new Color(r1, g1, b1);
        graphics.setColor(randomColor);
        graphics.fillRect(xy1, xy1, size, size);

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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