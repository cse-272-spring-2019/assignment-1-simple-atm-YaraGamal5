package atm.y;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LENOVO
 */
public class login extends JFrame implements ActionListener {

    JLabel L1, L2;
    JTextField T;
    JButton B1;
    JPasswordField pass;
    Client c = new Client(500000,"150398");
    MyAtm a1 = new MyAtm(c);
    static boolean check;
    

    login() {

        setLayout(null);
        L1 = new JLabel("Welcome");
        L1.setFont(new Font("Raleway", Font.BOLD, 35));

        L2 = new JLabel("CARD NO.:");
        L2.setFont(new Font("Raleway", Font.BOLD, 25));

        pass = new JPasswordField(15);

        B1 = new JButton("CONTINUE");
        B1.setBackground(Color.DARK_GRAY);
        B1.setForeground(Color.CYAN);

        L1.setBounds(175, 50, 450, 200);
        add(L1);

        L2.setBounds(125, 150, 375, 200);
        add(L2);

        pass.setFont(new Font("Raleway", Font.BOLD, 14));
        pass.setBounds(330, 230, 230, 30);
        add(pass);
        B1.setBounds(330, 270, 230, 30);

        add(B1);

    B1.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);
        setSize(750, 750);
        setLocation(500, 200);
        setVisible(true);

    
    
    }

            @Override
            public void actionPerformed(ActionEvent e) {
          String x = pass.getText();
        check = a1.login(x);
        if (check) {
           GUI g = new GUI(c);
            g.setVisible(true);

            }
           
    
    
    
            }
   



    public static void main(String[] args) {
        login m = new login();
        m.setVisible(true);

    }

    
    

}
