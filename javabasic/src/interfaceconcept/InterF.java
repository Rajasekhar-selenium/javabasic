package interfaceconcept;

public class InterF implements Inter
{

	@Override
	public void colour()
	{
		System.out.println("gray");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gears() 
	{
		System.out.println("5");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void milliage() 
	{
		System.out.println("45 - 50");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) 
	{
		InterF a = new InterF();
		
		a.colour();
		
		a.milliage();
		
		a.gears();
		
	}
	

}
