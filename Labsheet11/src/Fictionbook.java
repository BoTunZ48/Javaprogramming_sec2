import java.time.Year;

public class Fictionbook implements Author,Book{
	private String author_name=" ";
	private String email;
	private String title;
	private int publicYear;
	private int space;
	private String firstname,lastname;
	
	Fictionbook(String title,int publicYear){
		
		this.title = title;
		this.publicYear = publicYear;
	}
	public void setAuthorName(String name) {
		this.author_name = author_name;
		
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean checkFormatName() {
		if(this.author_name.indexOf(" ") != 1) {
			return true;
		}else return false;
		
		
		
	}			
	@Override
	public String getFirstName() {
		space = author_name.indexOf(" ");
		firstname = author_name.substring(0,space);
		return firstname.toUpperCase();
	}
	@Override
	public String getLastName() {
		space = author_name.indexOf(" ");
		firstname = author_name.substring(space+1);
		return lastname.toUpperCase();
	}
	@Override
	public boolean checkEmail() {
		if(email.endsWith("hotmail.com")|| email.endsWith("windowslive.com")) {
			return true;
		}else return false;
	}
	@Override
	public String getTitle() {		
		return title;
	}
	public int totalpublicYear() {
		return Year.now().getValue() - publicYear;
	}
	public String toString() {
		return this.title+" write by "+lastname.substring(0,1)+"."+firstname+"("+email+")"+"\n Published for "+publicYear+"Year";
	}
	


}
