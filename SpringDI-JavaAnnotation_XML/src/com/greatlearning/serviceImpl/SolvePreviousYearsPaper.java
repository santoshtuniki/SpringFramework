package com.greatlearning.serviceImpl;

import org.springframework.stereotype.Component;

import com.greatlearning.service.ExamTip;

@Component
// default bean id = solvePreviousYearsPaper
public class SolvePreviousYearsPaper implements ExamTip {

	@Override
	public String getExamTip() {
		return "Solve last 5 years Question Papers";
	}

}
