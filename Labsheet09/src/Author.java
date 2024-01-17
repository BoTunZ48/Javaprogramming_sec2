
public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name,String email,char gender) {
		this.email = email;
		this.gender = gender;
		this.name = name;
	}
	public Author(String name,String email) {
		
	}
	public Author() {
		
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getGenderName() {
		if(gender=='m') {
			return "Male";
		}
		if(gender=='f') {
			return "Female";
		}
		else return null;
	}
	public String toString() {
		return "Author name: "+name+" ( "+email+";"+getGenderName()+" )";
	} 

}
