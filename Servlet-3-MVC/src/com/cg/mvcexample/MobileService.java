package com.cg.mvcexample;

import java.util.List;

public class MobileService {

	MobileDao md=new MobileDao();
	
	public List<Mobile> searchByPrice(double price){
			return md.getByPrice(price);
	}
	
	public List<Mobile> displayMobiles(){
		return md.getList();
	}
	
	public void addMobile(Mobile mob){
		md.addNewMobile(mob);
	}
	
}
