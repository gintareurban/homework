package com.ginurban.pd13.School;

public class Main {

	public static void main(String[] args) {
		
		School school1 = new School("Hogwarts");
		Teacher teacher1 = new Teacher("Snape");
		Teacher teacher2 = new Teacher("Sprout");
		school1.addTeacher(teacher1);
		school1.addTeacher(teacher2);
		
		Student student1 = new Student("Harry");
		Student student2 = new Student("Ron");
		Student student3 = new Student("Hermione");
		
		
		school1.addStudent(student1);
		school1.addStudent(student2);
		school1.addStudent(student3);
		
		System.out.println(school1.toString());
		
		teacher1.teachStudents(school1.getStudents());
		
	
		
	}

}
