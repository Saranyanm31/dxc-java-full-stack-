package method;

public class Tester {
	public static void main(String[] args) 
	{
		Point p1 = new Point(2, 3);
		System.out.println("The distance P1 from the Origin :"+p1.distance());
		Point p2 = new Point(5, 6);
		System.out.println("The distance P1 from P2 :"+p1.distance(p2));

	}

}


