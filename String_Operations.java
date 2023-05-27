public class String_Operations {

	public static void main(String[] args) {
		String s="java";
		
		System.out.println(s);
		
		
		//length()  - returns length of a string   
		System.out.println(s.length()); 
	
		//concat() - joining strings
		
		String s1="java";
		String s2="basic";
		String s3="programming";
		
		System.out.println(s1+s2); 
		System.out.println(s1.concat(s2)); 
		
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		
		
		//trim() - remove right and left side spaces
		s="   basic    ";
				
		//String res=s.trim();
		System.out.println(s.length()); //19
		System.out.println(s.trim().length()); //10
		
		//charAt() - returns  a single char based on index we passed
		//index count starts from 0
		
		s="java";
		
		System.out.println(s.charAt(0));  
		System.out.println(s.charAt(2));  
		
		//contains() - returns boolean   true/false
		
		System.out.println(s.contains("ja")); //true

		System.out.println(s.contains("va")); //true
		
		System.out.println(s.contains("Ja")); //false
		
		
		//equals() ,   equalsIgnoreCase() - compare 2 strings
		// retuns boolean value
		
		s1="JAVA";
		s2="java";
		
		System.out.println(s1.equals(s2));   //false
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		
		
		//replace() - replace single/multiple characters in a string
		s="java basic programming";
		
		System.out.println(s.replace('a','X')); 
		
		
		//substring() - to extract substring from main string
		s="java";
		System.out.println(s.substring(2, 3));
		System.out.println(s.substring(0,3)); 
		
		//split() - divide the string into multiple parts using delimeter		
		// should not use  *  $   ^ ? .   + -
		
		s="abc@gmail.com";
		
		String a[]=s.split("@");
			
		System.out.println(a[0]); // abc
		//System.out.println(a[1]); // @gmail.com
			
		//toUpperCase(), toLowerCase()
		
		s="jaVA";
			
		System.out.println(s.toLowerCase()); 
		System.out.println(s.toUpperCase());  

	}

}
