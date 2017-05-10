class WriteLetters{
	public void printLetters(int a){
		String number;
		//4 digits
		if((a/1000 )> 0){
			number = print1000to9999(a);
		}else
		//3 digits
		if((a/100 )> 0){
			number = print100to999(a);
		}else
		//2 digits
		if((a/10 )> 0){
			number = print10to99(a);
			
		}else{
			number = print1to9(a);
		}
		System.out.println(number);
	}
	public String print1to9(int a){
		if(a==0){return "ZERO";}
		if(a==1){return "ONE";}
		if(a==2){return "TWO";}
		if(a==3){return "THREE";}
		if(a==4){return "FOUR";}
		if(a==5){return "FIVE";}
		if(a==6){return "SIX";}
		if(a==7){return "SEVEN";}
		if(a==8){return "EIGHT";}
		if(a==9){return "NINE";}
		else{return "ERRROR!";}
	}
	public String print10to99(int a){
		if(a<10){return print1to9(a);}
		if(a==10){return "TEN";}
		if(a==11){return "ELEVEN";}
		if(a==12){return "TWELVE";}
		if(a==13){return "THIRTEEN";}
		if(a==14){return "FOURTEEN";}
		if(a==15){return "FIFTEEN";}
		if(a==16){return "SIXTEEN";}
		if(a==17){return "SEVENTEEN";}
		if(a==18){return "EIGHTEEN";}
		if(a==19){return "NINETEEN";}
		if(a==20){return "TWENTY";}
		if(a==30){return "THIRTY";}
		if(a==40){return "FOURTY";}
		if(a==50){return "FIFTY";}
		if(a==60){return "SIXTY";}
		if(a==70){return "SEVENTY";}
		if(a==80){return "EIGHTY";}	
		if(a==90){return "NINETY";}
		if(a>20 && a<30){return ("TWENTY " + print1to9(a%10));}
		if(a>30 && a<40){return ("THIRTY " + print1to9(a%10));}
		if(a>40 && a<50){return ("FOURTY " + print1to9(a%10));}
		if(a>50 && a<60){return ("FIFTY " + print1to9(a%10));}
		if(a>60 && a<70){return ("SIXTY " + print1to9(a%10));}
		if(a>70 && a<80){return ("SEVENTY " + print1to9(a%10));}
		if(a>80 && a<90){return ("EIGHTY " + print1to9(a%10));}
		if(a>90 && a<100){return ("NINETY " + print1to9(a%10));}
		else{ return "ERRROR!";}
	}
	public String print100to999(int a){
		if(a<100){
			return (print10to99(a%100));
		}else{
			return (print1to9(a/100) + " HUNDRED " + print10to99(a%100));			
		}
	}
	public String print1000to9999(int a){
		if(a<1000){
			return (print100to999(a%1000));
		}else{
			return (print1to9(a/1000) + " THOUSAND " + print100to999(a%1000));
		}
		
	}
}
class NumberToLetter{
	public static void main(String args[]){
		WriteLetters wl = new WriteLetters();
		wl.printLetters(0001);
	}
}