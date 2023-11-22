import java.text.DecimalFormat;

import javax.swing.*; //import library for input data dialog box

public class Example1 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,##0.00");
		final int BUFFET = 299;
		//input and convert data from dialog box
		int numberCustomber = Integer.parseInt(JOptionPane.showInputDialog("How many customber per bill?"));
		
		double priceAfterDiscount , totalPrice = 0;
		//calculate total price of BUFFET
		totalPrice = BUFFET * numberCustomber;
		//using show message for dialog box for display totalPrice
		//JOptionPane.showMessageDialog(null, "Amount to be paid is " + totalPrice + " baht.");
		//using confirm dialog box 
		int memberCard;		
		do{
			memberCard = JOptionPane.showConfirmDialog(null, "Total price is " 
		    + frm.format(totalPrice) + " baht." + "\nDo you have a member card?");
		}while(memberCard==JOptionPane.CANCEL_OPTION);
		
		if(memberCard==JOptionPane.YES_OPTION) 
		{
			priceAfterDiscount = totalPrice * 90/100; //discount 10%
			JOptionPane.showMessageDialog(null, "Amount to be paid is " 
			                             + frm.format(priceAfterDiscount) + " baht.");
		}
		
		else if (memberCard==JOptionPane.NO_OPTION) 
		{
			JOptionPane.showMessageDialog(null, "Amount to be paid is " 
		                                         + frm.format(totalPrice) + " baht.");
		}
		

	}

}
