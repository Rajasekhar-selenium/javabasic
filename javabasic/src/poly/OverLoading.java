package poly;

public class OverLoading 
{
	
	static int i = 10;

	/*public void add()
	{
		System.out.println("over looading Concept");
	}*/
	
	public void add()
	{
		System.out.println(i);
	}
	
	public void add(String i)
	{
		System.out.println(i);
	}
	
	public void add(String i, int j)
	{
		System.out.println(i+" "+j);
	}
	
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	
	public static void main(String[] args) 
	{
		OverLoading a = new OverLoading();
		
	//	a.add();
		
	//	a.add(10, 20);
		
		a.add();
		
		//a.add("mindq");
		
	//	a.add("hyd, 500032");
		
		
		
	}
	
}
