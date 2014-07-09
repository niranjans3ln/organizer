package org.bs5lnd.test;

import java.util.GregorianCalendar;

import hirondelle.date4j.DateTime;



public class Test {
	
	public static void main(String args[]){
		//Calendar cal = Calendar();
		/*Date date = new Date();
		String currentDate = Integer.toString(date.getYear()) + "-" + Integer.toString(date.getMonth()) + "-" + Integer.toString(date.getDate());
		System.out.println("Date: " + currentDate);*/
		DateTime date = DateTime.now(new GregorianCalendar().getTimeZone());
		//String currentDate = Integer.toString(date.getYear()) + "-" + Integer.toString(date.getMonth()) + "-" + Integer.toString(date.getDate());
		System.out.println("Date: " + date.toString().substring(0, 10));
	}

}
