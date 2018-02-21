import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 1 parameter:
        // the square size
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.

        int size1 = 100;
        int size2 = 75;
        int size3 = 50;
        ctbox(size1,size2,size3,graphics);

    }
    public static void ctbox(int size1, int size2, int size3, Graphics graphics) {
        int halfsize1 = size1/2 ;
        int halfsize2 = size2/2 ;
        int halfsize3 = size3/2 ;
        int xy1 = 160-halfsize1;
        int xy2 = 160-halfsize2;
        int xy3 = 160-halfsize3;
            graphics.drawRect(xy1, xy1, size1, size1);
            graphics.drawRect(xy2, xy2, size2, size2);
            graphics.drawRect(xy3, xy3, size3, size3);
    }

    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}