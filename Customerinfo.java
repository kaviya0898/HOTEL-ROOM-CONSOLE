package Hotelrooms;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Customerinfo {
	Customerdetails details=new Customerdetails();
	Booking book=new Booking();
	ArrayList<Customerdetails> list=new ArrayList<>();
	DateInput date=new DateInput();
	Scanner sc=new Scanner(System.in);
	public long details() throws ParseException 
	{
		System.out.println("ENTER YOUR FIRST NAME:");
		String fname=sc.next();
		details.setFirstname(fname);
		System.out.println("ENTER YOUR LAST NAME:");
		String lname=sc.next();
		details.setLastName(lname);
		System.out.println("ENTER YOUR AGE:");
		int age=sc.nextInt();
		details.setAge(age);
		System.out.println("ENTER YOUR PHONENUMBER:");
		String phone=sc.next();
		details.setPhoneNumber(phone);
		System.out.println("HOW MANY PERSONS GOING TO STAY?:MAX 2 PERSONS PER ROOM");
		int persons=sc.nextInt();
		details.setNoOfPersons(persons);
		int temp=2;
		if(persons>1) 
		{
			//System.out.println("ENTER DETAILS FOR THE NEXT PERSON");
			for(int i=1;i<persons;i++)
			{
				System.out.println("ENTER THE DETAILS FOR CUSTOMER"+temp++);
				System.out.println("ENTER  FIRST NAME:");
				String secfname=sc.next();
				System.out.println("ENTER LAST NAME:");
				String seclname=sc.next();
				System.out.println("ENTER AGE:");
				int secage=sc.nextInt();
			}
		}
		Date date1 = null;
		Date date2 = null;
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		boolean validation = true;
		while(validation) {
			System.out.println("ENTER CHECKIN DATE(dd-mm-yyyy)");
			String dateone=sc.next();

			date1=format.parse(dateone);

			try 
			{
				date1=format.parse(dateone);
				validation = false;
			} catch (ParseException e) 
			{
				System.out.println("ENTER CORRECT FORMAT");
				e.printStackTrace();
				validation = true;
			}
		}
		validation = true;
		while(validation) {
		System.out.println("ENTER CHECKOUT DATE(dd-mm-yyyy)");
		String datetwo=sc.next();
		date2=format.parse(datetwo);
		try 
		{
			date2=format.parse(datetwo);
			validation=false;
		} catch (ParseException e) 
		{
			System.out.println("ENTER CORRECT FORMAT");
			e.printStackTrace();
			validation = false;
		}
		}
		long diff=date2.getTime()-date1.getTime();
		long diffDays = diff / (24 * 60 * 60 * 1000);
		System.out.println("YOUR ARE GOING TO STAY FOR"+" "+diffDays+"days");
		return diffDays;





	}
	public boolean isCheck(Date date1) throws ParseException
	{
		Date date2,date3,date4,date5,date6,date7,date8,date9,date10,date11;
		String dateone="03-02-2022";
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		date2=format.parse(dateone);
		try 
		{
			date2=format.parse(dateone);
		} catch (ParseException e) 
		{

			e.printStackTrace();
		}
		String datesecond="06-02-2022";
		date3=format.parse(datesecond);
		try 
		{
			date3=format.parse(dateone);
		} catch (ParseException e) 
		{

			e.printStackTrace();
		}
		String datethird="10-02-2022";
		date3=format.parse(datethird);
		try 
		{
			date3=format.parse(datethird);
		} catch (ParseException e) 
		{

			e.printStackTrace();
		}
		String datefour="12-02-2022";
		date4=format.parse(datefour);
		try 
		{
			date4=format.parse(datefour);
		} catch (ParseException e) 
		{

			e.printStackTrace();
		}
		String datefive="15-02-2022";
		date5=format.parse(datefive);
		try 
		{
			date5=format.parse(datefive);
		} catch (ParseException e) 
		{

			e.printStackTrace();
		}
		if((date1.compareTo(date2)==0)||(date1.compareTo(date3)==0)||(date1.compareTo(date4)==0)||(date1.compareTo(date5)==0))
		{
			return false;
		}
		return true;
	}

 public void isAvailable(Date date1) throws ParseException
 {
	 boolean bool=isCheck(date1);
	 if(bool==false)
	 {
		System.out.println("SORRY WE ARE PACKED");
	 }
	 else
	 {
		 System.out.println("BOOKING IS CONFIRMED"); 
	 }
 }

}


