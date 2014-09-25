import java.util.ArrayList;

public class AddressBook {
	private ArrayList<BuddyInfo> buddyInfo;

	public AddressBook()
	{
		this.buddyInfo = new ArrayList<BuddyInfo>();
	
	}
	
	public void addBuddy(BuddyInfo aBuddyInfo)
	{
	  if (aBuddyInfo !=null)	
	  {
		  this.buddyInfo.add(aBuddyInfo);
		  System.out.println("Buddy Added!");
		  
	  }
	}
	
	public  BuddyInfo removeBuddy(int index)
	{
		if (index >=0 && index < this.buddyInfo.size())
		{
			System.out.println("Buddy Removed!");
			return this.buddyInfo.remove(index);
		
	
		}
		System.out.println("Error!");
		return null;
	}
	
	

	public static void main(String[] args) {
		BuddyInfo Friend = new BuddyInfo("Tom","Carleton","1234");
		BuddyInfo NewFriend = new BuddyInfo("Jim","Carleton","2354");
		BuddyInfo NewestFriend = new BuddyInfo("jj","Carleton","5555");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(Friend);
		addressBook.addBuddy(NewFriend);
		addressBook.addBuddy(NewestFriend);
		addressBook.removeBuddy(0);
	
		
	  
	    

		

	}

}
