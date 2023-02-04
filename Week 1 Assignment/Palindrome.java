package dxctraining;

import java.util.Scanner;

public class Palindrome {
	static void palindrome(int num){
	int  rev=0;
	int org=num;
	while(num!=0)
	{rev=(rev*10)+(num%10);
	num=num/10;
	}
	System.out.println("reverse of a number:"+rev);
if (org==rev)
System.out.println("the number is palindrome")	;
else
System.out.println("the number is not a palindrome");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		palindrome(num);
}

}
