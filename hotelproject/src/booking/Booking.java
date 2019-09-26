package booking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import customerpakage.Customer;
import hotelproject.Main;

public class Booking {
	String ac;
	String cot;
	String cableConnection;
	String wifi ;
	String Laundry;
	
	int nosPersons,nosDays;
	
	Customer cm = new Customer();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Doubleroombooking db = new Doubleroombooking();
	public void booking1() throws IOException
			
	{  int cost=0;
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
	    cm.customerbooking(ac, cot, cableConnection, wifi, Laundry);
		cm.setAc(ac);
		cm.setCot(cot);
		cm.setCableConnection(cableConnection);
		cm.setWifi(wifi);
		cm.setLaundry(Laundry);
		if(ac.equals("ac"))
		{
			
			cost=cost+db.acbooking();
	
		}
		else
		{
			cost=cost+db.nACbooking();
			
		}
		if(cot.equalsIgnoreCase("double"))
		{
			cost=cost+350;
	
	
		}
		if(cableConnection.equals("cable"))
		{
			cost=cost+50;
	
		}
		if(wifi.equals("wifi"))
		{
			cost=cost+200;
	
		}
		if(Laundry.equals("Laundry"))
		{
			cost=cost+100;
	
		}
		System.out.println("cost is"+ cost);

		
	}
	public void displaycost()
	{
		System.out.println(cm.getAc());
		System.out.println(cm.getCot());
		System.out.println(cm.getCableConnection());
		System.out.println(cm.getWifi());
		System.out.println(cm.getLaundry());	
		
	}
}
