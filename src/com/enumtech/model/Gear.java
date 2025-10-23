package com.enumtech.model;

public class Gear {
	private int gearLever;
	private String gearMfg;
	private double gearPrice;
	
	public Gear() {}
	public Gear(int gearLever, String gearMfg, double gearPrice) {
		this.gearLever = gearLever;
		this.gearMfg = gearMfg;
		this.gearPrice = gearPrice;
	}
	public int getGearLever() {
		return gearLever;
	}
	public void setGearLever(int gearLever) {
		this.gearLever = gearLever;
	}
	public String getGearMfg() {
		return gearMfg;
	}
	public void setGearMfg(String gearMfg) {
		this.gearMfg = gearMfg;
	}
	public double getGearPrice() {
		return gearPrice;
	}
	public void setGearPrice(double gearPrice) {
		this.gearPrice = gearPrice;
	}
	@Override
	public String toString() {
		return "Gear [gearLever=" + gearLever + ", gearMfg=" + gearMfg + ", gearPrice=" + gearPrice + "]";
	}
	
	

}
