class Exam{
	private int phy, chem;
	
	public void physics(int a){
		if(a<151){
			phy = a;
		}else{
			System.out.println("Invalid Physics marks");
		}
	
	}

	public void chemistry(int a){
		if(a<151){
			chem = a;
		}else{
			System.out.println("Invalid Chemistry marks");
		}
	
	}
	
	public void showResult(){
		int total = phy + chem;
		int percentage = (total*100) / 300;
		System.out.println("Total Marks: " + total);
		System.out.println("Percentage: " + percentage + "%");

	}

}

class ToB{
	public static void main(String x[]){
		Exam exam = new Exam();
		exam.physics(88);
		exam.chemistry(75);
		exam.showResult();
	}

}