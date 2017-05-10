class Result{
	public void displayResult(int maxnumber){
		String even ="";
		String odd = "";
		for(int i=1; i<maxnumber;i++){
			even+=i;
			odd=i+odd;
			if(i%2 ==0){
				System.out.println(even);
			}else{
				System.out.println(odd);
			}
		}
	}
	public void displayResult2(int maxnumber){
		for(int i=1; i<maxnumber;i++){
			if(i%2 ==0){
				String temp="";
				for(int j=1; j<=i;j++){
					temp+=j;
				}
				System.out.println(temp);
			}else{
				String temp="";
				for(int j=1; j<=i;j++){
					temp =j+temp;
				}				
				System.out.println(temp);
			}
		}
	}
}

class NumberSeries{
	public static void main(String x[]){
		Result r1 = new Result();
		r1.displayResult(8);
		r1.displayResult2(8);
	}
}