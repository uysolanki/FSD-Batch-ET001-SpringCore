package com.enumtech.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.enumtech.model.Car;
import com.enumtech.model.Engine;
import com.enumtech.model.Gear;

public class DriverApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
		Engine engine1=beanFactory.getBean("e1", Engine.class);
		System.out.println(engine1);
		
		Engine engine2=(Engine)beanFactory.getBean("e2");
		System.out.println(engine2);
		
		Gear gear1=beanFactory.getBean("g1", Gear.class);
		System.out.println(gear1);
		
		Gear gear2=(Gear)beanFactory.getBean("g2");
		System.out.println(gear2);
		
		
		Car car1=beanFactory.getBean("c1", Car.class);
		System.out.println(car1);
		
		Car car2=beanFactory.getBean("c2", Car.class);
		System.out.println(car2);
	}
}
