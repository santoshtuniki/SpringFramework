package com.greatlearning.serviceImpl;

import com.greatlearning.service.Teacher;

public class MathsTeacher implements Teacher {
	
	@Override
	public String getHomework() {
		return "Practice any ten mathematics problems";
	}
	
}
