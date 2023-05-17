import java.util.Scanner;
public class Positive_Negative_Zero {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
				
		
		if(num>0)
		{
			System.out.println("Positive number");
		}
		else if(num<0)
		{
			System.out.println("Number is Nagitive");
		}
		else
		{
			System.out.println("Number is Zero");
		}

	}

}
