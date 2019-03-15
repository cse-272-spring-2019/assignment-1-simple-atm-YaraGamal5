package atm.y;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */

public  class MyAtm implements Atm{

     Client c ;
     int cnt = 0;
     double currentbal;
     String Password ;
     ArrayList<String> History = new ArrayList<>();
     
     public boolean login (String Password){
         //return this.Password.equals(Password);
         return this.c.getCardNum().equals(Password);
     }
      
      public void Account (String P , double cb)
      {
          Password = P ;
          currentbal = cb ;
      }
    
    

    public MyAtm(Client c) {
        this.c = c;
    }
            
    /**
     *
     * @return
     */
    @Override
    public String getCurrentBalance() {
        
        return c.getBalance()+"";
    } 
    
        

    /**
     *
     * @param amount
     */
     @Override
    public void withdraw(String amount) {
 double x = Double.parseDouble(amount);
        if(c.getBalance() > x)
        { double currentbal = c.getBalance();
            c.setBalance(currentbal - x);
            History.add("Withdrawn"+ amount);
            cnt++;
    }
      
        
    }

   

    @Override
    public void deposit(String amount) {
        double dep = Double.parseDouble(amount);
         double currentbal = c.getBalance();
            c.setBalance(currentbal + dep);
            History.add("Added"+amount);
               cnt++;            
        
    }

    @Override
    public String prev() {
        if(cnt==0)
        { 
           return ("NONE");
        } return History.get(--cnt) ;
       
    }

    @Override
    public String next() {
         
        if(cnt==History.size()-1)
        {
            return ("NONE");
        } return History.get(++cnt) ;
        
    }
    

 
    }