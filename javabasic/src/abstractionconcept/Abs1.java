package abstractionconcept;

public class Abs1 extends Abs
{
	public static void main(String[] args) 
	{
		Abs1 a = new Abs1();
		
		a.sam();
		
		a.water();
		
		a.cement();
		
		
	}

	@Override
	public void water() 
	{
	   System.out.println("100ltrs");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cement() 
	{
		System.out.println("100bags");
		// TODO Auto-generated method stub
		
	}

}
