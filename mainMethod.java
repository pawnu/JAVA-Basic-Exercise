class JAVAprogram{
	int a =2;
	int b =4;
	public void addVariable(){
		System.out.println("Adding the 2 variables..");
		System.out.println(a+b);
		
	}
}

class mainMethod{
	public static void main(String args[]){
		JAVAprogram J1 = new JAVAprogram();
		J1.addVariable();
	}
}