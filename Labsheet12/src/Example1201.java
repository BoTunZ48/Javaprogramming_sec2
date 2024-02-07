import java.util.Scanner;
import java.io.*;
public class Example1201 {

	public static void main(String[] args) throws IOException{
		//use Scanner Class read data from file
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		while(readFile.hasNext()) {
			String fname = readFile.next(); //read name data to fullname variable
			String lname = readFile.next(); //read File.next(); read name data to lastname variable
			readFile.next();
			String email =readFile.next().toUpperCase(); //read name data to email variable
			System.out.println(fname+" "+"("+email+")");
		}
		readFile.close();

	}

}
