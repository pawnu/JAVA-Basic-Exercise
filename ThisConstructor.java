class QAManchester{
	
	public QAManchester(){
		this(7);
		System.out.println("ABC");
	}
	public QAManchester(int a){
		this(5,7);
		System.out.println("London");
	}
	public QAManchester(int a, int b){
		System.out.println(123);
	}

}

class ThisConstructor{
	public static void main(String x[]){
		QAManchester qam = new QAManchester(1);
	}
}