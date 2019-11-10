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
		Student student4 = new Student("Dean");
		Student student5 = new Student("Neville");
		
		StudentGroup group1 = new StudentGroup(school1);
		group1.addStudent(student1);
		group1.addStudent(student2);
		StudentGroup group2 = new StudentGroup(school1);
		group2.addStudent(student3);
		group2.addStudent(student4);
		StudentGroup group3 = new StudentGroup(school1);
		group3.addStudent(student1);
		group3.addStudent(student5);
		
		System.out.println(school1.toString());
		System.out.println("********************************************");
		
		
		Timetable timetable = new Timetable();
		timetable.addLesson(new Lesson("Potions", teacher1, group1));
		timetable.addLesson(new Lesson("Dark Arts", teacher1, group2));
		timetable.addLesson(new Lesson("Gardening", teacher2, group3));
		
		timetable.startLessons();
		
		
		
	
		
	}

}
