class ExceptionHandling{
	public static void main(String[] x){
		int a,b,c;
		a=b=c=0;
		try{
			a = Integer.parseInt(x[0]);
			b = Integer.parseInt(x[1]);
			c  = a/b;
			System.out.println(c);
		}catch(NumberFormatException nf){
			System.out.println("Input only number values!");
		}catch(ArithmeticException ae){
			System.out.println("Don't divide by zero!");			
		}catch(ArrayIndexOutOfBoundsException ab){
			System.out.println("Please provide at least 2 values!");			
		}
	}

}