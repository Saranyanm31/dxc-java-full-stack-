package array;
 class Teacher {
	private String teachername;
	private String subject;
	private double salary;
	Teacher(String teachername,String subject,double salary){
		this.teachername=teachername;
		this.subject=subject;
		this.salary=salary;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
public void display() {
	System.out.println("Name:"+getTeachername()+", Subject:"+getSubject()+", Salary"+getSalary());
}
	}
	
	


