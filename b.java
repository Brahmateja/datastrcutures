class a
{
	int x;
	int y;
	void add()
	{
		int sum=x+y;
		
	}
	void diff()
	{
		int sub=x-y;
		
	}
	
	void divison()
	{
		int div=x/y;
		
		
	}
}
class b extends a
{
	void display()
	{
		System.out.println("sum="+sum);
		System.out.println("diff="+sub);
		System.out.println("product="+multiply);
		System.out.println("divison="+div);
		
	}
}
class single
{
	public static void main(String args[])
	{
		b obj=new b();
		obj.x=2;
		obj.y=3;
		obj.add();
		obj.diff();
		obj.product();
		obj.divison();
		obj.display();
	}
}