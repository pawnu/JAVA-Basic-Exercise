class CalculateChange{
	int fifty, twenty, ten, five, two, one, fiftyp, twentyp, tenp, fivep, twop, onep;
	
	public void calculateChange(double price, double paid){
		double change= paid - price;
		while(change>=50){
			change-=50;
			fifty++;
		}
		while(change>=20 && change < 50){
			change-=20;
			twenty++;
		}
		while(change>=10 && change<20){
			change-=10;
			ten++;
		}
		while(change>=5 && change <10){
			change-=5;
			five++;
		}
		while(change>=2 && change<5){
			change-=2;
			two++;
		}
		while(change>=1 && change<2){
			change-=1;
			one++;
		}
		while(change>=0.5 && change<1){
			change-=0.5;
			fiftyp++;
		}
		
		while(change>=0.2 && change<0.5){
			change-=0.2;
			twentyp++;
		}
		while(change>=0.1 && change<0.2){
			change-=0.1;
			tenp++;
		}
		while(change>=0.05 && change<0.1){
			change-=0.05;
			fivep++;
		}
		while(change>=0.02 && change<0.05){
			change-=0.02;
			twop++;
		}
		//change value instead of 0.01p is slightly lower at 0.0099999999
		//therefore we check if the value is greater than 0.001 to match the 1p 
		while(change>=0.001 && change<0.05){
			onep++;
			change-=0.01;
		}	
	}
	
	public void showResult(){
		System.out.println("Change is as follows: ");
		if(fifty>0){
			System.out.println("50 pound: " + fifty);
		}
		if(twenty>0){
			System.out.println("20 pound: " + twenty);
		}
		if(ten>0){
			System.out.println("10 pound: " + ten);
		}
		if(five>0){
			System.out.println("5 pound: " + five);
		}
		if(two>0){
			System.out.println("2 pound: " + two);
		}
		if(one>0){
			System.out.println("1 pound: " + one);
		}
		if(fiftyp>0){
			System.out.println("50p: " + fiftyp);
		}
		if(twentyp>0){
			System.out.println("20p: " + twentyp);
		}
		if(tenp>0){
			System.out.println("10p: " + tenp);
		}
		if(twop>0){
			System.out.println("2p: " + twop);
		}
		if(onep>0){
			System.out.println("1p: " + onep);
		}

	}
}

class DisplayChange{
	public static void main(String x[]){
		CalculateChange calculator = new CalculateChange();
		calculator.calculateChange(332.75, 500);
		calculator.showResult();
	}

}
