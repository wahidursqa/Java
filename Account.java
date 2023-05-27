public class Account {
	
	
	private int acc_no;
	private String name;
	private double amount;
	
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public static void main(String[] args) {
		Account	accobj=new Account();
		
		accobj.setAcc_no(12989895);
		accobj.setName("Md Wahidur Rahman");
		accobj.setAmount(50000);
		
		System.out.println(accobj.getAcc_no());
		System.out.println(accobj.getName());
		System.out.println(accobj.getAmount());

	}

}
