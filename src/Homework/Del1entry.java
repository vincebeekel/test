

package Homework;

import java.text.DateFormat;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Del1entry {	
public static void main(String [] args) {
	Scanner scnr = new Scanner(System.in);
	
	String firstDay;
	String firstMonth;
	String firstYear;
	String secondDay;
	String secondMonth;
	String secondYear;
	int day;
	int month;
	int year;
	
	System.out.println("Enter day of the month for first date: ");
	firstDay = scnr.next();
	
	System.out.println("Enter the month for first date: ");
	firstMonth = scnr.next();
	
	System.out.println("Enter day the year for first date: ");
	firstYear = scnr.next();
	
	System.out.println("Enter day of the month for second date: ");
	secondDay = scnr.next();
	
	System.out.println("Enter the month for second date: ");
	secondMonth = scnr.next();
	
	System.out.println("Enter day the year for second date: ");
	secondYear = scnr.next();
	
	day = Integer.parseInt(firstDay) - Integer.parseInt(secondDay);
	day = Math.abs(day);
	
	month = Integer.parseInt(firstMonth) - Integer.parseInt(secondMonth);
	month = Math.abs(month);
	
	year = Integer.parseInt(firstYear) - Integer.parseInt(secondYear);
	year = Math.abs(year);
	
	
	
	System.out.println("The difference between the first date and second date is: " + day + " days, " + month + " months, " + year + " years.");
	
	
	
	
	
	
	
}

}
