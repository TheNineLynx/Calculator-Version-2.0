import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {

JPanel panel;
    MyFrame() {
        panel = new JPanel();
        
        this.setSize(500, 900);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Calculator Version 2.0");
        this.setResizable(false);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 400, 400));

        ImageIcon logo = new ImageIcon("calculatorLogo.png");
        this.setIconImage(logo.getImage());
        // this.getContentPane().setBackground(Color.BLACK);

        panel.setPreferredSize(new Dimension (300, 300));
        panel.setBackground(Color.black);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        this.add(panel);
        this.setVisible(true);
    }
}
