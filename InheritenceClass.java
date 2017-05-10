class XYZ{
	int a, b;
	
	public void message(){
		System.out.println("hello");
		System.out.println(a+b);	
	}
}

class ABC extends XYZ{

}

class InheritenceClass{
	public static void main(String x[]){
		ABC abc= new ABC();
		abc.a = 15;
		abc.b = 4;
		abc.message();
	}
}