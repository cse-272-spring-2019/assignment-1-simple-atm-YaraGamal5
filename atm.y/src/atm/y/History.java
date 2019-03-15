package atm.y;

public class History {
	String cardNum ;
    String Pass ;
    double CurrentBal ;
    String[] history=new String[5];
    
    
    public boolean Login (String cardNumber, String Password) {
    	
    	if(this.cardNum.equals(cardNumber)&&this.Pass.equals(Password))
    	{
    		return true;
    	}
    	return false;
    	
  
    }
    History(String x,String y,double z)
    {
    	cardNum=x;
    	Pass=y;
    	CurrentBal=z;
    }

    public boolean Withdraw (String y ) {
    	double x=Double.parseDouble(y);
  
    	if(x<CurrentBal) {
  
    	CurrentBal=CurrentBal-x ;
    	 for (int i=0;i<4;i++) {
    		 history[i]=history[i+1];
    	 }
    	 history[0]="the amount withdrawn $"+x+ " your current balance $"+CurrentBal;
    	 
    	 return true;
    	}
    	return false;
    }
    public String displayBalance () {
    	return Double.toString(CurrentBal);
    }
    
    
    public void Deposit (String z) {
    	double x=Double.parseDouble(z);
         CurrentBal=CurrentBal+x;
    	 for (int i=0;i<4;i++) {
    		 history[i]=history[i+1];
    	 }
    	 history[0]="the amount of deposit $"+x+ " your current balance $"+CurrentBal;   	
    	}
    
    public String next () {
    	Client.number++;
    	if(Client.number>4) {
    		Client.number=4;
    		
    		System.out.println("ERROR");
    	}
    	return history[Client.number];    
    
}
    
    public String previous () {
    	Client.number--;
    	if(Client.number<0) {
    		Client.number=0;
    		System.out.println("ERROR");
    	}
    	return history[Client.number];    
    
}
}