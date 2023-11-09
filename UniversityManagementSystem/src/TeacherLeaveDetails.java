import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class TeacherLeaveDetails extends JFrame {
    JPanel panel;
    JLabel title;
    JTable table;

    TeacherLeaveDetails() {
        initComponent();
        windowComponent();
        setVisible(true);
    }



    private void initComponent() {
        setTitle("Teacher Leave Details");
        setSize(1000, 700);
        panel = (JPanel) getContentPane();
        panel.setLayout(null);
        panel.setBackground(new Color(0x70B5F3));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void windowComponent() {
        title = new JLabel("Teacher Leave Details");
        panel.add(title);
        title.setOpaque(true);
        title.setFont(new Font("Roboto", Font.BOLD, 50));
        title.setBackground(new Color(0x1E90FF));
        title.setForeground(Color.BLACK);
        title.setHorizontalAlignment(JLabel.CENTER);

        table = new JTable();
        table.setBackground(new Color(0x95C5F1));
        try{
            Database db = new Database();
            ResultSet resultSet = db.statement.executeQuery("SELECT * FROM `teacher leave`");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e1){
            throw new Error(e1);
        }

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                title.setSize(getWidth(), 100);
                scrollPane.setBounds(0,100,getWidth(),getHeight()-200);
            }
        });

    }

}
