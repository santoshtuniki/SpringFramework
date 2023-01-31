package com.greatlearning.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceImpl.GkTeacher;

public class SpringDriver {

	public static void main(String[] args) {

		// 1. Load the Spring Configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2. Retrieve bean from Spring Container
		Teacher teacher = context.getBean("gkTeacher", GkTeacher.class); // getBean(bean id , className.class)
		
		// 3. Call methods on the bean
		System.out.println(teacher.getHomework());

		// 4. Close the Context
		context.close();
	}

}
