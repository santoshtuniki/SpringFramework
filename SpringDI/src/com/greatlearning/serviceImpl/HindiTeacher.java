package com.greatlearning.serviceImpl;

import com.greatlearning.service.ExamTip;
import com.greatlearning.service.Teacher;

public class HindiTeacher implements Teacher {

	// Define a private field for dependency
	ExamTip examTip;

	public HindiTeacher() {

	}

	// Define a constructor for the dependency injection
	public HindiTeacher(ExamTip examTip) {
		this.examTip = examTip;
	}

	@Override
	public String getHomework() {
		return "Do one page of hindi writing";
	}
	
	// Use the injected dependency
	@Override
	public String getExamTip() {
		return examTip.getExamTip();
	}

}
