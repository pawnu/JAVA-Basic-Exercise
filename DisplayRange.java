class Range{
	public void ranged(int a, int b){
		if(a>b){
			printInc(a,b);
		}else{
			printDec(a,b);
		}
		
	}
	
	public void printInc(int a, int b){
		System.out.println("Outside for loop");

		for(int i=a; i<=b; i++){
			System.out.println("Inside for loop");
			if((i%2) == 0){
				System.out.println(i + " Even");
			}else{
				System.out.println(i + " Odd");
			}
		}
	}
	
	public void printDec(int a, int b){
		for(int i=b; i>=a; i--){
			if((i%2) == 0){
				System.out.println(i + " Even");
			}else{
				System.out.println(i + " Odd");
			}
		}		
	}
	
}

class DisplayRange{
	public static void main(String x[]){
		Range ra = new Range();
		ra.ranged(31,21);
	}
}