package Question3;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private long id;
	private List<Course> courses;
	private int credits;
	
	public Student(String name, long id) {
		this.name = name;
		this.id = id;
		this.courses = new ArrayList<>();
		this.credits = 0;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
		credits += course.getCredit();
	}
	
	public double calculateGPA() {
		int sum = 0;
		for (Course course : courses) {
			sum += course.getGpa() * course.getCredit();
		}
		return sum / credits;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	
}
