class Results{
	int phy, che, mat;
	
	public void showResult(){
		int res;
		res = phy+che+mat;
		System.out.println("Result is: " + res);
	
	}
}

class ONE{
	public static void main(String x[]){
		Results peter, james;
		peter = new Results();
		james = new Results();
		peter.phy = 55;
		peter.che = 40;
		peter.mat = 99;
		
		james.phy=66;
		james.che=88;
		james.mat=90;
		
		peter.showResult();
		james.showResult();
	}

}
