package com.ginurban.pd13.School;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
	
	private School school;
	private List<Student> students = new ArrayList<>();
	
	public StudentGroup(School school) {
		this.school = school;
		school.addStudentGroup(this);
	}

	public void addStudent(Student student) {
		this.students.add(student);
		school.addStudent(student);
	}

	public List<Student> getStudents() {
		return students;
	}

	public School getSchool() {
		return school;
	}
	
	

}
