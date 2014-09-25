

public class BuddyInfo {
	public String name;
	public String address;
	public String phonenumber;
	
	
	public BuddyInfo (String name1, String Add, String Phone)
	{
		this.name = name1;
		this.address = Add;
		this.phonenumber = Phone;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo Friend = new BuddyInfo("Homer","1125 Colonel By Dr.","555-5556");
		System.out.println("Hello " + Friend.getName() +"!");
		System.out.println("Your Address is: " + Friend.getAddress());
        System.out.println("Your Phone Number is: " + Friend.getPhonenumber());
        
	}

}
