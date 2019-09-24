package register;
import customerpakage.Customer;
public class Register {
	
	Customer cus = new Customer();
	
	public void register1(String name, String address, String contactNumber, String email, String proofType,String proofID) {
	cus.setName(name);
	cus.setAddress(address);
	cus.setContactNumber(contactNumber);
	cus.setEmail(email);
	cus.setProofID(proofID);
	cus.setProofType(proofType);
	
	}
public void display()

{  
	System.out.println(cus.getName());
	System.out.println(cus.getAddress());
	System.out.println(cus.getEmail());
	System.out.println(cus.getContactNumber());
	System.out.println(cus.getProofType());
	System.out.println(cus.getProofID());
	
}
public void update(String email) {
	cus.setEmail(email);
	
	
}
}

	

