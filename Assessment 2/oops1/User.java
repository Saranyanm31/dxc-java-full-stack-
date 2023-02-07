package oops1;

public class User {

		private int id;
		private String userName;
		private String email;
		private double walletBalance;

		public void user(int id, String userName, String email, double walletBalance){
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.walletBalance = walletBalance;
		}
		
		public int getid() {
		return id;
		}
		public void setid(int id) {
		this.id = id;
		}
		public String getuserName() {
		return userName;
		}
		public void setuserName(String userName) {
		this.userName = userName;
		}
		public String getemail() {
		return getemail();
		}
		public void setemail(String email) {
		this.email= email;
		}
		public double getwalletBalance(){
		return walletBalance;
		}
		public void setwalletBalance(double walletBalance) {
		this.walletBalance=walletBalance;
		}
		public boolean makePayment(double billAmount) {
	        if (walletBalance >= billAmount) {
	            walletBalance -= billAmount;
	            return true;
	        }
	        return false;
	    }
}
		
		


