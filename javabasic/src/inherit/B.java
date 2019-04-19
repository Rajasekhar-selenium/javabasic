package inherit;

public class B extends A
{
	public static void main(String[] args) 
	{
		A sam = new A();
		
		sam.crops();
		
		sam.land();
		
		sam.house();
		
		B sam1 = new B();
		
		sam1.car();
		
		sam1.bike();
		
		sam1.lorry();
		
	}

	public void car()
	{
		System.out.println("car");
	}
	
	public void bike()
	{
		System.out.println("bike");
	}
	
	public void lorry()
	{
		System.out.println("lorry");
	}
	
	
}
