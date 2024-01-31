import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input title: ");
		String title = scan.nextLine();
		System.out.print("Input year: ");
		int year = scan.nextInt();
		Fictionbook fb = new Fictionbook(title,year);
		scan.nextLine();
		System.out.print("Input firstname and lastname: ");
		String name = scan.nextLine();
		fb.setAuthorName(name);
		while(!fb.checkFormatName()){
			System.out.print("Input firstname and lastname: ");
			name = scan.nextLine();
			fb.setAuthorName(name);
		}
	
		System.out.print("Input email: ");
		String email = scan.next();
		fb.setEmail(email);
		
		while(!fb.checkEmail()) {
		System.out.print("Input email: ");
		 email = scan.next();
		fb.setEmail(email);
		
	}
		System.out.println(fb);
	}
}
