package poly;

public class OverRide1 extends OverRide
{
	public void add()
	{
		int i = 1000; int j = 2000;
		
		System.out.println(i+j);
	}
	
	public void sub()
	{
		int i = 1000; int j = 2000;
		
		System.out.println(j-i);
	}

	public static void main(String[] args) 
	{
		OverRide1  r = new OverRide1();
		
		r.add();
		
		r.sub();
		
		r.add();
		
		r.sub();
		
		
	}

}
