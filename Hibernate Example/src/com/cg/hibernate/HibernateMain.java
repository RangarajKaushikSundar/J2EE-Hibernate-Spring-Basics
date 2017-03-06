package com.cg.hibernate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class HibernateMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int choice;
		int mobile_id;
		String mobile_name;
		String mobile_make;
		double mobile_price;
		
		Configuration config=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (;;) {
			System.out.println("\n\nEnter your choice");
			System.out.println("1.Create an object 2.Exit");
			try{
				choice = Integer.parseInt(br.readLine());
				switch (choice) {
				
				case 1:
					HibernateBean obj=new HibernateBean();
						System.out.println("Enter the id");
						mobile_id=Integer.parseInt(br.readLine());
					
						System.out.println("Enter the mobile name");
						mobile_name=br.readLine();
						
						System.out.println("Enter the mobile make");
						mobile_make=br.readLine();
						
						System.out.println("Enter the price");
						mobile_price=Integer.parseInt(br.readLine());
						
					obj.setMobile_id(mobile_id);
					obj.setMobile_name(mobile_name);
					obj.setMobile_make(mobile_make);
					obj.setMobile_price(mobile_price);
						
					session.save(obj);
					tr.commit();
					break;
					
				case 2:
					System.exit(0);
					break;
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
