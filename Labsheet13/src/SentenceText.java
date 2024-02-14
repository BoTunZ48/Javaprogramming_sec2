import java.io.*;
import java.util.*;
public class SentenceText {

	public static void main(String[] args) throws IOException{
		//create object for write data to file using PrintStream Class
		PrintStream writeFile = new PrintStream(new File("d://txtFile//sentence.txt"));
		
		//create object for input data for keyboard(console)
		Scanner scan = new Scanner(System.in);
		int i=1;
		while(true) {
			System.out.print("Sentence: ");
			String word = scan.next().toUpperCase();
			
			if(word.equalsIgnoreCase("Stop")) {
				break;
			}
			//save data to file
			writeFile.println(i+":"+word);
			i++;
		}
		System.out.println("File is save!!");
		
		
		writeFile.close();

	}

}
