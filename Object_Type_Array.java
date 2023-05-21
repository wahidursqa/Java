public class Object_Type_Array {

	public static void main(String[] args) {

		Object a[]=new Object[5];
		
		a[0]=5;
		a[1]=5.5;
		a[2]="Dhaka";
		a[3]='D';
		a[4]=true;
		
		for(Object x:a)
		{
			System.out.println(x);
		}

	}

}
