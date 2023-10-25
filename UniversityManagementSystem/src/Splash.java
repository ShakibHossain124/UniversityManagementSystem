import javax.swing.*;

public class Splash extends JFrame {
    ImageIcon splashPic = new ImageIcon("Icons/cover.jpg");
    JPanel mainPanel = new JPanel();
    JLabel mainLabel = new JLabel();
    Splash(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("UniversityManagementSystem");

        this.getContentPane().add(mainPanel);
        mainLabel.setIcon(splashPic);
        mainPanel.add(mainLabel);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(-5,-5,-5,-5));

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}

