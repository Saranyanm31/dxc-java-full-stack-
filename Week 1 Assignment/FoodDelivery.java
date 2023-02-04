package dxctraining;
import java.util.*;

public class FoodDelivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       int del_charge;
				int total=0;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter V / N ");
				char c=sc.next().charAt(0);
				System.out.println("Quantity ordered : ");
				int q=sc.nextInt();
				System.out.println(" Distance in Kms : ");
				int d=sc.nextInt();
				if(c=='V' || c=='v')
				{
					if(d>0 && d<=3)
					{
						del_charge=0;
						total=del_charge+q*12;
					}
					else if(d>3 && d<=6)
					{
						del_charge=1;
						total=q*12+del_charge;
					}
					else if(d>6)
					{
						del_charge=2;
						total=q*12+(d-5)*2+1;
					}
					else
					{
						System.out.println("Enter valid input");
					}
				}
				else if(c=='N' || c=='n')
				{
					if(d>0 && d<=3)
					{
						del_charge=0;
						total=del_charge+q*15;
					}
					else if(d>3 && d<=6)
					{
						del_charge=1;
						total=q*15+del_charge;
					}
					else if(d>6)
					{
						del_charge=2;
						total=q*15+(d-5)*2+1;
					}
					else
					{
						System.out.println("Enter valid input");
					}
				}
				else
				{
					System.out.println("Enter valid input");
				}
				System.out.println("Total amount is : "+total );
			}

		
	}


