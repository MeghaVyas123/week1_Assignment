package com.xyz;

public class Salary {
	private float basic;
	private float hra;
	public Salary(float basic, float hra) {
		super();
		this.basic = basic;
		this.hra = hra;
	}
	
	public Salary(){}
	
	public float getBasic() {
		return basic;
	}
	public void setBasic(float basic) {
		this.basic = basic;
	}
	public float getHra() {
		return hra;
	}
	public void setHra(float hra) {
		this.hra = hra;
	}
	@Override
	public String toString() {
		return "Salary [basic=" + basic + ", hra=" + hra + "]";
	}
}
