class Results{
	private double phy, chem, math;
	String failedsubjects;
	double failed,invalid =0;
	
	public void physics(double a){
		if (a>=0 && a<=150){
			if(a<65){
				failed++;
				failedsubjects="Physics";
			}else{
				phy =a;

			}
		}else{
			invalid=1;
		}
	}

	public void chemistry(double a){
		if (a>=0 && a<=150){
			if(a<65){
				failed++;
				failedsubjects+=", Chemistry";
			}else{
				chem =a;

			}
		}else{
			invalid=1;
		}

	}
	
	public void maths(double a){
		if (a>=0 && a<=150){
			if(a<65){
				failed++;
				failedsubjects+=", Maths";
			}else{
				math =a;

			}
		}else{
			invalid=1;
		}

	}
	
	public void showResult(){
		if(invalid!=0){
			System.out.println("Invalid value entered");
		}else if(failed==3){
			System.out.println("You have failed: " + failedsubjects);
			System.out.println("Go home my friend!");
		}else if(failed == 2){
			System.out.println("You have failed: " + failedsubjects);
			System.out.println("Repeat the course");
		}else if (failed ==1){
			System.out.println("You have failed: " + failedsubjects);			
			System.out.println("Repeat exams");
		}else{
			double total = phy + chem +math;
			double percentage = (total*100) / 450;
			System.out.println("Total Marks: " + total);
			System.out.println("Percentage: " + percentage + "%");
		}
	}
}

class CalculateResult{
	public static void main(String x[]){
		Results resultcheck = new Results();
		
		resultcheck.physics(1);
		resultcheck.chemistry(34);
		resultcheck.maths(30);	
		resultcheck.showResult();
	}
}