package com.greatlearning.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceImpl.MathsTeacher;

public class PrototypeScope {

	public static void main(String[] args) {

		// 1. Load the Spring Configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2. Retrieve bean from Spring Container
		Teacher teacher = context.getBean("mathsTeacher", MathsTeacher.class); // getBean(bean id , className.class)
		Teacher teacher1 = context.getBean("mathsTeacher", MathsTeacher.class);

		if (teacher == teacher1)
			System.out.println("true");
		else
			System.out.println("they are not equal objects");
		System.out.println(teacher);
		System.out.println(teacher1);

		// 3. Call methods on the bean
		System.out.println(teacher.getHomework());
		System.out.println(teacher1.getHomework());

		// 4. Close the Context
		context.close();
	}

}
