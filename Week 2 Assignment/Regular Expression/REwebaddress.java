package dxcw2;

public class REwebaddress {
	public static boolean checkWebaddressValidity(String webAddress) {
		boolean flag=false;
		String regex="((http|https)://)(www.)?"+"[a-zA-Z0-9@:%._\\+~#?&//=]{2,256}\\.[a-z]"+"{2,6}\\b([-a-zA-Z0-9@:%.\\+~#?&//=]*)";
		if(webAddress.matches(regex))
		{
			flag=true;
		}
			return flag;
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String webAddress="http://www.company.com";
		if(checkWebaddressValidity(webAddress))
		{
			 System.out.println("Webaddress is Valid ");
		 }
		 else
		 {
			 System.out.println("webaddress is InValid ");
		 }
		 

	}

}
