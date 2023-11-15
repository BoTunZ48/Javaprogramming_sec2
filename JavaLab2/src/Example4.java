import java.text.DecimalFormat;

import javax.swing.*; //1.import library input data from dialog box
public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//2.Display and input data from dialog box
		String productName = JOptionPane.showInputDialog("Input product name : ");
		
		/*String strUnit = JOptionPane.showInputDialog("Input product unit : ");
		//convort string to int 
		int unitPrice = Integer.parseInt(strUnit);*/
		
		int unitPrice = Integer.parseInt(JOptionPane.showInputDialog("Input product unit : "));
		float pricePerUnit = Float.parseFloat(JOptionPane.showInputDialog("Input Price per unit : "));
		
		double totalPrice = unitPrice * pricePerUnit;
		double vat = totalPrice +(totalPrice*7/100);
		
		//show message from diaalog box
		JOptionPane.showMessageDialog(null, "Total Price is "
				+ frm.format(totalPrice)+" baht."
						+ "\n Add VAT 7% is "+frm.format(vat) + " baht.");
		
		
	}

}
