package com.ginurban.pd13.School;

import java.util.ArrayList;
import java.util.List;

public class Timetable {
	
	private List<Lesson> lessons = new ArrayList<>();

	
	public void addLesson(Lesson lesson) {
		this.lessons.add(lesson);
	}
	
	public void startLessons() {
		for(Lesson lesson : this.lessons) {
			lesson.startLesson();
		}
	}

	public List<Lesson> getLessons() {
		return lessons;
	}
	
	

}
