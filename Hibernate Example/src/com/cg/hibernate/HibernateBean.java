package com.cg.hibernate;

public class HibernateBean {

	int mobile_id;
	String mobile_name;
	String mobile_make;
	double mobile_price;
	
	public int getMobile_id() {
		return mobile_id;
	}
	public void setMobile_id(int mobile_id) {
		this.mobile_id = mobile_id;
	}
	public String getMobile_name() {
		return mobile_name;
	}
	public void setMobile_name(String mobile_name) {
		this.mobile_name = mobile_name;
	}
	public String getMobile_make() {
		return mobile_make;
	}
	public void setMobile_make(String mobile_make) {
		this.mobile_make = mobile_make;
	}
	public double getMobile_price() {
		return mobile_price;
	}
	public void setMobile_price(double mobile_price) {
		this.mobile_price = mobile_price;
	}
}
