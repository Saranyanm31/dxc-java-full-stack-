package dxcw2;

public class REcompany {
	public static boolean checkproductnamevalidity(String name)
	{
		boolean flag=false;
		String regex ="([A-Za-z]{3,10}.\\s[A-Za-z]{3,10}.\\s[A-Za-z]{3,10})"+ "|([A-Za-z]{3,10}.*\\s[A-Za-z]{3,10})";
		if(name.matches(regex))
		{
			flag=true;
		}
		return flag;
		
	}
	public static boolean checkproductidvalidity(String id)
	{
		boolean flag=false;
		String regex1="[A-Za-z0-9]{2,20}";
		if(id.matches(regex1))
		{
			flag=true;
		}
		return flag;
	}
	public static boolean checktrackeridvalidity(String trackerid)
	{
		boolean flag=false;
		String regex2="[A-Z]{1}+\\:[A-Z]{4}+\\:[a-z]{3}+\\:[0-9]{2}";
		if(trackerid.matches(regex2))
		{flag=true;
		}
		return flag;
	}

	public static void main(String[] args) 
	{
		String name="Digital Camera";
		String id="DC1911";
		String trackerid="D:CMDM:cmd:23";
		if(checkproductnamevalidity(name))
		{
			System.out.println("Product Name is Valid");
		}
		else
		{
			System.out.println("Product Name is InValid");
		}
		
		if(checkproductidvalidity(id))
		{
			System.out.println("Product Id is Valid");
		}
		else
		{
			System.out.println("Product Id is InValid");
		}
		
		if(checktrackeridvalidity(trackerid))
		{
			System.out.println("Tracker Id is Valid");
		}
		else
		{
			System.out.println("Tracker Id is InValid");
		}



	}

}


