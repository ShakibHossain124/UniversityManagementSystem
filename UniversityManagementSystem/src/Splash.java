import javax.swing.*;

public class Splash extends JFrame {
    ImageIcon splashPic = new ImageIcon("Icons/cover.jpg");
    ImageIcon welcome = new ImageIcon("Icons/welcome.jpeg");
    JPanel mainPanel = new JPanel();
    JLabel mainLabel = new JLabel();
    JButton nextPage = new JButton();
    Splash(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("UniversityManagementSystem");
        this.getContentPane().add(mainPanel);
        windowComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    void windowComponents(){
        mainLabel.setIcon(splashPic);
        mainPanel.add(mainLabel);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(-5,-5,-5,-5));
        mainLabel.add(nextPage);
        this.pack();
        nextPage.setBounds(mainLabel.getWidth()/2-75, 50,150,50);
        nextPage.setIcon(welcome);
        nextPage.addActionListener((e)->{
            System.out.println("Next Page");
            dispose();
        });
    }
}

