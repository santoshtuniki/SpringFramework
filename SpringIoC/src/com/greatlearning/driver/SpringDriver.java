package com.greatlearning.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceImpl.GkTeacher;
import com.greatlearning.serviceImpl.HindiTeacher;
import com.greatlearning.serviceImpl.MathsTeacher;

public class SpringDriver {

	public static void main(String[] args) {

		// 1. Load the Spring Configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2. Retrieve bean from Spring Container
		Teacher teacher = context.getBean("hindiTeacher", HindiTeacher.class); // getBean(bean id , className.class)
		Teacher teacher1 = context.getBean("mathsTeacher",MathsTeacher.class);
		Teacher teacher2 = context.getBean("teacher",GkTeacher.class);

		// 3. Call methods on the bean
		System.out.println(teacher.getHomework());
		System.out.println(teacher1.getHomework());
		System.out.println(teacher2.getHomework());

		// 4. Close the Context
		context.close();
	}

}
