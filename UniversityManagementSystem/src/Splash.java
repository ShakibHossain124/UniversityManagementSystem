import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    ImageIcon i1 = new ImageIcon("Icons/cover.jpg");
    Image i2 = i1.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
    ImageIcon splashPic = new ImageIcon(i2);

    ImageIcon welcome = new ImageIcon("Icons/welcome.jpeg");
    JPanel mainPanel = new JPanel();
    JLabel mainLabel = new JLabel();
    JButton nextPage = new JButton();
    Splash(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800,600);
        this.setTitle("UniversityManagementSystem");
        this.setLocationRelativeTo(null);
        this.getContentPane().add(mainPanel);
        windowComponents();
        this.setVisible(true);

    }

    void windowComponents(){
        mainLabel.setIcon(splashPic);
        mainPanel.add(mainLabel);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(-5,0,0,0));
        mainLabel.add(nextPage);
        nextPage.setBackground(new Color(0xA7FECC5, true));
        nextPage.setBounds(0, 512,800,50);
        nextPage.setIcon(welcome);
        nextPage.addActionListener((e)->{
            new LogIn();
            dispose();
        });
    }
}

