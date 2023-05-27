class Bank
{
	double roi()
	{
		return 0.0;
	}
}


class SCB extends Bank
{
	double roi()
	{
		return 10.5;
	}
}

class CityBank extends Bank
{
	double roi()
	{
		return 11.5;
	}
}

public class Overriding {

	public static void main(String[] args) {
		SCB ic=new SCB();
		System.out.println(ic.roi()); //10.5
		
		
		CityBank ax=new CityBank();
		System.out.println(ax.roi()); //11.5
		
		Bank bn=new Bank();
		System.out.println(bn.roi()); //0.0

	}

}
