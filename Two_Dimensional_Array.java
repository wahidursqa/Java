public class Two_Dimensional_Array {

	public static void main(String[] args) {
		
				int a[][]= { {100,200},
							 {300,400},
							 {500,600} 
							};
				
				
				//length of array
				
				System.out.println(a.length);
				System.out.println(a[0].length);
				
				//read specific value
				//System.out.println(a[2][0]); 
				

				//reading data from array using classic for loop
				
				/*for(int r=0;r<a.length;r++)//3  r=0 1 2 3
				{
					for(int c=0;c<a[r].length;c++) //2 c=0 1 2
					{
						System.out.print(a[r][c]+"   "); //100  200  300 400 500 600
					}
					
					System.out.println();
				}*/
				
				
				//reading data from 2d array using enhanced for loop
				
				for(int x[]:a)
				{
					for(int v:x)
					{
						System.out.print(v+"   ");
					}
					System.out.println();
				}
				
				

	}

}
