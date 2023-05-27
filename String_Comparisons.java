public class String_Comparisons {

	public static void main(String[] args) {

		// case 1
		String s1="java";
		String s2=new String("java");
		String s3=s2;
		
		System.out.println(s1);  //java
		System.out.println(s2);  //java
		System.out.println(s3); //java
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
		
		System.out.println(s2==s3); //true
		System.out.println(s2.equals(s3)); //true 
					
		//case2
		
		s1="java";
		s2=new String("java");
		s3=s2;

	}

}
