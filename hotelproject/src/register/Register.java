package register;
import customerpakage.Customer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import hotelproject.Main;
public class Register {
//static int id =0,m=0;
public static String name;
static String address;
static String contactNumber;
public static String email;
static String proofType;
static String proofID;
static String i,k;
static String num1="0";
int p;
	
	Customer cus = new Customer();
	
	public void register1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter your name");
		name = br.readLine();
		Main.arrname[Main.m]=name;
		System.out.println("enter your address");
		address=br.readLine();
		System.out.println("enter your contactnumber");
		contactNumber = br.readLine();
		System.out.println("enter your emailid");
		email=br.readLine();
		Main.arremail[Main.m]=email;
		System.out.println("enter your proof name");
		proofType=br.readLine();
		System.out.println("enter your prrofid");
		proofID=br.readLine();
	cus.setName(name);
	cus.setAddress(address);
	cus.setContactNumber(contactNumber);
	cus.setEmail(email);
	cus.setProofID(proofID);
	cus.setProofType(proofType);
	System.out.println("Name          :"+cus.getName());
	System.out.println("Address       :"+cus.getAddress());
	System.out.println("Email         :"+ cus.getEmail());
	System.out.println("Contact Number:"+cus.getContactNumber());
	System.out.println("ProofType     :"+cus.getProofType());
	System.out.println("ProofID       :"+cus.getProofID());
	
	}
	public void display()

	{  
		System.out.println("Name          :"+cus.getName());
		System.out.println("Address       :"+cus.getAddress());
		System.out.println("Email         :"+ cus.getEmail());
		System.out.println("Contact Number:"+cus.getContactNumber());
		System.out.println("ProofType     :"+cus.getProofType());
		System.out.println("ProofID       :"+cus.getProofID());
		
	}

public void update(String email) {
	cus.setEmail(email);
	
	
}
}

	

