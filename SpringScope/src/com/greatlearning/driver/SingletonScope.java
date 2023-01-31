package com.greatlearning.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceImpl.HindiTeacher;

public class SingletonScope {

	public static void main(String[] args) {
		// 1. Load the Spring Configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2. Retrieve bean from Spring Container
		Teacher teacher1 = context.getBean("hindiTeacher", HindiTeacher.class); // (bean id , className.class)
		Teacher teacher2 = context.getBean("hindiTeacher", HindiTeacher.class);

		if (teacher1 == teacher2)
			System.out.println("True");
		// => Both the objects are the same
		// => Memory addresses are also the same
		// => Because of 'SINGLETON' Scope of the bean (Default Scope)
		// => Single instance of the bean is created and shared between objects in 'Singleton' scope

		System.out.println(teacher1); // Memory address of teacher1
		System.out.println(teacher2); // Memory address of teacher2

		// 3. Call methods on the bean
		System.out.println(teacher1.getHomework());
		System.out.println(teacher2.getHomework());

		// 4. Close the Context
		context.close();

	}

}
