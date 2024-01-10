import java.util.*;
public class TestpiggyBank {
	static piggyBank pb = new piggyBank();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		/*piggyBank pb = new piggyBank();
		pb.setPiggyBank(500);
		System.out.println("Money Total : "+ pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money :"+34);
		System.out.println("Money total : "+pb.getTotal());
		pb.addTen (13);
		System.out.println("Add 2 Baht Money :"+13);
		System.out.println("Money total : "+pb.getTotal());
		pb.addFive(100);*/
		inputCoin();

	}
	public static void inputCoin() {
		System.out.println("Money Total : "+pb.getTotal());
		System.out.print("Please define size of Piggybank: ");
		int sizeofpiggyBank = scan.nextInt();
		pb.setPiggyBank(sizeofpiggyBank);
		System.out.println("Money total : "+ pb.getPiggyBank());
		MainMenu();
		
		
	}
	public static void MainMenu() {
		while(true) {
		System.out.println("===================");
		System.out.println("Menu of PiggyBank");
		System.out.println("===================");
		System.out.println("[1] one baht.");
		System.out.println("[2] two baht.");
		System.out.println("[3] five baht.");
		System.out.println("[4] ten baht.");
		System.out.println("[5] Exit");
		System.out.println("===================");
		
		
		System.out.print("Please select Menu[1-5] : ");
		int Menu = scan.nextInt();
		if(Menu == 1) {
			System.out.print("insert 1 baht money : ");
			int mon = scan.nextInt();
			pb.addOne(mon);
			System.out.println("Total money : "+pb.getTotal());
			}
		if(Menu == 2) {
			System.out.print("insert 1 baht money : ");
			int mon = scan.nextInt();
			pb.addTwo(mon);
			System.out.println("Total money : "+pb.getTotal());
		}
		if(Menu == 3) {
			System.out.print("insert 1 baht money : ");
			int mon = scan.nextInt();
			pb.addFive(mon);
			System.out.println("Total money : "+pb.getTotal());
		}
		if(Menu == 4) {
			System.out.print("insert 1 baht money : ");
			int mon = scan.nextInt();
			pb.addTen(mon);
			System.out.println("Total money : "+pb.getTotal());
		}
		else if(Menu== 5){
			System.out.println("Bye Bye");
			break;
		}	

	}
}
}	
		

