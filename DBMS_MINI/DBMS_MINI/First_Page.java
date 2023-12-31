package Cab_Booking_DBMS;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class First_Page extends JFrame implements ActionListener {

    public JButton user,driver,admin;

    public First_Page()
    {
        getContentPane().setBackground(Color.WHITE);
        setBounds(100, 100, 417, 564);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(154, 150, 150));
        panel.setBounds(0, 0, 420, 521);
        getContentPane().add(panel);
        panel.setLayout(null);



//******************************************************* USER BUTTON *******************************************************



        user = new JButton("USER");
        user.setBackground(new Color(105, 105, 105));
        user.setForeground(new Color(0, 0, 0));
        user.setFont(new Font("Verdana", Font.BOLD, 14));
        user.setBounds(200, 200, 169, 36);
        user.addActionListener(this);
        panel.add(user);

        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("Cab_Booking_DBMS/icons_dbms/User_login.png"));
        Image i17 = i16.getImage().getScaledInstance(90,90,Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        JLabel user = new JLabel(i18);
        user.setBounds(-10, 150, 210, 131);
        panel.add(user);


//******************************************************* DRIVER BUTTON *******************************************************


        driver = new JButton("DRIVER");
        driver.setBackground(new Color(105, 105, 105));
        driver.setForeground(new Color(0, 0, 0));
        driver.setFont(new Font("Verdana", Font.BOLD, 14));
        driver.setBounds(200, 300, 169, 36);
        driver.addActionListener(this);
        panel.add(driver);


        ImageIcon i19 = new ImageIcon(ClassLoader.getSystemResource("Cab_Booking_DBMS/icons_dbms/Driver.png"));
        Image i20 = i19.getImage().getScaledInstance(90,90,Image.SCALE_DEFAULT);
        ImageIcon i21 = new ImageIcon(i20);
        JLabel driver = new JLabel(i21);
        driver.setBounds(-10, 250, 210, 131);
        panel.add(driver);



//******************************************************* ADMIN BUTTON *******************************************************



        admin = new JButton("ADMIN");
        admin.setBackground(new Color(105, 105, 105));
        admin.setForeground(new Color(0, 0, 0));
        admin.setFont(new Font("Verdana", Font.BOLD, 14));
        admin.setBounds(200, 400, 169, 36);
        admin.addActionListener(this);
        panel.add(admin);


        ImageIcon i22 = new ImageIcon(ClassLoader.getSystemResource("Cab_Booking_DBMS/icons_dbms/Admin_icon.png"));
        Image i23 = i22.getImage().getScaledInstance(90,90,Image.SCALE_DEFAULT);
        ImageIcon i24 = new ImageIcon(i23);
        JLabel admin = new JLabel(i24);
        admin.setBounds(-10, 350, 210, 131);
        panel.add(admin);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("Cab_Booking_DBMS/icons_dbms/cab.png"));
        Image i14 = i13.getImage().getScaledInstance(130,130,Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel User_img = new JLabel(i15);
        User_img.setBounds(97, 30, 210, 131);
        panel.add(User_img);

    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        // TODO Auto-generated method stub
        if(e.getSource()== user)
        {
            this.dispose();
            new User_Login_Main().setVisible(true);
        }
        else if(e.getSource()==driver)
        {
            this.dispose();
            new Driver_Login_Main().setVisible(true);
        }
        else if(e.getSource()==admin)
        {
            this.dispose();
            new Admin_Login_Main().setVisible(true);
        }
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
                                   public void run() {
                                       try
                                       {
                                           new First_Page().setVisible(true);
                                       }
                                       catch (Exception e)
                                       {
                                           e.printStackTrace();
                                       }
                                   }
                               }
        );
    }
}
