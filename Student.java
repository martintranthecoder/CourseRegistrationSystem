import java.util.ArrayList;
public class Student {
	
	private String stuName;
	private int stuId;
	private double gpa;
	private ArrayList<Course> enrolledCourse;
	
	public Student() {
		this.stuId = 0;
		stuName = "";
		gpa = 0.0;
		enrolledCourse = new ArrayList<Course>();
	}
	
	public Student(String name, int id, double gpa, ArrayList<Course> course) {
		this.stuId = id;
		this.stuName = name;
		this.gpa = gpa;
		this.enrolledCourse = course; 
	}
	
	public ArrayList<Course> getCoursesEnrolled() {
		return enrolledCourse;
	}
	public void setCoursesenrolled(ArrayList<Course> coursesenrolled) {
		this.enrolledCourse = coursesenrolled;
	}
	
	public int getStuId() {
		return stuId;
	}
	
	public void setStuId(int newStuId) {
		this.stuId = newStuId;
	}
	
	public String getStuName() {
		return stuName;
	}
	
	public void setStuName(String newName) {
		this.stuName= newName;
	}
	
	public double getGPA(){
		return gpa;
	}
	
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
	public ArrayList<Course> showRegisteration() {
		return enrolledCourse;

	}
	
	public String toString() {
		return "My name is " + this.stuName + " ,and my ID is " + this.stuId;
	
	}
	
	public String addCourse(Course courses) {
		enrolledCourse.add(courses);
		return "finished";
	}
	public String removeCourse(int courseid) {
		for (Course courses : enrolledCourse) {
			if(courses.getCode()==courseid)
			{
				enrolledCourse.remove(courses);
				return "finish deleting";
			}
		}
		return "Course Code is not available!";
	}
	
	
		

}
