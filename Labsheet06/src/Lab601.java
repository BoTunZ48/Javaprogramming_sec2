import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		inputEmail();
	}
		public static void inputEmail() {
		String inputEmail = JOptionPane.showInputDialog("Input your Email : ").toLowerCase();
		boolean chkEmail = checkEmail(inputEmail);
		displayEmail(chkEmail,inputEmail);
		}
		

	//end main()
	public static boolean checkEmail(String email) {
		if(email.endsWith("hotmail.com")|| email.endsWith("gmail.com")) {
			return true;
			
		}else return false;
	}
	//end checkEmail()
	public static void displayEmail(boolean chEmail,String inEmail) {
		//JOptionPane.showMessageDialog(null,"Your Email is "+inputEmail);
				if(chEmail==true) 
				{
					JOptionPane.showMessageDialog(null, "your e-mail is "+inEmail);
				}else {
					JOptionPane.showMessageDialog(null, "your e-mail is not hotmail or gmail");
				}
		
	}

}
