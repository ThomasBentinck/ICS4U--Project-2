import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main {

    Rectangle rekt = new Rectangle(200, 200, 100, 100, Color.green);
    final int SCREENBUFFER = 22;

    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel(){
        public void paint(Graphics g){
            //Setup
            Graphics2D g2 = (Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2.setColor(rekt.getColour());
            g2.drawRect(rekt.getX(), rekt.getY(), rekt.getWidth(), rekt.getHeight());
        }
    };
    private MouseListener ml = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            int x = e.getX();
            int y = e.getY()-SCREENBUFFER;
            if(rekt.isHovered(x, y)){
                //Do something
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }
        @Override
        public void mouseReleased(MouseEvent e) {
        }
        @Override
        public void mouseEntered(MouseEvent e) {
        }
        @Override
        public void mouseExited(MouseEvent e) {
        }
    };

    public Main(){
        //Panel and frame setup
        frame.setSize(1440, 900);
        frame.add(panel);
        frame.addMouseListener(ml);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Main main = new Main();
    }
}
