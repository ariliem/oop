package oop;
import java.util.*;

public class Course {
	protected String id;
	protected String name;
	protected Teacher instructor;
	protected List<Student> students;
	protected int year;
	protected String major;
	
	
	public Course(String id, String name,int year ) {
		this.id = id;
		this.name = name;
		this.students = new ArrayList<>();
		this.year = year;
		this.major = "";
		this.year = 2024;
		
	}
	public String getName() {
		return name;
	}
	public void setInstructor(Teacher instructor) {
		this.instructor = instructor;
	}
	public void setMajor(String major) {
        this.major = major;
        System.out.println("Course major set to: " + major);
    }
	public void setYear(int year) {
        this.year = year;
        System.out.println("Course year set to: " + year);
    }
	public String getMajor() {
        return major;
    }
	public int getYear() {
        return year;
    }
	public void enrollStudent(Student student) {
		if (students.size()<75){
			students.add(student);
			System.out.println("Student " + student.getUsername() + " enrolled in course " + name);
		} else {
			System.out.println("Course is full");
		}
	}
	
}
