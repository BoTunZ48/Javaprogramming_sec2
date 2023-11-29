import java.text.DecimalFormat;
import java.util.*;
public class Salespersonsalary {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;
		Scanner scan = new Scanner(System.in);
		int sales;
		double salary;
		while(true) 
		{
			System.out.print("Enter sales in dollars (or -1 to end): ");
			sales = scan.nextInt();
			if(sales==SENTINEL) 
			{
				break;
			}
			salary = 1000+(sales*COMMISSION_RATE);
			System.out.println("Salary is "+frm.format(salary));
		}
		System.out.print("Bye");
		//System.out.print("Salary is: ");
		//salary = scan.nextInt();
		

	}

}
