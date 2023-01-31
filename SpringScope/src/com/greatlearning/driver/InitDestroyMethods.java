package com.greatlearning.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceImpl.GkTeacher;

public class InitDestroyMethods {

	public static void main(String[] args) {
		// 1. Load the Spring Configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2. Retrieve bean from Spring Container
		Teacher teacher = context.getBean("teacher", GkTeacher.class); // (bean id , className.class)

		// 3. Call methods on the bean
		System.out.println(teacher.getHomework());

		// 4. Close the Context
		context.close();

		// Because of init & destroy methods defined in bean, the order in which methods are executed is
		// init() --> getHomework() --> destroy()
		// lazy-init="true" is added at bean to avoid the init-destory message for other beans
		// Because all beans are initialized at startup and that the message you see actually comes from the class with the init method.

	}

}
