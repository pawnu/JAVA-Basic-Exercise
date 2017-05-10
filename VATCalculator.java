class Accounts{
	public void VAT(){
		System.out.println("20%");
	}
	public void VAT(int salary){
		float tax = salary * 20.0F/100;
		System.out.println("VAT = " + tax);
	}
	public void VAT(int salary, float t){
		float tax = salary * t/100;
		System.out.println("VAT = " + tax);
	}
}

class VATCalculator{
	
	public static void main(String args[]){
		Accounts accounts = new Accounts();
		accounts.VAT();
		accounts.VAT(25000, 25.5F);
		accounts.VAT(25000);
	}
}
