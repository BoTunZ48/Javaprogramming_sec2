import java.util.*;
public class Authordemo1 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.print("Input author name   : ");
		String authorname = scan.nextLine();
		System.out.print("Input author email  : ");
		String authoremail = scan.nextLine();
		System.out.print("Input author gender : ");
		char authorgender = scan.next().charAt(0);
		Author author = new Author(authorname,authoremail,authorgender);
		System.out.println(author);

	}

}
