package com.ginurban.pd13.School;

public class Lesson {
	
	private String name;
	private Teacher teacher;
	private StudentGroup group;
	
	public Lesson(String name, Teacher teacher, StudentGroup group) {
		this.name = name;
		this.teacher = teacher;
		this.group = group;
	}
	
	public void startLesson() {
		teacher.teachStudents(group, this.name);
	}

	public String getName() {
		return name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public StudentGroup getStudents() {
		return group;
	}
	
	

}
