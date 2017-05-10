class PrintTenNumbers{
	public void printnumbers(){
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}
}

class NumberPrinter{
	public static void main(String args[]){
		PrintTenNumbers printer = new PrintTenNumbers();
		printer.printnumbers();
		
	}
	
}