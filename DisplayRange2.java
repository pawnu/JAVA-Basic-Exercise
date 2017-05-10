class Range{
	public void ranged(int a, int b){
		if(a > b){
			for(int i=a;i>=b;i--){
				if((i%2)==0){
					System.out.println(i+" - EVEN");
				}else{
					System.out.println(i+" - ODD");
				}
			}
		}
		if(b>a){
			for(int i=a;i<=b;i++){
				if((i%2)==0){
					System.out.println(i+" - EVEN");
				}else{
					System.out.println(i+" - ODD");
				}
			}
			
		}
		if(a==b){
			if(a%2==0){
				System.out.println(a+" - EVEN");				
			}else{
				System.out.println(a + " - ODD");
			}
		}
	}

}

class DisplayRange2{
	public static void main(String x[]){
		Range ra = new Range();
		ra.ranged(1,4);
		ra.ranged(5,1);
		ra.ranged(5,5);
	}
}