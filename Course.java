import java.util.ArrayList;
public class Course {
	
	private String coName;
	private int code;
	private double creditHours;
	private String profName;
	private int maxSize;
	 private ArrayList<Student> students;

	
	public Course() {
		coName= "";
		code = 0;
		creditHours = 0;
		profName = "" ;
		maxSize = 0;
	}
	
	public Course(String coName, int code, double creditHours, String prof, int maxSize) {
		this.coName = coName;
		this.code = code;
		this.creditHours = creditHours;
		this.profName = prof;
		this.maxSize = maxSize;
	}
	
	public String getCourseName() {
		return coName;
	}
	
	public double getCreditHours() {
		return creditHours;
	}
	
	public int getMaxSize() {
		return maxSize;
	}
	
	public String getProfName() {
		return profName;
	}
	
	public int getCode() {
		return code;
	}
	
	
	public void setCoName(String courseName) {
		this.coName = courseName;
	}
	
	public void setCode(int courseCode) {
		this.code = courseCode;
	}
	
	public void setMaxSize(int newSize) {
		this.maxSize = newSize;
	}
	
	public void setProfName(String prof) {
		this.profName = prof;
	}
	
	public void setCreditHours(double creditHours) {
		this.creditHours = creditHours;
	}
	
	public String toString() {
		return "Course Name: " + coName +", Course's Code: " + code + ", Professor Name: " + profName+ ", Credit Hours: " + creditHours;
	}
	
	public void showRegistration() {
        for (Student s : this.students) {
            System.out.println(s.toString());
        }
    }
		
	
	
	
}
