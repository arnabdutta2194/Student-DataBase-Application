package studentdatabase;

import java.util.Scanner;

public class student {
	private String firstName;
	private String lastName;
	private  int gradeYear;
	private String studentID;
	private String courses="";
	private int tuitionBalance=0;
	private static int costOfCourse=600;
	private static int id=1000;
	Scanner sc=new Scanner(System.in);
	
	public student() {
		
		System.out.println("Enter First Name of The Student:");
		this.firstName=sc.nextLine();
		System.out.println("Enter second name of the Student");
		this.lastName=sc.nextLine();
		System.out.println("Enter your Grade Year");
		System.out.println("1-Freshmen\n 2-Sophmore \n 3-Junior \n 4-Senior");
		this.gradeYear=sc.nextInt();
		setStudentID();
		
		
}
	public void setStudentID() {
		
		
		this.studentID=gradeYear+""+id;
		id++;
	}
	public void enroll() {
		do {
		System.out.print("Enter Course Name To Enroll (Q to EXIT)");
		String course=sc.nextLine();
		if(!course.equals("Q")) {
			courses=courses+"\n"+course;
			tuitionBalance=tuitionBalance+costOfCourse;
		}
		else {
			break;
		}
		}
		while(1!=0);
		
	}
	public void viewBalance() {
		System.out.println("Your Balance :$"+tuitionBalance);
		}
		
	public void payTuition() {
		viewBalance();
		System.out.println("Enter Your Payment : $");
		int payment=sc.nextInt();
		tuitionBalance=tuitionBalance-payment;
		System.out.println("Thank You For Your Payment Of : $"+payment);
		viewBalance();
	}
	public String showInfo() {
		return "NAME"+firstName+" "+lastName+"\nGrade Level :"+gradeYear+"\nStudentID: "+studentID+"\n Courses Enrolled: "+courses+"\nBalance : $"
				+tuitionBalance;
	}
	}

