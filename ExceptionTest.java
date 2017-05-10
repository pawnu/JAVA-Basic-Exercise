class MyException extends Exception{

}

class MyMath{
	public float division(int a, int b) throws MyException{
		float c =0;
		if(b>a){
			MyException excep = new MyException();
			throw excep;
		}
		c = a/b;
		return c;
	}

}

class ExceptionTest{
	public static void main(String[] x){
		MyMath mm = new MyMath();
		try{
			System.out.println(mm.division(5,10));
		}catch(MyException e){
			System.out.println("A must be greater than B!!!");
		}catch(Exception e1){
			System.out.println("Parent exception");
		}
	}
}