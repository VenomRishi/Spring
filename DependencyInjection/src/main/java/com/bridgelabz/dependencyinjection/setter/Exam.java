package com.bridgelabz.dependencyinjection.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		// dependency injection is used using setter method
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentSetter student = context.getBean("studentsetter", StudentSetter.class);

		System.out.println("Student id is: " + student.getId());
		  System.out.println("Student name is: "+student.getName());

		

	}
}
