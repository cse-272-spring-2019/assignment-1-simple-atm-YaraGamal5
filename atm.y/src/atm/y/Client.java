package atm.y;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Client {
    static int number;
   Client c;
    public static int cnt =0 ;
    private double balance ;
    private String CardNum ;

    /**
     *
     * @param balance
     * @param CardNum
     */
    public Client(double balance, String CardNum) {
        this.balance = balance;
        this.CardNum = CardNum;
    }
    public double getBalance(){
        return balance ;
    }
    
    

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCardNum() {
        return CardNum;
    }

    public void setCardNum(String CardNum) {
        this.CardNum = CardNum;
    }
    
    
    
   



}
