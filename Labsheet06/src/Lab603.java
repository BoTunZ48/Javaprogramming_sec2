import java.util.*;
public class Lab603 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Plaese enter your name, separated by a space.\n:");
			String fullName = scan.nextLine();
		 //abbreviatName(fullName);
			int space = fullName.indexOf(" ");
		String firstName = fullName.substring(0,space);
		 System.out.print(abbreviatName(fullName)+firstName);
	}

	  	
	
	public static String abbreviatName(String fullName) {
	String Name = "";
		for(int i=0;i<fullName.length();i++) {
			if(fullName.charAt(i)==' ') {
				Name = Name + fullName.charAt(i+1)+".";
			}
		}	
	 return Name.toUpperCase();
	
		 
	 
	 }
	}


