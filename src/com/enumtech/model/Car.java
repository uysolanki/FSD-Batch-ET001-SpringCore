package com.enumtech.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

			private String carMfgName;
			private String carModelName;
			private String carColor;
			private double carPrice;
			
			@Autowired         //byType
			@Qualifier("e2")   //byName
			private Engine engine;
			
			@Autowired
			@Qualifier("g2")
			private Gear gear;
			
			public Car() {}
			public Car(String carMfgName, String carModelName, String carColor, double carPrice, Engine engine,
					Gear gear) {
				this.carMfgName = carMfgName;
				this.carModelName = carModelName;
				this.carColor = carColor;
				this.carPrice = carPrice;
				this.engine = engine;
				this.gear = gear;
			}
			
			public Car(String carMfgName, String carModelName, String carColor, double carPrice) {
				this.carMfgName = carMfgName;
				this.carModelName = carModelName;
				this.carColor = carColor;
				this.carPrice = carPrice;
			}
			public String getCarMfgName() {
				return carMfgName;
			}
			public void setCarMfgName(String carMfgName) {
				this.carMfgName = carMfgName;
			}
			public String getCarModelName() {
				return carModelName;
			}
			public void setCarModelName(String carModelName) {
				this.carModelName = carModelName;
			}
			public String getCarColor() {
				return carColor;
			}
			public void setCarColor(String carColor) {
				this.carColor = carColor;
			}
			public double getCarPrice() {
				return carPrice;
			}
			public void setCarPrice(double carPrice) {
				this.carPrice = carPrice;
			}
			public Engine getEngine() {
				return engine;
			}
			public void setEngine(Engine engine) {
				this.engine = engine;
			}
			public Gear getGear() {
				return gear;
			}
			public void setGear(Gear gear) {
				this.gear = gear;
			}
			@Override
			public String toString() {
				return "Car [carMfgName=" + carMfgName + ", carModelName=" + carModelName + ", carColor=" + carColor
						+ ", carPrice=" + carPrice + ", engine=" + engine + ", gear=" + gear + "]";
			}
			
			
}
