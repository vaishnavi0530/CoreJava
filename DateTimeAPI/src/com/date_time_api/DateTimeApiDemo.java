package com.date_time_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTimeApiDemo {
  
	public static void main(String[] args) {
		
		//Date:
		
		LocalDate today =  LocalDate.now();   //This function(LocalDate.now) assigns date of our system for output.
		System.out.println(today);
		
		
		LocalDate epoch = LocalDate.EPOCH;   //Epoch(LocalDate.EPOCH) starts from 1st January 1970
		System.out.println(epoch);
		
		LocalDate epochHistory = LocalDate.EPOCH.plus(19896, ChronoUnit.DAYS);   //Add number of days in epoch(1st january 1970)  [LocalDate.EPOCH.plus(__ , ChronoUnit.DAYS)] to get the desired date.
		System.out.println(epochHistory);
		
		LocalDate tomorrow = LocalDate.of(2024,02,23);
		System.out.println(tomorrow);
		
		LocalDate formattedDate = LocalDate.parse("22.06.2024",    //To get the date in our desire format(whether DD.MM.YYYY or MM.DD.YYYY, or whatever we wish)
	       DateTimeFormatter.ofPattern("dd.MM.yyyy"));    //We can also use 'dd/MM/yyyy' instead
		System.out.println(formattedDate);
	
	   LocalDate zonedDate = LocalDate.now(ZoneId.of("America/Los_Angeles"));   //To get time of different time zone across the world. We can 'ctrl + click' on 'ZoneId.' to see all options of zone
	   System.out.println(zonedDate);
	
	    LocalDate bDay = LocalDate.parse("2002-10-29");
	    System.out.println(bDay.getDayOfWeek());    //To know the weekday of desired date.
	    System.out.println(bDay.getMonth());        //To know the month of desired date.
	    String strbDay = bDay.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));   //Changing the format of our date
	    System.out.println(strbDay);
	    bDay= bDay.plusWeeks(2);   //To know date after exactly 2 weeks of bDay.
	    System.out.println(bDay);
	    
		 Period p = Period.between(LocalDate.now(), bDay);   //Period is Used to know difference between days
		 System.out.println("Years:" + p.getYears());
		 System.out.println("Months: " +  p.getMonths());
		 System.out.println("Days" + p.getDays());
		 
		 DayOfWeek bDayminus5= bDay.minus(Period.ofDays(5)).getDayOfWeek();
		 System.out.println(bDayminus5);
		   
	    
		 
	    //Time:
	    
	    LocalTime timeNow=  LocalTime.now();
	    System.out.println(timeNow);
	
	    LocalTime timeNow1= LocalTime.of(02, 54);
	    System.out.println(timeNow1);
	    
	    LocalTime timeNow2 = LocalTime.parse("13:30:40");
	    System.out.println(timeNow2);
	    System.out.println(timeNow2.minus(10, ChronoUnit.HOURS)); //To perform operation in minutrs, seconds or hours of time.
	
	    boolean isAfter = LocalTime.parse("23.00.00").isAfter(LocalTime.parse("22.00.00"));		
	    boolean isBefore  = LocalTime.parse("21.00.00").isBefore(LocalTime.parse("22.00.00"));
	    System.out.println(isAfter);
	    System.out.println(isBefore);
	    
	    
	    Duration timeDuration = Duration.between(LocalTime.parse("09:09"), LocalTime.parse("08:08"));
	    System.out.println(timeDuration.toHours());
	    System.out.println(timeDuration.toMinutes());
	    
	    
	    SimpleDateFormat simpleDate = new SimpleDateFormat("dd.MM.yyy");
	    Date newDate = null;
	    
	    try {
	         newDate = simpleDate.parse("01.01.2001");
	    } catch(ParseException e) {
	    	e.printStackTrace();
	    }
	    
	    System.out.println(newDate);	    
	    LocalDate fromDate = newDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();	    
	    System.out.println(fromDate.getDayOfWeek());
	   
	    LocalTime fromTime = newDate.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();  
	    System.out.println(fromTime.getHour());
	}
}

        