class PrintUserInput{
	public void printinput(String input){
		System.out.println(input);
	}
}

class InputGetter{
	public static void main(String args[]){
		String userinput = args[0];
		PrintUserInput Pi = new PrintUserInput();
		Pi.printinput(userinput);
	}
	
}