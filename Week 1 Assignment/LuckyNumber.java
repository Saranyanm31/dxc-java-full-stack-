package dxctraining;
import java.util.*;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter a number:");
int num=s.nextInt();
int sq=0,rem=0,sum=0,r=0,count=0;
while(num!=0)
{rem=num%10;
r=r*10+rem;
num=num/10;
count=count+1;
}
for(int i=1;i<count;i++)
{rem=r%10;
r=r/10;
if(i%2==0) 
	sq=rem*rem;
sum=sum+sq;}
if(sum%9==0)
	System.out.println("lucky number");
else
	System.out.println("not lucky number");
}


	}


