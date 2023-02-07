package oops1;
public class Tester {
	public static void main(String[] args) {
		User user=new User(101,"Jack","jack@dxc.com",1000);
		KYCUser kycUser=new KYCUser(201,"jill","jill@dxc.com",3000);
		processPayment(user,700);
		processPayment(kycUser,1500);
		processPayment(kycUser,800);
		processPayment(kycUser,1200);
		

	}
	public static void processPayment(User user,double billAmount)
	{
		if(user.makePayment(billAmount))
		{
			System.out.println("Congratulations "+user.getuserName()+",payment of "+billAmount+" was successful");
		}
		else
		{
			System.out.println("Sorry "+user.getuserName()+",not enough balance to make payment");
		}
		System.out.println("Your wallet balance is "+user.getwalletBalance());
		if(user instanceof KYCUser)
		{
			KYCUser PUser=(KYCUser)user;
			System.out.println("you have "+PUser.getrewardPoints()+" reward points!");
			
		}
		System.out.println();
		
	}

}
	
	