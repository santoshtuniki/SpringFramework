package com.greatlearning.serviceImpl;

import org.springframework.stereotype.Component;

import com.greatlearning.service.ExamTip;

@Component
public class RevisionTip implements ExamTip {

	@Override
	public String getExamTip() {
		return "Do a lot of Revision";
	}

}
