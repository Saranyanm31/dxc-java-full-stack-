package dxctraining;
import java.util.*;

public class Farm {

		public static void main(String[] args)
		{
			Scanner s=new Scanner(System.in);
			int chickens=0,rabits=0;
			System.out.println("Enter the heads:");
			int heads=s.nextInt();
			System.out.println("Enter the legs :");
			int legs=s.nextInt();
			if(heads>=legs || legs%2!=0)
			{
				System.out.println("no. of chickens and rabbits cannot be found");
			}
			else
			{
				rabits=(legs-2*heads)/2;
				chickens=heads-rabits;
				System.out.println("Chicken :"+chickens+"\n"+"Rabbit :"+rabits);
			}
		}

	}

