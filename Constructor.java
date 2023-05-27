
public class Constructor {

	int x,y;
	String s;
	
	/*Constructor()   // default constructor
	{
		x=100;
		y=200;
		s="java";
	}*/
	
	Constructor(int a, int b, String str)   // parameterized constructor
	{
		x=a;
		y=b;
		s=str;
	}
	
	void displayData()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
		
	}
	public static void main(String[] args) {
		//Constructor c=new Constructor();   // default constructor
				Constructor c=new Constructor(5,15,"Java");  // parameterized constructor
				
				c.displayData();

	}

}
