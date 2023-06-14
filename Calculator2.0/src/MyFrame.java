import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
    
    MyFrame() {
        
        this.setSize(500, 900);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Calculator Version 2.0");
        this.setResizable(false);

        ImageIcon logo = new ImageIcon("calculatorLogo.png");
        this.setIconImage(logo.getImage());
        this.getContentPane().setBackground(Color.BLACK);
    }
}
