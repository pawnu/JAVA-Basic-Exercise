class Math1{
	public void Addition(int a, int b){
		System.out.println(a+b);
	}
	
	public void Substraction(int a, int b){
		System.out.println(a-b);
	}
}

class Math2 extends Math1{
	public void Multlipication(int a, int b){
		System.out.println(a*b);
	}
	
	public void Division(int a, int b){
		System.out.println(a/b);
	}
}

class Math3 extends Math2{
	public void Modulus(int a, int b){
		System.out.println(a%b);
	}
}

class ExtendClasses{
	public static void main(String x[]){
		Math2 child = new Math2();
		child.Addition(5,5);
		
		Math3 grandchild = new Math3();
		grandchild.Substraction(10,3);
		grandchild.Multlipication(4,4);
		grandchild.Modulus(2,5);
	}
}