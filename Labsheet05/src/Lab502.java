import java.util.*;

import javax.swing.JOptionPane;
public class Lab502 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")) 
		{
			System.out.print("The sentence must end with full stop point : ");
			 sentence = scan.nextLine();			 
		}
		int num = 0;
		int space = sentence.indexOf(" ");
		
		for(int i=0;i<sentence.length();i++) 
		 {
			 if(sentence.charAt(i)==' ') 
			 {
				 System.out.println(sentence.substring(num,i));
				 num =i+1;
			 }
		 }
		System.out.println(sentence.substring(num));
		}
	}
