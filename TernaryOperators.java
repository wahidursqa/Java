public class TernaryOperators {

	public static void main(String[] args) {
	//   var=exp ? result1 : result2;
		
		//Scenario 1
		int a=10, b=20;
		
		int x= a>b ? a : b;
		
		System.out.println(x); 
		
		
		//Scenario 2
		a=10;
		b=20;
			
		
		x=b<a? b: a;
		
		System.out.println(x);  
		
		
		//Scenario3
		x=(1==1)?10:20;
		
		System.out.println(x);
		
		
		//Scenario4
		
		int age=21;
		
		String result= (age>19) ? "Adult" : "Teenager";
		
		System.out.println(result);
	}

}
