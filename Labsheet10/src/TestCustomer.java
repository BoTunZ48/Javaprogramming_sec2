
public class TestCustomer {

	public static void main(String[] args) {
		System.out.println("###Test Customer class###");
		 Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		 System.out.println(c1);
		 c1.setDiscount(5);
		 System.out.println(c1);
		 
		 // Customer's toString()
		 // set customer's discount is 5
		 // Customer's toString()

		 Line();
		 System.out.println("id is: "+c1.getID());
		 System.out.println("name is: "+c1.getName());
		 System.out.println("discount is: "+c1.getDiscount());
		 // show customer's id
		 // show customer's name
		 // show customer's discount
		 Line();
		 System.out.println("###Test Invoice class###");
		 Invoice inv1 = new Invoice(101, c1, 12000.00);
		System.out.println(inv1);
		inv1.setAmount(10000);
		System.out.println(inv1);
		 // Invoice's toString()
		 // set invoice's amount is 10000
		 // Invoice's toString()

		 Line();
		 System.out.println("id is: "+inv1.getCustomerID());
		 System.out.println(c1);
		 System.out.println("id is: "+inv1.getAmount());
		 
		 // show invoice's id
		 // Customer's toString() by instance inv1
		 // show invoice's amount
		 Line();
		 System.out.println("id is: "+c1.getID());
		 System.out.println("name is: "+c1.getName());
		 System.out.println("discount is: "+c1.getDiscount());
		 System.out.println("amount after this count is: "+inv1.getAmountAfterDiscount());
		 // show customer's id by instance inv1
		 // show customer's name by instance inv1
		 // show customer's discount by instance inv1
		 // show invoice's amount after discount(format as output)
		 } //end of main method()
		 public static void Line() {
		 System.out.println("*************************************************************");
		 }


	}

