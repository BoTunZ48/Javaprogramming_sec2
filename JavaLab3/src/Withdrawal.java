import javax.swing.*;
import java.util.Random; // use library for Random class
public class Withdrawal {

	public static void main(String[] args) {
		//using class Random for random money 
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9) * 100000;
		//JOptionPane.showMessageDialog(null, "Your balance : " + balance);
		int money = Integer.parseInt(JOptionPane.showInputDialog("Your balance : " 
		                                  + balance + "\nInput money to withdraw"));
		//JOptionPane.showInputDialog("Your balance : "
		//+ balance + "\nInput money to withdraw");
		 if(money>balance){
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance"
					,"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		 else if(money>20000) {
			 JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 20,000"
						,"ERROR",JOptionPane.ERROR_MESSAGE);
		 }
		 else if(money%100!=0) {
			 JOptionPane.showMessageDialog(null, "Error: Cannot withdraw "+ money%100 + " baht."
						,"ERROR",JOptionPane.ERROR_MESSAGE);
		 }
		 else {
			 JOptionPane.showMessageDialog(null, "You withdraw "+ money + " baht."
					 +"\n1000 = "+(money/1000)+"\n500 = "+ (money%1000)/500 + "\n100 = "+(money%500)/100);
			 
		 }
	
		
			
		
		
		

	}

}
