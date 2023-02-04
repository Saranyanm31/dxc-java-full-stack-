package dxctraining;
import java.util.*;

public class Methodarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,d,org,count;
Scanner s=new Scanner(System.in);
num=s.nextInt() ;
double sum=0;
count=0;
org=num;

while(num!=0);
{
	count++;
	num=num/10;
}
while(num!=0);
{
	d=num%10;
	sum=sum+Math.pow(d, count);
	num=num/10;
}
System.out.println("sum of didits:"+sum);
if(org==num)
	System.out.println("it is amstrong");
else
	System.out.println("its not amstromg num");

	}

}
