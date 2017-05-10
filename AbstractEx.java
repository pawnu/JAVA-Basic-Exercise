interface Human{
	//constant by default public static final
	int maxage=150;
	public void eat(String foodname);
	public void walk(int numberofsteps);
	public default void fight(String person){
		System.out.println("I'm fighting "+ person);
	}
	public abstract void run(int speed);
	public static void age(){
		System.out.println("Max age is:" + maxage);
		System.out.println("Human's age is:"+ 30);
	}
}
abstract class Living{
	public abstract void breathing(boolean a);

}

class CreateHuman extends Living implements Human{
	public boolean alive;

	public void breathing(boolean a){
		alive=a;
	}	
	
	public void eat(String foodname){
		System.out.println("Eating:"+ foodname);
	}
	public void walk(int numberofsteps){
		System.out.println("Walking:"+ numberofsteps);
		
	}
	public void run(int speed){
		System.out.println("Speed:"+ speed);
	
	}
	public boolean isAlive(){
		return alive;
	}
	
}

class AbstractEx{
	public static void main(String[] x){
		CreateHuman human = new CreateHuman();
		human.eat("banana");
		human.breathing(true);
		System.out.println("Human is alive:"+human.isAlive());
		Human.age();
	}
	
}



