package atm.y;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
public class Deposit extends JFrame  implements ActionListener{
    JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B0;
    JLabel L1;
    JTextField J1 ;
    JButton btn;
    MyAtm a1;
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   Deposit(MyAtm c)
{   a1=c;
     setLayout(null);
        L1 = new JLabel("Deposit:");
        L1.setFont(new Font("Raleway", Font.BOLD, 38));
        L1.setBounds(100, 50, 450, 200);
        add(L1);
        J1 = new JTextField(15);
        J1.setBounds(100, 190, 100, 50);
        add(J1);
       B1 = new JButton("0");
        B1.setBackground(Color.WHITE);
        B1.setForeground(Color.BLACK);
        B1.setBounds(330, 470, 100, 30);
        add(B1);
        B2 = new JButton("1");
        B2.setBackground(Color.WHITE);
        B2.setForeground(Color.BLACK);
        B2.setBounds(330, 110, 100, 30);
        add(B2);
        B3 = new JButton("2");
        B3.setBackground(Color.WHITE);
        B3.setForeground(Color.BLACK);
        B3.setBounds(330, 150, 100, 30);
        add(B3);
        B4 = new JButton("3");
        B4.setBackground(Color.WHITE);
        B4.setForeground(Color.BLACK);
        B4.setBounds(330, 190, 100, 30);
        add(B4);
        B5 = new JButton("4");
        B5.setBackground(Color.WHITE);
        B5.setForeground(Color.BLACK);
        B5.setBounds(330, 230, 100, 30);
        add(B5);
        B6 = new JButton("5");
        B6.setBackground(Color.WHITE);
        B6.setForeground(Color.BLACK);
        B6.setBounds(330, 270, 100, 30);
        add(B6);
        B7 = new JButton("6");
        B7.setBackground(Color.WHITE);
        B7.setForeground(Color.BLACK);
        B7.setBounds(330, 310, 100, 30);
        add(B7);
        B8 = new JButton("7");
        B8.setBackground(Color.WHITE);
        B8.setForeground(Color.BLACK);
        B8.setBounds(330, 350, 100, 30);
        add(B8);
        B9 = new JButton("8");
        B9.setBackground(Color.WHITE);
        B9.setForeground(Color.BLACK);
        B9.setBounds(330, 390, 100, 30);
        add(B9);
        B0 = new JButton("9");
        B0.setBackground(Color.WHITE);
        B0.setForeground(Color.BLACK);
        B0.setBounds(330, 430, 100, 30);
        add(B0);
        btn = new JButton("Finish");
        btn.setBackground(Color.DARK_GRAY);
        btn.setForeground(Color.CYAN);
        btn.setBounds(100, 270, 100, 30);
        add(btn);
        
        setSize(750, 750);
        setLocation(500, 200);
        
        B1.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
             J1.setText(J1.getText()+"0");
         }
     });
        B0.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
           J1.setText(J1.getText()+"9");  
         }});
     
        B2.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              J1.setText(J1.getText()+"1"); 
         }
     });
         B3.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              J1.setText(J1.getText()+"2"); 
         }
     });
          B4.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              J1.setText(J1.getText()+"3"); 
         }
     });
          B5.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              J1.setText(J1.getText()+"4"); 
         }
     });
          B6.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              J1.setText(J1.getText()+"5"); 
         }
     });
            B7.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
              J1.setText(J1.getText()+"6"); 
         }
     });
            B8.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
              J1.setText(J1.getText()+"7");
            }
         });
                      
             B9.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
              J1.setText(J1.getText()+"8");
            }
         });
                      
             btn.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                 a1.deposit(J1.getText());
                 setVisible(false);
             }
         });
         
     }}


