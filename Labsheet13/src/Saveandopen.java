import java.util.*;
import java.io.*;
public class Saveandopen extends Employee{
	private String name;
	private String dept;
	
	public void insert() throws IOException{
		
		Scanner scan = new Scanner(System.in);
		PrintStream writeFile = new PrintStream(new File("d://txtFile//employee.txt"));
		String answer;
		do {
			header(); //call header method from employee
			System.out.print("Enter name: ");
			name = scan.next();
			System.out.print("Enter deparment: ");
			dept = scan.next();
			
			//save all data to file
			writeFile.println(name+"\t"+dept); //ใช้บันทึกไว้ใน File
			System.out.print("Enter Data again? :");
			answer = scan.next().toLowerCase();
		}while(answer.equals("y"));
	}
	public void read() {
		int i=1;
		try {
			//create object for read file using Scanner class
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			boolean check = false;
			header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					System.out.println(i+") "+name);
					i++;
					check = true;
					
				}
				
			}
			if(check==false) {
				System.out.println("\nSorry, no department : "+super.getDept()+" in File");
				
			}else if(check==true){
				header();
				System.out.println("Employee in dept "+super.getDept()+" is "+(i-1)+" Person");
			}
			readFile.close();
			
		}catch(IOException e) {
			System.out.println("\nSorry, file not found...");
		}
	}

}
