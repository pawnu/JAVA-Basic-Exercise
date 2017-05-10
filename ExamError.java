class Exam{
	private double phy, chem, math;
	double failed =0;
	
	public void physics(double a){
		phy =a;
		if(phy<65){
			failed++;
		}
	}

	public void chemistry(double a){
		chem =a;
		if(chem<65){
			failed++;
		}
	}
	
	public void maths(double a){
		math =a;
		if(math<65){
			failed++;
		}
	}
	
	public void showResult(){
		if((phy > 150) || (chem>150) || (math>150)){
			System.out.println("Invalid value entered");
		}else if((phy < 0) || (chem<0) || (math<0)){
			System.out.println("Invalid negative value entered");
		}else if(failed==3){
			System.out.println("Go home my friend!");
		}else if(failed == 2){
			System.out.println("Repeat the course");
		}else if (failed ==1){
			System.out.println("Repeat exams");
		}else{
			double total = phy + chem +math;
			double percentage = (total*100) / 450;
			System.out.println("Total Marks: " + total);
			System.out.println("Percentage: " + percentage + "%");
		}
	}
}

class ExamError{
	public static void main(String x[]){
		Exam exam = new Exam();
		
		exam.physics(66);
		exam.chemistry(104);
		exam.maths(130);	
		exam.showResult();
	}
}