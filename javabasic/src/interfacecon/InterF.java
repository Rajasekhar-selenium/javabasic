package interfacecon;

public class InterF implements Inter
{
	public static void main(String[] args) 
	{
		InterF a = new InterF();
		
		a.colour();
		
		a.gears();
		
		a.milliage();
		
	}

	@Override
	public void colour() 
	{
		System.out.println("gray");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gears() 
	{
		System.out.println("5 gears");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void milliage() 
	{
		System.out.println("45 kmps");
		// TODO Auto-generated method stub
		
	}

}
