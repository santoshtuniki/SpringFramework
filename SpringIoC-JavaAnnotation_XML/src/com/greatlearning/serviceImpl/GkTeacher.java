package com.greatlearning.serviceImpl;

import org.springframework.stereotype.Component;

import com.greatlearning.service.Teacher;

@Component
//name of the bean id is the className camelCased(Default)
//id=gkTeacher
public class GkTeacher implements Teacher{
	
	@Override
	public String getHomework() {
		return "Read Current Affairs";
	}
	
}
