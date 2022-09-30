package Hotelrooms;
import java.text.ParseException;
import java.util.*;
public class RoomFacilities {
	Scanner sc=new Scanner(System.in);
	ShowDetails details=new ShowDetails();
	Customerinfo info=new Customerinfo(); 
	
	
		public void roomFacilities() throws ParseException
		{
			Scanner sc=new Scanner(System.in);
		System.out.println("1.DOUBLE ROOM WITH SEA VIEW");
		System.out.println("2.TRIPLE WITH BALCONY ROOM");
		System.out.println("3.SINGLE WITH CITY VIEW ROOM");
		System.out.println("4.DELUXE ROOM"); 
		Customerinfo info=new Customerinfo();
		boolean bool=false;
		while(!bool)
		{
			System.out.println("CHOOSE ANYONE FROM ABOVE OPTIONS"); 
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				long diffDays = info.details();
				System.out.println("AMOUNT PAYABLE:"+" "+diffDays*5000);
				details.doubleroom();
				//System.out.println("AMOUNT PAYABLE:"+);
				bool=true;
				break;
			case 2:
				long diffDayss = info.details();
				System.out.println("AMOUNT PAYABLE:"+" "+diffDayss*7000);
				details.tripleroom();
				bool=true;
				break;
			case 3:
				long diffDaysss = info.details();
				System.out.println("AMOUNT PAYABLE:"+" "+diffDaysss*3000);
				details.singleroom();
				bool=true;
				break;
			case 4:
				long diffDayssss = info.details();
				System.out.println("AMOUNT PAYABLE:"+" "+diffDayssss*8500);
				details.deluxeroom();
				bool=true;
				break;
			}
		}
	


}
}


