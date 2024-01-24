
public class Customer {
	private int id;
	private String name;
	private int discount;
	
	Customer(int id, String name,int discount){
	   this.id = id;
	   this.discount = discount;
	   this.name = name;
		
		
	}
	public int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String toString() {
		return this.getName()+"("+this.getID()+")("+this.discount+"%)";
	}

}
