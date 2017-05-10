class Tree{
	int A,B;
	
	public void what(){
		int A,C;
		this.A = 10;
		C = 15;
	}
	public void message(){
		System.out.println("A = " +A);
		System.out.println("B = " +B);		
		//System.out.println("C = " +C);
	}
}

class ThisKeyword{
	public static void main(String x[]){
		Tree tree = new Tree();
		tree.what();
		tree.message();
	}
}