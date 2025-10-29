package com.enumtech.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enumtech.model.Car;
import com.enumtech.model.Engine;
import com.enumtech.model.Gear;
import com.enumtech.model.Student;

public class DriverAppForBeanLifecycle {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
		Student student1=beanFactory.getBean("s1", Student.class);
		System.out.println(student1);
		student1=null;
		System.gc();
		beanFactory.close();
		
		}
}
