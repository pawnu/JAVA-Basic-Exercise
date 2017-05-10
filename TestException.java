class TestException{

	public static void main(String x[]){
		int A, B, C;
		C=1;
		A=4;
		B=1;
		int[] outofbounds={5,3};
		try{
			C=A/B;
			B=outofbounds[3];
		}catch(ArithmeticException e){
			System.out.println("You can't divide by zero!");			
		}catch(ArrayIndexOutOfBoundsException a){
			System.out.println("Your're accessing array length out of what you defined!");						
		}
		System.out.println("A:"+A + " B:"+B +" C:"+C);
		
	}
}