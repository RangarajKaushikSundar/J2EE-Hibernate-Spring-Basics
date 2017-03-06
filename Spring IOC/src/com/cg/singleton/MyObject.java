package com.cg.singleton;

public class MyObject {
		int count=0;
		private static MyObject obj;
		private MyObject(){
		
		}
		public void printCount(){
			count++;
			System.out.println("The count is :"+count);
		}
		public static MyObject getObject(){
			if(obj==null)
				obj=new MyObject();
			return obj;
		}
}
