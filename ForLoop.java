
public class ForLoop {

	public static void main(String[] args) {
		//1.....10 numbers
		
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		//1-10 even numbers
		
		for(int i=2;i<=10;i+=2)
		{
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		//1-10 even numbers
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
			System.out.println(i);
			}
		
		}
		
		System.out.println("\n");
		
		//10, 9,8.....1
		
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}

	}

}
