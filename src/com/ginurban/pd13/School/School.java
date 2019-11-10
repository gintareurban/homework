package com.ginurban.pd13.School;

import java.util.ArrayList;
import java.util.List;

public class School {
	
	private String name;
	private List<Student> students = new ArrayList<>();
	private List<Teacher> teachers = new ArrayList<>();
	
	public School(String name) {
		this.name = name;
	}
	
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
		teacher.addSchool(this);
	}
	
	public void addStudent(Student student) {
		students.add(student);
		student.setSchool(this);
	}
	
	

	public String getName() {
		return name;
	}



	public List<Student> getStudents() {
		return students;
	}



	public List<Teacher> getTeachers() {
		return teachers;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("School name: " + name + ", Teachers: ");
		for (Teacher teacher : teachers) {
			builder.append(teacher.getName() + ", ");
		}
		builder.append("Students: ");
		for (Student student : students) {
			builder.append(student.getName() + ", ");
		}
		return builder.toString();
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((students == null) ? 0 : students.hashCode());
		result = prime * result + ((teachers == null) ? 0 : teachers.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (students == null) {
			if (other.students != null)
				return false;
		} else if (!students.equals(other.students))
			return false;
		if (teachers == null) {
			if (other.teachers != null)
				return false;
		} else if (!teachers.equals(other.teachers))
			return false;
		return true;
	}
	
	
	
}
