class Test{
	int A;
	public static void message( ){
		//System.out.println("Hello" + A);
		System.out.println("Hello");
	}
	public void message2(){
		System.out.println("welcome");
	}
}


class StaticMethod2{
	public static void main(String x[]){
		Test.message();
		Test t = new Test();
		t.message2();
	}
}