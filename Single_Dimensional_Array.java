import java.util.Arrays;
public class Single_Dimensional_Array {

	public static void main(String[] args) {
	
	
		int a[]= {10,20,30,40,50,60};
		
		
		//size/length of an array

		System.out.println(a.length);  
		
		//get single value from array
		System.out.println(a[3]);  
		
		//get all the values from array
		System.out.println(Arrays.toString(a)); 
		
		//get all the values by using loop
		
		for(int x:a)
		{
			System.out.println(x);
		}
		

	}

}
