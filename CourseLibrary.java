import java.util.ArrayList;

public class CourseLibrary {
	
	private ArrayList<Course> accessCourses = new ArrayList<Course>();
	
	public CourseLibrary() {
		accessCourses = new ArrayList<Course>();
	
	}
	
	public CourseLibrary(ArrayList<Course> availCourses) {
		this.accessCourses = availCourses;
	}
	
	public ArrayList<Course> getAccessCourse(){
		return accessCourses;
	}
	
	public void setAccessCourse(ArrayList<Course> courses) {
		this.accessCourses = courses;
	}
	
	public Course find(int courseCode) {
		for(Course i : accessCourses) {
			if(i.getCode() == courseCode) {
				return i;
			} 
			
		}
		return null;
	}
	
	public void addCourse(Course courses) {
		accessCourses.add(courses);
	}
	
	public void showAll() {
		for(Course i : accessCourses) {
			i.toString();
		}
	}
	
	public String toString() {
		return "Accessible Courses: " + accessCourses;
	}

}
