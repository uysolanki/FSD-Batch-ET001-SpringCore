package com.enumtech.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component  //for the component classes ioc container will create a bean using default constructor
public class Student //implements InitializingBean,DisposableBean{
{
	private int rno;
	private String sname;
	private double per;
	
	public Student() {}
	public Student(int rno, String sname, double per) {
		this.rno = rno;
		this.sname = sname;
		this.per = per;
		System.out.println("All Args Constructor invoked for Student");
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + ", per=" + per + "]";
	}
	
	@PreDestroy
	public void zzz() {
		System.out.println("Immediately before Student class Destructor");
		
	}
	
	@PostConstruct
	public void aaa()  {
		System.out.println("Immediatley After Student class Constructor");
		
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Student class Destructor");
	}
	
	
}
