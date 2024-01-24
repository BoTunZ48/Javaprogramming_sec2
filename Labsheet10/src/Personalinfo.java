
public class Personalinfo {
	private Person name; //object name reference class Person
	private Date bDay; //object bDay reference class Date
	//declare 1 private attribute
	private int personID;
	
	//default constructor
	//postcondition : firstName="",lastName=""
	//dMonth = 1, dDay=1, and dYear=1990
	//personID=0
	Personalinfo(){
		name = new Person(); //firstName="",lastName=""
		bDay = new Date();   //dMonth = 1, dDay=1, and dYear=1990
		personID = 0;
		
	}
	//Constructor with parameter
	Personalinfo(String first,String last,int month,int day,int year,int ID){
		name = new Person(first,last); //firstName = first , lastName = last
		bDay = new Date(month,day,year);
		personID = ID;
	}
	//method to set the personal information
	//call set method from class Person and class Date
	public void setPersonalinfo(String first,String last,int month,int day,int year,int ID){
		name.setName(first, last);
		bDay.setDate(month, day, year);
		personID = ID;
	}
	//method to return the string of personal information
	public String toString() {
		return "Name: "+ name.toString() +
				"\n"+"Date of birth: "+bDay.toString()+
				"\n"+"Personal ID: "+ personID;
	}
	

}
