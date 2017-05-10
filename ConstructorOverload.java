class QA{
	int A,B,C;
	public QA(){
		System.out.println("hello");
	}
	public QA(int a, int b){
		System.out.println("Two variables are: " + a + " and " + b);
	}
}

class ConstructorOverload{
	public static void main(String x[]){
		QA one = new QA();
		QA two = new QA(5,7);
	}
}