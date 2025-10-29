package com.enumtech.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.enumtech.config.MyApplicationContext;
import com.enumtech.model.Car;
import com.enumtech.model.Engine;
import com.enumtech.model.Student;

public class DriverAppJavaBasedBeans {

	public static void main(String[] args) {
		ApplicationContext beanFactory = new AnnotationConfigApplicationContext(MyApplicationContext.class);
		Engine engine1=beanFactory.getBean("e1", Engine.class);
		System.out.println(engine1);
		
		Engine engine2=beanFactory.getBean("e2", Engine.class);
		System.out.println(engine2);
		
		Engine engine3=beanFactory.getBean("e2", Engine.class);
		System.out.println(engine2==engine3);
		
		Car car1=beanFactory.getBean("c1", Car.class);
		System.out.println(car1);
		
		
		Student student1=beanFactory.getBean(Student.class);
		System.out.println(student1);
		
		Student student2=beanFactory.getBean(Student.class);
		System.out.println(student1==student2);
	}
}


//types of constructors
//Default  int 0 object null double 0.0 boolean false
//No Args Constructor