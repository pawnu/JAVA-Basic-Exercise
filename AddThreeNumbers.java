class Results{
	public void addNumbers(int a){
		int twodigit = a%100;
		int result = a/100 + (twodigit/10) + (twodigit%10);
		System.out.println("Provided number was " + a + ", and the result of addition is " + result);
	}

}
class AddThreeNumbers{
	public static void main(String x[]){
		Results res = new Results();
		res.addNumbers(733);
	}
}