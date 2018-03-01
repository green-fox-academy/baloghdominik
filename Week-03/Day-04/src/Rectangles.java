import javax.swing.*;
        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Rectangles {
    public static void mainDraw(Graphics graphics) {
        rectangles(5, graphics);
    }

    private static int rectangles(int n,Graphics g) {
        int x = 0;
        int y = 0;
        if (n > 0) {
            n--;
            for (int k = 0; k < 3; k++) {
                for (int i = 0; i < 3; i++) {
                    g.drawRect(x, y, WIDTH / 3, WIDTH / 3);
                    x = x + WIDTH / 3;
                }
                y = y + WIDTH / 3;
                x = 0;
            }
            return rectangles(n,g);
        } else {
            return 0;
        }
    }

    // Canvas
    static int WIDTH = 300;
    static int HEIGHT = 323;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Rectangles");
        ImagePanel imagePanel = new ImagePanel();

        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(imagePanel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        imagePanel.setBackground(Color.yellow);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}