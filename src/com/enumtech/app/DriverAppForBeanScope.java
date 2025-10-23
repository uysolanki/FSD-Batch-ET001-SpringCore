package com.enumtech.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enumtech.model.Car;
import com.enumtech.model.Engine;
import com.enumtech.model.Gear;

public class DriverAppForBeanScope {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
		
		System.out.println("Hi!!!");
//		Engine engine1=beanFactory.getBean("e1", Engine.class);
//		System.out.println(engine1);
//		
//		Engine engine2=beanFactory.getBean("e1", Engine.class);
//		System.out.println(engine2);
//		
//		System.out.println(engine1==engine2);  //true
		
		
		Engine engine1=beanFactory.getBean("e2", Engine.class);
		System.out.println(engine1);
		
		Engine engine2=beanFactory.getBean("e2", Engine.class);
		System.out.println(engine2);
		
		System.out.println(engine1==engine2);  //false
		
	}
}
