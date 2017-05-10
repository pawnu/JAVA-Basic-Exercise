class Bank{
	static int Dollar;
	
	public void setDollar(int A){
		Dollar = A;
	}
	public void Amount(int amount){
		System.out.println(amount*Dollar);
	}
}


class StaticMethod{
	public static void main(String x[]){
		Bank HSBC = new Bank();
		Bank Natwest = new Bank();
		HSBC.setDollar(5);
		HSBC.Amount(50);
		
		//Natwest.setDollar(10);
		Natwest.Amount(50);
	}
}