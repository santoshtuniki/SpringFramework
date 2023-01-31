package com.greatlearning.serviceImpl;

import com.greatlearning.service.ExamTip;
import com.greatlearning.service.Teacher;

public class GkTeacher implements Teacher {

	// Define a private field for dependency
	ExamTip examTip;

	public GkTeacher() {

	}

	// Define a constructor for the dependency injection
	public GkTeacher(ExamTip examTip) {
		this.examTip = examTip;
	}

	@Override
	public String getHomework() {
		return "Read Current Affairs";
	}

	// Use the injected dependency
	@Override
	public String getExamTip() {
		return examTip.getExamTip();
	}

}
