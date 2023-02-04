package dxcw2;
class author
{
	private String name;
	private String emailid;
	private char gender;
	
	public author(String name,String emailid,char gender)
	{
		this.name=name;
		this.emailid=emailid;
		this.gender=gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name =name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
class book
{
	private String bookname;
	private author author;
	private double price;
	private int quantity;
	
	public book(String bookname,double price,int quantity)
	{
		this.bookname=bookname;
		this.author=author;
		this.price=price;
		this.quantity=quantity;
	}

	public String getBname() {
		return bookname;
	}

	public void setBname(String bname) {
		this.bookname = bname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
public author getAuthor() {
		return author;
	}

	public void setAuthor(author author) {
		this.author = author;
	}

public void displayAuthorDetails(author author) 
{
	// TODO Auto-generated method stub
	System.out.println("Author name: "+ author.getName()+"\nAuthor email: "+ author.getEmailid()+ "\nAuthor gender: "+ author.getGender());
	//System.out.println("\nBook name: "+ getBookname()+"\nAuthor : "+ getAuthor()+ "\nPrice: "+ getPrice()+ "\nQuantity: "+ getQuantity());
}
}


public class AggregationBookAuthor{

	public static void main(String[] args)
	{
		author a1 = new author("Joshua Bloch", "joshua@gmail.com", 'M');
		book b1 = new book("Effective Java", 45.0,15);
		b1.displayAuthorDetails(a1);

	}

}
