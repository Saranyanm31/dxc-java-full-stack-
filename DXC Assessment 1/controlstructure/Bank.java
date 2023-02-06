package controlstructure;
import java.util.*;
class account {

	int accNum;
	double accBalance;
	double salary;
	String LoneType;
	double LoanAmountExpected;
	double EmiExpected;
	
	public account(int accNum, double accBalance, double salary, String LoneType, double LoanAmountExpected,double EmiExpected) {
		
		this.accNum = accNum;
		this.accBalance = accBalance;
		this.salary = salary;
		this.LoneType = LoneType;
		this.LoanAmountExpected = LoanAmountExpected;
		this.EmiExpected = EmiExpected;
		
}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLoneType() {
		return LoneType;
	}
	public void setLoneType(String LoneType) {
		this.LoneType = LoneType;
	}
	public double getLoanAmountExpected() {
		return LoanAmountExpected;
	}
	public void setLoanAmountExpected(double LoanAmountExpected) {
		this.LoanAmountExpected = LoanAmountExpected;
	}
	public double getEmiExpected() {
		return EmiExpected;
	}
	public void setEmiExpected(double EmiExpected) {
		this.EmiExpected = EmiExpected;
	}
	public void Conditions(){
	if(accNum>999 && accNum<2000)

	{
		if (accBalance >= 1000) {
			if (salary > 25000 && LoneType == "Car") {

				if (EmiExpected <= 36 && LoanAmountExpected <= 500000) {
					System.out.println("Account number:" + accNum);
					System.out.println("Eligible loan amount:" + 5000000);
					System.out.println("Eligible EMIs :" + 36);
				} else {
					System.out.println("customer is not eligible for the loan");
				}
			}
		} else if (accBalance >= 1000) {
			if (salary > 50000 && LoneType == "House") {

				if (EmiExpected <= 60 && LoanAmountExpected <= 6000000) {
					System.out.println("Account number:" + accNum);
					System.out.println("customer can avail the amount of " + LoanAmountExpected);
					System.out.println("Eligible Emi :" + 60);
					System.out.println("Expected loan amount:" + 6000000);
					System.out.println("expected EMI:" + EmiExpected);
				} else {
					System.out.println("customer  not eligible for  loan");
				}
			}
		} else if (accBalance >= 1000) {
			if (salary > 75000 && LoneType == "Business") {

				if (EmiExpected <= 80 && LoanAmountExpected <= 7500000) {
					System.out.println("Account number:" + accNum);
					System.out.println("Eligible loan amount:" + 6000000);
					System.out.println("Eligible EMI :" + 60);

				} else {
					System.out.println("customer  not eligible for loan");
				}
			}

		}

	}else
	{
		System.out.println("Invalid account number");
	}
	}
	}
public class Bank{
	public static void main(String[] args) {
		account Customer=new account(1001,40000,250000,"Car",300000,30);
		Customer.Conditions();
	
	}
}

		
		
		
		
