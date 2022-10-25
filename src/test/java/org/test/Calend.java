package org.test;

import java.util.Calendar;
import java.util.Date;

public class Calend {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); // starts with today's date and time
	    System.out.println("Day of the week before add" + c.DAY_OF_WEEK);
	    Date date = null;
	    for (int i =1;i<=7;i++)
	    {
	    
	    	c.add(Calendar.DAY_OF_YEAR, 1);  // advances day by 2
	 	     date = c.getTime(); // gets modified time
	 	    System.out.println(date );
	    }
	   
	    String appointDetails = date.toString();
	    System.out.println(appointDetails);
	    String[] split = appointDetails.split(" ");
	    System.out.println(split[0]);
	  //  System.out.println(appointDetails);
	 //   System.out.println("Day of the week after add" + c.DAY_OF_WEEK);
	    int appointmentDay = c.DAY_OF_WEEK ;
	    System.out.println(appointmentDay);
	}

}
