class Math{
	public void add(int x, int y){
		int c = x+y;
		System.out.println(c);
	}

	public void minus(int x, int y){
		int c = x-y;
		System.out.println(c);
	}

	public void multiply(int x, int y){
		int c = x*y;
		System.out.println(c);
	}

	public void divide(int x, int y){
		int c = x/y;
		System.out.println(c);
	}

	public int addreturn(int x, int y){
		return x+y;
	}
}

class calculator{
	public static void main(String x[]){
		Math domaths = new Math();
		domaths.add(5, 15);
		domaths.minus(151,5);
		domaths.multiply(101,11);
		domaths.divide(100,17);
		System.out.println("Result of addition is: " + domaths.addreturn(5,5));

	}

}
