import java.util.*;
public class Bookdemo {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Book book = new Book();
		System.out.println();
		
		System.out.print("Input book title   : ");
		String Booktitle = scan.nextLine();
		System.out.print("Input book price   : ");
		float bookPrice = scan.nextFloat();
		System.out.print("Input publish year : ");
		int pubishYear = scan.nextInt();
		
		book.setTitle(Booktitle);
		book.setPrice(bookPrice);
		book.setPublishyer(pubishYear);
		
		System.out.println(book.toString());

	}

}
