class Looper{
	String a;
	public void forloop(){
		a="";
		for(int i=0; i<10; i++){
			a+=i;
		}
		System.out.println(a);
	}
	
	public void whileloop(){
		a="";
		int i=0;
		while(i<10){
			a+=i;
			i++;
		}
		System.out.println(a);

	}
	
	public void infinitewhile(int b){
		a="";
		int i=0;
		while(true){
			i++;
			a+=i;
			if(i==b){
				break;
			}
		}
		System.out.println(a);

	}
	
	public void forbreak(){
		a="";
		for(int i =0; i<10; i++){
			a+=i;
			if(i==5){
				break;
			}
		}
		System.out.println(a);
	}
	
	public void forcontinue(){
		a="";
		for(int i=0; i<10; i++){
			if((i%2) == 0){
				continue;
			}
			a+=i;
		}
		System.out.println(a);
	}
	
	public void switchstatement(int b){
		a="";
		switch(b){
			case 1: 	a+=1;
						break;
			
			case 2: 	a+=2;
						break;
						
			case 3: 	a+=3;
						break;
						
			case 4: 	a+=4;
						break;
						
			case 5: 	a+=5;
						break;
						
			case 6: 	a+=6;
						break;
						
			case 7: 	a+=7;
						break;
			default:	a+="You entered a big number";
						break;
		}
		System.out.println(a);
		
	}
}

class Loop{
	public static void main(String x[]){
		Looper lp = new Looper();
		lp.forloop();
		lp.whileloop();
		lp.infinitewhile(8);
		lp.forbreak();
		lp.forcontinue();
		lp.switchstatement(555);
		
	}
}