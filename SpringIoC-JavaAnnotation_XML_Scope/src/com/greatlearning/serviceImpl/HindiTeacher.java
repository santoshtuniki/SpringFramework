package com.greatlearning.serviceImpl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.greatlearning.service.Teacher;

@Component("customName")
@Scope("singleton")
public class HindiTeacher implements Teacher {

	@Override
	public String getHomework() {
		return "Do one page of hindi writing";
	}

}
