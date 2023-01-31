package com.greatlearning.serviceImpl;

import org.springframework.stereotype.Component;

import com.greatlearning.service.Teacher;

@Component
//name of the bean id is the className camelCased(Default)
//id=mathsTeacher
public class MathsTeacher implements Teacher {
	
	@Override
	public String getHomework() {
		return "Practice any ten mathematics problems";
	}
	
}
