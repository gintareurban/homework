package com.ginurban.pd13.School;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
	
	private String name;
	private List<School> schools = new ArrayList<>();
	
	public Teacher(String name) {
		this.name = name;
	}
	
	public void addSchool(School school) {
		schools.add(school);
	}
	
	public void teachStudents(List<Student> students) {
		System.out.print("Teacher " + this.name + " teaching: ");
		for (Student student : students) {
			System.out.print(student.getName() + ", ");
		}
		System.out.println();
		for (Student student : students) {
			student.learn();
		}
	}

	public String getName() {
		return name;
	}

	public List<School> getSchools() {
		return schools;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", schools=" + schools + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((schools == null) ? 0 : schools.hashCode());
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
		Teacher other = (Teacher) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schools == null) {
			if (other.schools != null)
				return false;
		} else if (!schools.equals(other.schools))
			return false;
		return true;
	}
	
	
	

}
