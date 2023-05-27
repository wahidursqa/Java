public class Static {
	static int a=10;   // static variable
	int b=20;  // non-static
	
	
	static void m1()   // static
	{
		System.out.println("this is m1 static method");
	}
	
	void m2()   // non-static
	{
		System.out.println("this is m2 non-static method");
	}
	
	
	void m()   // non-static
	{
		System.out.println(a);
		System.out.println(b);
		
		m1();
		m2();
		
	}
	

}
