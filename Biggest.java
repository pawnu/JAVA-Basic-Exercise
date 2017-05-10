class Biggest{
	public static void main(String[] x){
		int biggest=Integer.parseInt(x[0]);
		if(x.length > 10){
			System.out.println("Please input up to 10 values");
		}else{
			try{
				for(int i=1; i<(x.length);i++){
					if (biggest<Integer.parseInt(x[i])){
						biggest=Integer.parseInt(x[i]);
					}
				}
				System.out.println(biggest);				
			}catch(NumberFormatException ne){
				System.out.println("Please input numerical values only!");
			}catch(Exception e){
				System.out.println("Wow, something went wrong! Check this out: "+e.toString());
			}
		}
	}
}