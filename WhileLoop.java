public class WhileLoop {

	public static void main(String[] args) {
		//print 1....10 numbers
		
				int i=1;  
				
				while(i<=10) 
				{
					System.out.println(i);   
					i++;   
				}
				
				System.out.println("\n");
				
				//Print Hello 10 times..
				
				int j=1;
				
				while(j<=10)
				{
					System.out.println("Hello");
					j++;
				}
				
				System.out.println("\n");
				
				//Print even numbers between 1---10
				
				//Appraoch1
				
				int k=2;
				
				while(k<=10)
				{
					System.out.println(k); //2
					 k+=2;    //k=k+2;
				}
				
				
				System.out.println("\n");
				
				//Appraoch2
				
				int l=1;
				
				while(l<=10)
				{
					if(l%2==0)
					{
					System.out.println(l);
					}
					l++;
				}
				
				System.out.println("\n");
				
				//Print odd numbers between 1---10
				
				//Approach 1
				
				int m=1;
				
				while(m<=10)
				{
					System.out.println (m); 
					 m+=2;   
				}
				
				System.out.println("\n");
				
				//Approach 2
				
				int n=1;
				
				
				while(n<=10)
				{
					if(n%2!=0)
					{
					System.out.println(n);
					}
					n++;
				}
				
				System.out.println("\n");
				
				//Print 10-1
				
				int a=10;
				
				while(a>=1)
				{
					System.out.println(a);
					a--;
				}
				
	}

}
