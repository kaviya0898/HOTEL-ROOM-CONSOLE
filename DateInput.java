package Hotelrooms;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
public class DateInput
{
	Scanner sc=new Scanner(System.in);
 public void DateInput() throws ParseException
 {
	 Date date1;
	 Date date2;
	 
	 System.out.println("ENTER CHECKIN DATE(dd-mm-yyyy)");
	 String dateone=sc.next();
	 SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
	 date1=format.parse(dateone);
	 try 
	 {
		date1=format.parse(dateone);
	} catch (ParseException e) 
	 {
		System.out.println("ENTER CORRECT FORMAT");
		e.printStackTrace();
	}
	 System.out.println("ENTER CHECKOUT DATE(dd-mm-yyyy)");
	 String datetwo=sc.next();
	 date2=format.parse(datetwo);
	 try 
	 {
		date2=format.parse(datetwo);
	} catch (ParseException e) 
	 {
		System.out.println("ENTER CORRECT FORMAT");
		e.printStackTrace();
	}
	 long diff=date2.getTime()-date1.getTime();
	 long diffDays = diff / (24 * 60 * 60 * 1000);
	 System.out.println("YOUR ARE GOING TO STAY FOR"+" "+diffDays+"days");
	 long pay1=diffDays(diffDays,date1,date2);
	
	 
 }
 public long diffDays(long diffDays,Date date1,Date date2)
 {
	 long diff=date2.getTime()-date1.getTime();
	 long differentDays = diff / (24 * 60 * 60 * 1000);
	 return differentDays;
 }
}
