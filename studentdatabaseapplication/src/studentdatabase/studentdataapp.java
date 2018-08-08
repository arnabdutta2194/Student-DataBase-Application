/* Author- Arnab Dutta
 * Date - 6/8/18
 * 
 */




package studentdatabase;
import java.util.Scanner;

public class studentdataapp {

	public static void main(String[] args) {
		
		System.out.println("Enter Number Of Students To Enroll");
		Scanner sc=new Scanner(System.in);
		int numOfStudents=sc.nextInt();
		student [] students=new student[numOfStudents];
		for(int n=0;n<numOfStudents;n++) {
			
			
			students[n]=new student();
			students[n].enroll();
			students[n].payTuition();
		
		}
		for(int n=0;n<numOfStudents;n++) {
			System.out.println(students[n].showInfo());
		}

	}

}
