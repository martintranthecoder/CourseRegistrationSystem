import java.util.ArrayList;
public class Professor {
	
	
	private String name;
	private int id;
	private ArrayList<Course> courses;
	
	public Professor() {
		this.id = 0;
		this.name = "";
		this.courses= new ArrayList<Course>();
	}
	
	public Professor(int id, String name, ArrayList<Course> courses) {
		this.id = id;
		this.name= name;
		this.courses = courses;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int newId) {
		this.id = newId;
	}
	
	public ArrayList<Course> getCourses(){
		return this.courses;
	}
	
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	public String toString() {
		return "Professor name: " + this.name + " , Professor' id: " + this.id;
	}
	
	public void showCourses() {
		for(Course i: courses) {
			i.toString();
		}
	}
	
	
	
	
	
	
	
}
