import java.util.*;
public class Lab604 {
	
		static Scanner scan = new Scanner(System.in);
		static String studentId,strsubjectID;
		static int subjectId;


	public static void main(String[] args) {
		inputStudent();

	}//end
	public static void inputStudent() {
		do {
			System.out.print("Enter Studen Id: ");
			studentId = scan.next();
			System.out.print("Enter subject Id: ");
			subjectId = scan.nextInt();
			//convert subjectId from integer to string (subjectID)
			strsubjectID = subjectId+"";
		}while(!(isLength(studentId,strsubjectID)));
		System.out.println();
		displayData(isITStudent(studentId),isITSubject(strsubjectID));
	}//end
	public static boolean isLength(String id, String sub_id) {
		if (id.length()==10 && sub_id.length()==7) {
			return true;
		}
		return false;
	}
	public static boolean isITStudent(String id) {
		if(id.substring(0,3).equals("211")&&id.substring(3,6).equals("311")) {
			return true;
			
		}else {
			return false;
		}
	}
	public static boolean isITSubject(String sub_id) {
		if(sub_id.substring(0,2).equals("21")&&sub_id.substring(4,5).equals("1")) {
			return true;
			
		}else {
			return false;
		}
	}
	public static void displayData(boolean sid,boolean sub_id) {
		if(sid) {
			System.out.println("Student id "+studentId+" 1st year student in IT");
		}else {
			System.out.println("Student id "+studentId+" is not 1st year student in IT");
		}
		if(sub_id) {
			System.out.println("Enroll in course for Year 1");
		}else {
			System.out.println("not enroll in course for Year 1");
		}
		
	}

}
