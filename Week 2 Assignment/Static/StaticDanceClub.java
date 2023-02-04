package dxcw2;
class club
{
	private static int counter;
	private String registrationid;
	private String name;
	private long contactnumber;
	private String city;
	static
	{
		counter=10000;
	}
	public club(String name,long contactnumber,String city)
	{
		this.registrationid="D"+ ++counter;
		this.name=name;
		this.contactnumber=contactnumber;
		this.city=city;
	}
	public String getRegistrationid() {
		return registrationid;
	}
	public void setRegistrationid(String registrationid) {
		this.registrationid = registrationid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(long contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

public class StaticDanceClub {

	public static void main(String[] args) 
	{
		club c1=new club("Saranya",7654389234l,"Erode");
		club c2=new club("Kumar",9876543217l,"Chennai");
		club[]clubs= {c1,c2};
		for(club c:clubs)
		{
			System.out.println("Hi "+c.getName()+" your Registration Id is "+c.getRegistrationid());
		}
	}

}




