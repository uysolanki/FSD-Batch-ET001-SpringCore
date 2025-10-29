package com.enumtech.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enumtech.model.Car;
import com.enumtech.model.Engine;
import com.enumtech.model.Gear;

public class DriverAppForAutowire {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
				
		Car car3=beanFactory.getBean("c3", Car.class);
		System.out.println(car3);
		
		
	}
}
