abstract class Math1{
	abstract public void Addition(int a, int b);
	
	abstract public void Substraction(int a, int b);
}

class Math2 extends Math1{
	public void Addition(int a, int b){
		System.out.println("Result: " + (a+b));
	}
	public void Substraction(int a, int b){
		System.out.println("Result: " + (a-b));
	}
	public void Division(int a, int b){
		System.out.println("Result: "+ (a/b));
	}
}


class AbstractClass{
	public static void main(String x[]){
		Math2 m2 = new Math2();
		m2.Addition(6,6);
		m2.Substraction(6,6);
		m2.Division(6,6);
	}
}