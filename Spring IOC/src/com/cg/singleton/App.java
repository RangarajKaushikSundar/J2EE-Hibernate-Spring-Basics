package com.cg.singleton;

public class App {
		public static void main(String[] args) {
			MyObject obj=MyObject.getObject();
			obj.printCount();
			MyObject obj1=MyObject.getObject();
			obj1.printCount();
		}
}
