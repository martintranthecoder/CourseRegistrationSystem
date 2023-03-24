import java.util.Scanner;
import java.util.ArrayList;

public class CourseManager {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CourseLibrary colib = new CourseLibrary();
		Student stu = new Student();
		System.out.println("Course Info ");
		System.out.println("Enter the Course Name: ");
		String coName = input.nextLine();
		System.out.println("Enter the Course Code: " );
		int code = input.nextInt();
		System.out.println("Enter the Credit Hours: ");
		double creHours = input.nextDouble();
		System.out.println("Enter Professor's Name: ");
		input.nextLine();
		String profName= input.nextLine();
		System.out.println("Enter the Course Size: ");
		int maxSize = input.nextInt();
		
		Course course = new Course(coName, code, creHours, profName, maxSize);
		colib.addCourse(course);
		
		System.out.println("Student Info ");
		System.out.println("Enter Student's Name: ");
		String stuName = input.nextLine();
		System.out.println("Enter Student's ID");
		int stuId = input.nextInt();
		System.out.println("Enter Student's Current GPA: ");
		double gpa = input.nextDouble();
		System.out.println("Enter the Course Code to enroll: ");
		int cocode = input.nextInt();
		Course scourse = colib.find(cocode);
		
		if(scourse != null) {
			ArrayList<Course> coList = new ArrayList<Course>();
			coList.add(scourse);
			stu.setCoursesenrolled(coList);
			stu.setGPA(gpa);
			stu.setStuId(stuId);
			stu.setStuName(stuName);
			
		} else {
			System.out.println("Invalid Course Code!");
		}

		int task = 0;
		int proftask = 0;
		int stutask = 0;
		do {
	    	 System.out.println("Choose a role to perform:\n");
	         System.out.println("1. Professor");
	         System.out.println("2. Student");
	         System.out.println("3. Exit");
	         System.out.print("\nEnter your choice: ");
	         task = input.nextInt();
	         
	        if (task == 1) {
	        	do {
	        		System.out.println("\nWhich action do you want to perform?\n");
		        	 System.out.println("1. Create a course");
		        	 System.out.println("2. Show all courses");
		        	 System.out.print("\nEnter your choice: ");
			         proftask = input.nextInt();
			         
			         if (proftask == 1) {
			        	 System.out.println("Course Info ");
							System.out.println("Enter the course code: ");
							int coCode = input.nextInt();
							input.nextLine();
							System.out.println("Enter the course name: ");
							String coursename = input.nextLine();
							System.out.println("Enter the course credit hours");
							double coursehours=input.nextDouble();
							input.nextLine();
							System.out.println("Enter the course professor name");
							String coprofName=input.nextLine();
							System.out.println("Enter the course class size");
							int cosize=input.nextInt();
							Course courses1 = new Course(coursename, coCode, coursehours, coprofName, cosize);
							colib.addCourse(courses1);
			         } if (proftask == 2) {
			        	 System.out.println(colib.toString());
			         }
			         
	        	} while(proftask != 1 && proftask != 2);
	        } if (task == 2) {
	        	do {
	        		System.out.println("\nWhich action do you want to perform?\n");
		        	 System.out.println("1. View a course's details");
		        	 System.out.println("2. Enroll in a course");
		        	 System.out.println("3. Drop a course");
		        	 System.out.println("4. Show all enrolled courses");
		        	 System.out.print("\nEnter your choice: ");
			         stutask = input.nextInt();
			         
			         if (stutask == 1) {
			        	 colib.showAll();
			         }
			         if (stutask == 2) {
			        	System.out.println("Eneter the course code: ");
						int code1 = input.nextInt();
						input.nextLine();
			        	System.out.println("Enter the course name: ");
						String name1=input.nextLine();
						System.out.println("Enter the course credit hours");
						double credit1=input.nextDouble();
						input.nextLine();
						System.out.println("Enter the course professor name");
						String profName1=input.nextLine();
						System.out.println("Enter the course class size");
						int size1=input.nextInt();
						Course courses1=new Course(name1, code1, credit1, profName1, size1);
						System.out.println(stu.addCourse(courses1));
			         }
			         if (stutask == 3) {
			        	System.out.println("Enter the course code: ");
						int code2 = input.nextInt();
						System.out.println(stu.removeCourse(code2));
			        
			         }
			         if (stutask == 4) {
			        	 ArrayList<Course> list1 = stu.showRegisteration();
							for (Course c1 : list1) {
								c1.toString();
							}
			         }
			 
	        	} while(stutask < 1 && stutask > 4);
	        }
		} while (task != 3);
		System.out.println("Invalid Command");
		input.close();
		
		
	}
}
