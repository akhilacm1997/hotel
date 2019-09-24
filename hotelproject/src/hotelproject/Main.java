package hotelproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import customerpakage.Customer;
import register.Register;
import booking.Booking;
public class Main {
	static int id =0,m=0;
	static int arrid[]=new int [25];
	static String arrname[]=new String[25];
	static int room=0,m1=0;
	static int arrroom[]=new int [25];
	static int arrdate[]=new int [25];
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	String i,k;
	String num1="0";
	String i1;
	String date;
	String ac;
	String cot;
	String cableConnection;
	String wifi;
	String Laundry;
	public static void main(String[] args) throws IOException {
		
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		String i,k;
		String num1="0";
		String i1;
		int date=0;
		String ac;
		String cot;
		String cableConnection;
		String wifi;
		String Laundry;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Customer c = new Customer();
		Register r =  new Register();
		Booking b = new Booking();
		do
			{
			System.out.println("Enter your choice\n1.Registration\n2.Booking\n3.Update profile \n4.update email\n5.date\n6.view registerd customers\n7.exit");
			
		num1=br.readLine();
		switch(num1)
		{
		case "1":
		{
		System.out.println(" Welcome to Registration \n Enter your details:");
		System.out.println("enter your name");
		name = br.readLine();
		arrname[m]=name;
		System.out.println("enter your address");
		address=br.readLine();
		System.out.println("enter your contactnumber");
		contactNumber = br.readLine();
		System.out.println("enter your emailid");
		email=br.readLine();
		System.out.println("enter your proof name");
		proofType=br.readLine();
		System.out.println("enter your prrofid");
		proofID=br.readLine();
		System.out.println("Enter the  date of booking");
		 date = Integer.parseInt(br.readLine());
		
		 r.register1(name,address,contactNumber,email,proofType,proofID);
		 r.display();
		 arrid[m]=++id;
		 m++;
		 System.out.println("Thankyou for your registration your customer id is "+ id);
		 break;
		}
		case "2":
		{
			System.out.println(" Welcome to booking ");	
			   do {
				   System.out.println("please choose your service required"); 
			    System.out.println("Do you want ac room(please  enter:(ac/nac)");
			    ac = br.readLine();
			    System.out.println("Do you want single or double cot room (please  enter:(single/double)");
				cot=br.readLine();
				System.out.println("Do you want cable connection ?(please  enter:(cable/nocable)");
				cableConnection = br.readLine();
				System.out.println("Do you want wifi connection ?(please  enter:(wifi/no wifi)");
				wifi=br.readLine();
				System.out.println("Do you want any laundry services ?(please  enter:(Laundry/no Laundry)");
				Laundry=br.readLine();
				b.booking1(ac, cot, cableConnection, wifi, Laundry);
				b.displaycost();
				System.out.println("Do you want to proceed? (y/n)");
				k=br.readLine();
				System.out.println();// space of another person details
				}
		while(k.equalsIgnoreCase("n"));  
			   arrroom[m1]=++room;
			   arrdate[m1]=date;
				m1++;
			   System.out.println("your room number is  "+room );
			   System.out.println(m1);
			break;
			
		}
		case "3":
		{ 
			int count=0;
			System.out.println("enter which room you want?");
		   System.out.println(m1);
		 int j= Integer.parseInt(br.readLine());
		
		 for(int h=0;h<=m1;h++)
		 {
			 System.out.println(m1);
			System.out.println( "array element "+arrroom[h]);
			if(arrroom[h]==j)
			 {
				 System.out.println("Room number "+ arrroom[h]+ " is booked");
		     }
			else
			{
				 count=-1;
			}
		 }
		 if(!(count==-1))
		 {
			 System.out.println("Room number "+ j+ " is available");
		 }
			break;
		}
		case "4":
		{
			System.out.println("Do you want to update your email? (yes/no)");
			i=br.readLine();
			System.out.println();

			if(i.equalsIgnoreCase("yes"))
			{
				System.out.println("enter your emailid");
				email=br.readLine();
				 r.update(email);
				 r.display();
				
			}
			break;
		}
		case "5":
		{    System.out.println("enter startdate");
			int startdate =Integer.parseInt(br.readLine());
           System.out.println("enter end date");
			int enddate =Integer.parseInt(br.readLine());
			System.out.println("name"+"   date "+"customer id");
			for(int u=0;u<m1;u++)
			{
				
				if(arrdate[u]>=startdate&& arrdate[u]<=enddate)
				{
					System.out.println(arrname[u]+" "+arrdate[u]+"  "+arrid[u]);
				}
			}
			break;
		}
		case "6":
		{
			System.out.println("customer id"+"    "+"name"+"   "+"room number");
			for(int g=0;g<m;g++)
			{
				System.out.println(arrname[g]+"\t"+arrid[g]+"\t"+arrroom[g]+"\t"+arrdate[g]);
			}
			break;
		}
		case "7":
		{
			System.out.println("BYE");
		}
		}
		System.out.println("Do you want to continue? (y/n)");
		i=br.readLine();
		System.out.println();// space of another person details
		}
while(i.equalsIgnoreCase("y"));  
		
			}
	
	}


