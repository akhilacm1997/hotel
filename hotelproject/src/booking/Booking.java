package booking;
import customerpakage.Customer;

public class Booking {
	String ac;
	String cot;
	String cableConnection;
	String wifi ;
	String Laundry;
	static int cost=0;
	
	Customer cm = new Customer();
	public void booking1(String ac,String cot,String cableConnection,String wifi,String Laundry)
	{
		cm.setAc(ac);
		cm.setCot(cot);
		cm.setCableConnection(cableConnection);
		cm.setWifi(wifi);
		cm.setLaundry(Laundry);
		if(ac.equals("ac"))
		{
	cost=cost+1000;
	
		}
		else
		{
	cost=cost+750;
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
