class Results{
	public void addNumbers(int a){
		int result=0;
		int b=a;
		if(a<10){
			System.out.println("Provided number was " + a + ", and the result of addition is " + a);
		}else if(a>0){
			for(int i=0; b>0; i++){
				result+= (b%10);
				b = b/10;
			}
			System.out.println("Provided number was " + a + ", and the result of addition is " + result);			
		}
	}
}
class AddManyNumbers{
	public static void main(String x[]){
		Results res = new Results();
		res.addNumbers(59999999);
	}
}