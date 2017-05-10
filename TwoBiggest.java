class TwoBiggest{
	public static void main(String[] x){
		int indexa=0;
		int indexb=0;
		int biggest=Integer.parseInt(x[0]);
		int secondbiggest = Integer.parseInt(x[1]);
		
		if(x.length > 10){
			System.out.println("Please input up to 10 values");
		}else{
			try{
				for(int i=1; i<(x.length);i++){
					if (biggest<Integer.parseInt(x[i])){
						indexb=indexa;
						indexa=i;
						if(Integer.parseInt(x[indexb])<Integer.parseInt(x[i]) && indexa != i){
							indexb=i;	
						}
					}

				}
				/**
				for(int j=0; j< x.length;j++){
					if(biggest<Integer.parseInt(x[j]) && Integer.parseInt(x[indexa]) != Integer.parseInt(x[j]) ){
						indexb=j;
					}
				}**/
				System.out.println("Biggest value is: "+ Integer.parseInt(x[indexa]) + " Second biggest is: " +Integer.parseInt(x[indexb]) );				
			}catch(NumberFormatException ne){
				System.out.println("Please input numerical values only!");
			}catch(Exception e){
				System.out.println("Wow, something went wrong! Check this out: "+e.toString());
			}
		}
	}
}