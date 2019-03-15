package atm.y;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LENOVO
 */
public class GUI extends JFrame implements ActionListener {

    JButton B1;
    JButton B2;
    JButton B3;
    JButton B4;
    JButton B5;
    JLabel L1,L2,L3 ;
    MyAtm a1 ;
  
    GUI(Client c) {
        a1 = new MyAtm(c);

        setLayout(null);
        B1 = new JButton("Deposit");
        B1.setBackground(Color.WHITE);
        B1.setForeground(Color.BLACK);
        B1.setBounds(230,240, 230, 30);
        add(B1);
        B2 = new JButton("Withdraw");
        B2.setBackground(Color.WHITE);
        B2.setForeground(Color.BLACK);
        B2.setBounds(230, 280, 230, 30);
        add(B2);
        B3 = new JButton("Your Current Balance");
        B3.setBackground(Color.WHITE);
        B3.setForeground(Color.BLACK);
        B3.setBounds(230, 200, 230, 30);
        add(B3);
        B4 = new JButton("PREVIOUS");
        B4.setBackground(Color.DARK_GRAY);
        B4.setForeground(Color.CYAN);
        B4.setBounds(90,320, 230, 30);
        add(B4);
        B5 = new JButton("NEXT");
        B5.setBackground(Color.DARK_GRAY);
        B5.setForeground(Color.CYAN);
        B5.setBounds(400, 320, 230, 30);
        add(B5);
         
        L1= new JLabel("WHAT DO YOU WANT?");
        L1.setFont(new Font("Raleway", Font.BOLD, 20));
        L1.setBounds(230, 50, 530, 30);
        add(L1); 
        
        L2 = new JLabel("0000");
        L2.setFont(new Font("Raleway",Font.BOLD,20));
        L2.setBounds(160, 360, 230, 30);
        add(L2);

        
        L3 = new JLabel("0000");
        L3.setFont( new Font("Raleway", Font.BOLD, 20));
        L3.setBounds(500, 360, 230, 30);
        add(L3);
        
        

  //      btn1.addActionListener(this);
        getContentPane().setBackground(Color.WHITE);
        setSize(750, 750);
        setLocation(500, 200);
        setVisible(true);

        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Withdraw w = new Withdraw(a1);
                w.setVisible(true);
                w.setSize(750, 750);

            }
        });

        B1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Deposit d = new Deposit(a1);
                d.setVisible(true);
                d.setSize(750, 750);

            }
        });
          
        B3.addActionListener (new ActionListener(){

    @Override
    public void actionPerformed(ActionEvent e) {
       L1.setText(c.getBalance()+"");
      
        
    }});   
        
          B4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            L2.setText(a1.prev());
            }
        });
          
           B5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            L3.setText(a1.prev());
            }
        });
          

  
}

    GUI(String x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}