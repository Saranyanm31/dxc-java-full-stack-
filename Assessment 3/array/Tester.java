package array;

public class Tester {
	public static void main(String[] args) {
	Teacher obj[]=new Teacher[4];
	obj[0]=new Teacher("Alex","java fundamental",1200.0);
	obj[1]=new Teacher("john","RDBMS",800.0);
	obj[2]=new Teacher("Sam","Networking",900.0);
	obj[3]=new Teacher("Maria","python",900.0);
for(int i=0;i<4;i++)
{
	obj[i].display();
}

}

}
