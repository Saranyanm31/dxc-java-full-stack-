package dxctraining;
import java.util.*;
public class MovesSplch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
        System.out.println("Enter the string :");
       
        String str=sc.nextLine();
       
        String reg="[^a-zA-Z0-9]";
        String str1=" ";
        String str2=" ";
        for(int i=0;i<str.length();i++)
        {
        	char c=str.charAt(i);
        	if(str.valueOf(c).matches(reg))
        		str1=str1+c;
        	else
        		str2=str2+c;
        }
        System.out.println(str1+str2);
        
	}

}





