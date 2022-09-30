package Hotelrooms;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MainHotelPage {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t\t\tWELCOME TO BAYRESORTS");
		System.out.println("ENTER THE BELOW OPTIONS TO KNOW ABOUT ROOM FACILITIES");
		RoomFacilities facilities=new RoomFacilities();
		facilities.roomFacilities();
		Customerdetails details=new Customerdetails();
		Customerinfo info=new Customerinfo();
		System.out.println("-------------------------------------");
        boolean bool=false;
        while(!bool) {
        System.out.println("ENTER YES TO CONFIRM BOOKING OR\nENTER BACK TO VIEW MAINMENU OR \nENTER EXIT");
        String choice=sc.next();
        if(choice.equals("back"))
        {
        	facilities.roomFacilities();
        }
        else if(choice.equals("yes"))
        {
        	System.out.println("PLEASE WAIT WHILE WE CHECK AVAILABILITY ON THAT DATE");
        	
        	try { 
        		Thread.sleep(5000); 
        	} catch(InterruptedException ex){ 
        	 
        		System.exit(0); 
        	} 
        	 
        	System.out.println("BOOKING CONFIRMED"); 
        	
        	bool=true;
        }
        else if((choice.equals("exit")))
        {
        	System.out.println("THANKYOU FOR VISITING");
        	sc.close();
        	bool=true;
        }
	}

}
}
