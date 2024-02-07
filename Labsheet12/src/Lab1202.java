import java.util.Scanner;
import java.io.*;
public class Lab1202 {

	public static void main(String[] args) throws IOException{
		Scanner email = new Scanner(System.in);
		System.out.print("Input email: ");
		String emailInput = email.next();
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		while(readFile.hasNext()) {
			String fname = readFile.next();
			String lname = readFile.next();
			String Pass = readFile.next();
			String emails =readFile.next();
			if(emailInput.equalsIgnoreCase(emails)) {
				System.out.println("Your password is "+Pass);
				break;
			}else 
			 {
				System.out.println("The data not found...");
			
				break;
			}
		}
		readFile.close();

	}

}
