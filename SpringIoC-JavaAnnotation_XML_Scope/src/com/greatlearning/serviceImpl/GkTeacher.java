package com.greatlearning.serviceImpl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.greatlearning.service.Teacher;

@Component
@Scope("singleton")
public class GkTeacher implements Teacher{
	
	@Override
	public String getHomework() {
		return "Read Current Affairs";
	}
	
	@PostConstruct
	public void insidePostConstruct() {
		System.out.println("we are inside post construct");
	}
	
	@PreDestroy
	public void insidePreDestroy() {
		System.out.println("we are inside pre destroy");
	}
	
}
