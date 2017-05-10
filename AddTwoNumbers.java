class Results{
	public void addNumbers(int a){
		int result = (a/10) + (a%10);
		System.out.println("Provided number was " + a + ", and the result of addition is " + result);
	}
	public void addUsingString(int a){
		String temp = "" + a;
		int result = Integer.parseInt( temp.substring(0,1)) + Integer.parseInt( temp.substring(1,2));
		System.out.println("Provided number was " + a + ", and the result of addition is " + result);

	}
}
class AddTwoNumbers{
	public static void main(String x[]){
		Results res = new Results();
		res.addNumbers(45);
		res.addUsingString(44);
	}
}