package dxcw2;

public class REpassword {
	public static boolean checkpasswordvalidate(String password)
	{
	   boolean flag = false;
	   String regex = "^(?=.\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%&_]).{8,20}$";
	   if (password.matches(regex))
	   {
	      flag = true;
	   }
	    return flag;
	 }
	public static void main(String[] args) {

		 String password = "P@ssW0rd";
		 if(checkpasswordvalidate(password))
		 {
			 System.out.println("The Password is Valid ");
		 }
		 else
		 {
			 System.out.println("The Password is InValid ");
		 }
		 
	}
	}
	
	

