package com.greatlearning.serviceImpl;

import com.greatlearning.service.Teacher;

public class GkTeacher implements Teacher {
	
	@Override
	public String getHomework() {
		return "Read Current Affairs";
	}

	// init, destroy methods --> 'void' return type, name can be anything, won't accept any argument
	// this will act as init method
	public void doInitialJob() {
		System.out.println("under the initial method");
	}

	// this will act as destroy method
	public void doFinalJob() {
		System.out.println("under the destroy method");
	}
	
}

