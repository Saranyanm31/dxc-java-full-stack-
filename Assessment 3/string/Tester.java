package string;

import java.util.Scanner;

public class Tester {
	
	 static String movespclchar(String str) {
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
	        return str2+str1;
	        
		}
     public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        Scanner sc=new Scanner(System.in);
		
        System.out.println("Enter the string :");
       
        String str=sc.nextLine();
        System.out.println(movespclchar(str));
       

	}

}
