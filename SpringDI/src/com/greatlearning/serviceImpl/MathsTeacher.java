package com.greatlearning.serviceImpl;

import com.greatlearning.service.ExamTip;
import com.greatlearning.service.Teacher;

public class MathsTeacher implements Teacher {

	// Define a private field for dependency
	ExamTip examTip;

	public MathsTeacher() {

	}

	// Define a constructor for the dependency injection
	public MathsTeacher(ExamTip examTip) {
		this.examTip = examTip;
	}

	@Override
	public String getHomework() {
		return "Practice any ten mathematics problems";
	}

	// Use the injected dependency
	@Override
	public String getExamTip() {
		return examTip.getExamTip();
	}

}
