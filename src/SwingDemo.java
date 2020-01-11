import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class SwingDemo {
    SwingDemo() {
        int x = 100;
        int y = 50;
        JFrame jfrm = new JFrame("Window Application");
        jfrm.setLayout(null);
        jfrm.setSize(640,480);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jbtnExit = new JButton("Exit");
        jbtnExit.setBounds(x,y,60,30);
        jbtnExit.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                int x = rangeRand(0, jfrm.getBounds().width - 100);
                int y = rangeRand(0, jfrm.getBounds().height - 100)+30;
                jbtnExit.setBounds(x, y,60,30);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        jbtnExit.setLayout(null);
        jfrm.add(jbtnExit);
        jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
    private static int rangeRand(int min, int max) {
        Random random = new Random();
        return min + random.nextInt(max);
    }
}

