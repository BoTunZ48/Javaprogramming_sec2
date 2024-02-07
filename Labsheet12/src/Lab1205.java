import java.util.*;
import java.io.*;
public class Lab1205 {

	public static void main (String[] args) throws IOException{
		Scanner readFile = new Scanner(new File("d://txtFile//student.txt"));
		int count =1;
		Head();
		while(readFile.hasNext()) {
			String id = readFile.next();
			readFile.next();
			String fname = readFile.next();
			String lname = readFile.next();
			double Grade = readFile.nextDouble();
			readFile.next();
			System.out.println(count+"\t"+id+"\t"+Level(id)+"\t"+fname.substring(0,1)+"."+lname+"\t"+Grade+"\t"+Status(Grade));
			count++;
		}
		

	}
	public static String Level(String id) {
		int sectionData = 22-Integer.parseInt(id.substring(0,2));
		return sectionData+"th";
	}
	public static String Status(double Grade) {
		if(Grade>=2.00) {
			return "Pass";
		}
		else if(Grade>=1.00 &&Grade<=2.00) {
			return "Critical";
		}
		else return "Retired";
	
	}
	public static void Head() {
		System.out.println("No."+"\t"+"ID"+"\t\t"+"Level"+"\t"+"name"+"\t\t"+"Grade"+"\t"+"Status");
		System.out.println("*********************************************************************");
	}

}
