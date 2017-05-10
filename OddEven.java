class Result{
	public void displayResult(int value){
		String number="";
		for(int i=1; i<=value;i++){
			number+=i;
			if((i%2) == 0){
				System.out.println(number);
			}else{
				System.out.println(i);
			}
		}
	}

}

class OddEven{
	public static void main(String x[]){
		Result re = new Result();
		re.displayResult(10);
	}

}