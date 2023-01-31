package com.greatlearning.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceImpl.MathsTeacher;

public class PrototypeScope {

	public static void main(String[] args) {
		// 1. Load the Spring Configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2. Retrieve bean from Spring Container
		Teacher teacher1 = context.getBean("mathsTeacher", MathsTeacher.class); // (bean id , className.class)
		Teacher teacher2 = context.getBean("mathsTeacher", MathsTeacher.class);

		if (teacher1 == teacher2)
			System.out.println("True");
		else
			System.out.println("False");
		// False implies that:
		// => Both the objects are the different 
		// => Memory addresses are also the different
		// => Because of 'PROTOTYPE' Scope of the bean
		// => A New instance of the bean is created whenever we make a container request in 'Prototype' scope

		System.out.println(teacher1); // Memory address of teacher1
		System.out.println(teacher2); // Memory address of teacher2

		// 3. Call methods on the bean
		System.out.println(teacher1.getHomework());
		System.out.println(teacher2.getHomework());

		// 4. Close the Context
		context.close();

	}

}
