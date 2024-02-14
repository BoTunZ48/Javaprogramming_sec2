import java.util.*;
import java.io.*;
public class EmplyeeInfo {

	public static void main(String[] args) throws IOException{
		int i=1;
		Scanner scan = new Scanner(System.in);
		String choice,department;
		System.out.print("Insert or Read data?:");
		choice = scan.next().toLowerCase();
		while(!(choice.equals("insert"))&&!(choice.equals("read"))) {
			System.out.print("Plese Type insert or read data,again:");
			choice = scan.next().toLowerCase();
		}
		//create object : call all method in class SaveandOpen
		Saveandopen obj = new Saveandopen(); //เรียกใช้ได้ทุก method
		if(choice.equals("insert")) {
			obj.insert(); //ใช้สำหรับเรียก class จาก SaveandOpen เรียกใช้ insert
		}
		else if(choice.equals("read")) {
			System.out.print("\nEnter department:");
			department = scan.next();
			obj.setDept(department); //sent department to setDept() method from class employee 
			obj.read(); //call read method from class saveandOpen
			
		}

	}

}
