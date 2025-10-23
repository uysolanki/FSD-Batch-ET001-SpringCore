package com.enumtech.model;

public class Engine {

	private int engineCC;
	private String engineType;
	private String engineMfgName;
	private double engineCost;
	
	public Engine() {
		System.out.println("No Args Constructor of Engine class called");
	}
	public Engine(int engineCC, String engineType, String engineMfgName, double engineCost) {
		System.out.println("All Args Constructor of Engine class called");
		this.engineCC = engineCC;
		this.engineType = engineType;
		this.engineMfgName = engineMfgName;
		this.engineCost = engineCost;
	}
	public int getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public String getEngineMfgName() {
		return engineMfgName;
	}
	public void setEngineMfgName(String engineMfgName) {
		this.engineMfgName = engineMfgName;
	}
	public double getEngineCost() {
		return engineCost;
	}
	public void setEngineCost(double engineCost) {
		this.engineCost = engineCost;
	}
	@Override
	public String toString() {
		return "Engine [engineCC=" + engineCC + ", engineType=" + engineType + ", engineMfgName=" + engineMfgName
				+ ", engineCost=" + engineCost + "]";
	}
	
	
	
	
}
