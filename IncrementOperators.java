public class IncrementOperators {
	public static void main(String[] args) {
		
		//  ++  is called increment operator  -->   pre, post
		
		int a=10;
		
		// scenario 1 - there is no difference between pre/post increment
		
		//a++;   //a=a+1;   // post increment
		//++a;  // pre-increment
			
		//System.out.println(a);  //11

		
		
		
		//scenario -2
		
		int res=a++;
		
		
		
		System.out.println(res); //10   11
		System.out.println(a);
		
	
		//scenario -3	
				
				
				int result=++a;
				
				System.out.println(result); //12 12
				System.out.println(a);
		
	}

}
