package com.enumtech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.enumtech.model.Car;
import com.enumtech.model.Engine;
import com.enumtech.model.Gear;

@Configuration
@ComponentScan(basePackages = "com.enumtech.model")
public class MyApplicationContext {
	
	@Bean(name="e1")
	public Engine getEngineUsingConstructor()
	{
		Engine engine =new Engine (3000,"Diesel","Hyundai",200.0);
		return engine;
	}
	
	@Bean(name="e2")
	@Scope("prototype")
	public Engine getEngineUsingSetter()
	{
		Engine engine =new Engine();
		engine.setEngineCC(1200);
		engine.setEngineCost(120.0);
		engine.setEngineMfgName("Tata");
		engine.setEngineType("Petrol");
		return engine;
	}
	
	@Bean(name="g1")
	@Scope("prototype")
	public Gear getGearUsingConstructor()
	{
		Gear gear =new Gear (7,"BMW",50.0);
		return gear;
	}
	
	@Bean(name="g2")
	@Scope("prototype")
	public Gear getGearUsingSetter()
	{
		Gear gear =new Gear();
		gear.setGearLever(14);
		gear.setGearMfg("Audi");
		gear.setGearPrice(100.0);
		return gear;
	}
	
	@Bean(name="c1")
	@Scope("prototype")
	public Car getCarUsingConstructor()
	{
		Car car=new Car("Tesla","R","Red",400.0);
		return car;
	}

}
