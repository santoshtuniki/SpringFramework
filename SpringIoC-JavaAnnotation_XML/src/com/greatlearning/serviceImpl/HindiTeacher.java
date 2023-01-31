package com.greatlearning.serviceImpl;

import org.springframework.stereotype.Component;

import com.greatlearning.service.Teacher;

@Component("customName") // (_id) --> The bean id of our choice
//name of the bean id is the className camelCased(Default)
//id=hindiTeacher
public class HindiTeacher implements Teacher {

	@Override
	public String getHomework() {
		return "Do one page of hindi writing";
	}

}
