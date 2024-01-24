
public class Person {
	//declare 2 private attributes
	private String firstName;
	private String lastName;
	
	//Default constructor
	//Initialize FirstName and lastName to an empty 
	Person(){
		firstName = "";
		lastName = "";
	}
	//Constructor with parameters
	Person(String first,String last){
		//firstName = first;
		//lastName = last; ถ้ามี method เรียกใช้ได้เลย
		setName(first,last);
	}
	//method to set firstName and lastName according to parameters
	public void setName(String first,String last) {
		firstName = first;
		lastName = last;
	}
	
	//method to return firstName
	public String getFirstName() {
		return firstName;
	}
	//method to return lastName
	public String getLastName() {
		return lastName;
	}
	//method to output firstname and lastname
	public String toString() {
		return firstName+" "+lastName;
		
	}

}
