package com.greatlearning.serviceImpl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.greatlearning.service.Teacher;

@Component
@Scope("prototype")
public class MathsTeacher implements Teacher {
	
	@Override
	public String getHomework() {
		return "Practice any ten mathematics problems";
	}
	
}
