package dxcw2;
class employee
{
	private int employeeid;
	private String employeename;
	private double salary;
	
	public employee(int employeeid,String employeename)
	{
		this.employeeid=employeeid;
		this.employeename=employeename;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmpname(String employeename) {
		this.employeename = employeename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
 
class permanentemployee extends employee
{
	private double basicpay;
	private double hra;
	private double experience;
	
	public permanentemployee(int employeeid,String employeename,double basicpay,double hra,double experience)
	{
		super(employeeid,employeename);
		this.basicpay=basicpay;
		this.hra=hra;
		this.experience=experience;
	}

	public double getBasicpay() {
		return basicpay;
	}

	public void setBasicpay(double basicpay) {
		this.basicpay = basicpay;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}
	
	public double calculatesalary(double salary)
	{
		if(experience<3)
		{
	         salary=Math.round(basicpay+hra);
		}
		else if(experience>=3 && experience<5)
		{
			salary=Math.round(basicpay+hra+(5*basicpay)/100);
		}
		else if(experience>=5 && experience<10)
		{
			salary=Math.round(basicpay+hra+(7*basicpay)/100);
		}
		else if(experience>=10)
		{
			salary=Math.round(basicpay+hra+(12*basicpay)/100);
		}
		return salary;

		
	}
	
}
class contractemployee extends employee
{
	private double wages;
	private float hrwk;
	public contractemployee(int employeeid,String employeename,double wages,float hrwk)
	{
		super(employeeid,employeename);
		this.wages=wages;
		this.hrwk=hrwk;
	}
	public double getWages() {
		return wages;
	}
	public void setWages(double wages) {
		this.wages = wages;
	}
	public float getHrwk() {
		return hrwk;
	}
	public void setHrwk(float hrwk) {
		this.hrwk = hrwk;
	}
	public double calculatesalary(double salary)
	{
		salary=hrwk*wages;
		return salary;
		
	}
	
}

public class InheritanceEmpolyees {

	public static void main(String[] args) 
	{
		permanentemployee permanentemp=new permanentemployee(711211,"Rafael",1855,115,3.5f);
		System.out.println("Hai "+permanentemp.getEmployeename()+" your salary is $"+permanentemp.calculatesalary(0));
		System.out.println();
		contractemployee contractemp=new contractemployee(102,"Jennifer",16,90);
		System.out.println("Hai "+contractemp.getEmployeename()+" your salary is $"+contractemp.calculatesalary(0));

	}

}




