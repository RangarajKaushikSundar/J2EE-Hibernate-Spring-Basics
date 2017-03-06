package com.cg.mvcexample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MobileDao {
	MobileDaoUtil mdu=new MobileDaoUtil();
	
	Connection con=mdu.getConnection();;
	Statement st;
	ResultSet rs;
	
	public List<Mobile> getList(){
		
		List<Mobile> list=null;
		try{
			st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from mobile_store order by mobile_id");
			list=new ArrayList<Mobile>();
			
			Iterator iterator=list.iterator();
			while(rs.next()){
				Mobile mob=new Mobile();
				mob.setMobile_id(rs.getInt("mobile_id"));
				mob.setMobile_name(rs.getString("mobile_name"));
				mob.setMobile_make(rs.getString("mobile_make"));
				mob.setMobile_price(rs.getDouble("mobile_price"));
				list.add(mob);			
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void addNewMobile(Mobile mob){
		try{
			PreparedStatement pst=con.prepareStatement("INSERT INTO MOBILE_STORE VALUES (?, ?,?, ?)");
			pst.setInt	 (1, 		mob.getMobile_id());
			pst.setString(2, 	mob.getMobile_name());
			pst.setString(3, 	mob.getMobile_make());
			pst.setDouble(4,	mob.getMobile_price());
			pst.executeUpdate();
			System.out.println("Query Executed");			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Mobile> getByPrice(double price){
		List<Mobile> list=null;
		try{
			
			list=new ArrayList<Mobile>();
			PreparedStatement pst=con.prepareStatement("Select * from mobile_store where mobile_price between ? and ? order by mobile_id");
			pst.setDouble(1, (price-1000));
			pst.setDouble(2, (price+1000));
			
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()){
				Mobile mob=new Mobile();
				mob.setMobile_id(rs.getInt("mobile_id"));
				mob.setMobile_name(rs.getString("mobile_name"));
				mob.setMobile_make(rs.getString("mobile_make"));
				mob.setMobile_price(rs.getDouble("mobile_price"));
				list.add(mob);			
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
 	
	
}
