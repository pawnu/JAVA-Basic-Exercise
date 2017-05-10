class Math1{
	public void Addition(int a, int b){
		System.out.println(a+b);
	}
	
	public void Substraction(int a, int b){
		System.out.println(a-b);
	}
}

class Math2 extends Math1{
	public void Addition(int a, int b){
		System.out.println("Result: " + (a+b));
	}
}


class MethodOverride{
	public static void main(String x[]){
		Math1 m1 = new Math1();
		m1.Addition(7,3);
		Math2 m2 = new Math2();
		m2.Addition(7,3);
	}
}