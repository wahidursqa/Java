public class Constructor_Overloading {

	int x,y;
	double d;
	
	Constructor_Overloading()  
	{
		x=5;
		y=15;
	}
	
	
	Constructor_Overloading(int a, int b)  
	{
		x=a;
		y=b;
	}
	
	
	Constructor_Overloading(int a, double b)   
	{ 
		x=a;
		d=b;
	}
	
	Constructor_Overloading(double b,int a)   
	{
		x=a;
		d=b;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(d);
		
	}

	public static void main(String[] args) {
		Constructor_Overloading  co=new Constructor_Overloading(15.5,100);
		
		co.display();

	}

}
