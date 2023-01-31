package com.greatlearning.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.greatlearning.service.ExamTip;
import com.greatlearning.service.Teacher;

@Component
public class MathsTeacher implements Teacher {

	// Define a private field for dependency
	ExamTip examTip;

	public MathsTeacher() {

	}

	// Define a constructor for the dependency injection
	@Autowired
	public MathsTeacher(@Qualifier("solvePreviousYearsPaper") ExamTip examTip) {
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
