class Math{
	public void Addition(int a, int b){
		System.out.println(a+b);
	}
	
	public void Substraction(int a, int b){
		System.out.println(a-b);
	}
}

class QA extends Math{
	public void Div(int a, int b){
		System.out.println("Result: " + (a/b));
	}
}


class Polymorphism1{
	public static void main(String x[]){
		Math math= new QA();
		math.Addition(7,2);
		math.Div(6,6);
	}
}