import javax.swing.*;
public class Shop100baht {

	public static void main(String[] args) {
		Product sold = new Product();
		int buttonComfirm = JOptionPane.showConfirmDialog(null, "Pattanakarn?");
		if(buttonComfirm==0) {
			sold = new PattanakarnBranch();
		}
		
		
		int numberofProduct = Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:"));
		
		sold.setUnit(numberofProduct);
		JOptionPane.showMessageDialog(null, sold.toString());

	}

}
