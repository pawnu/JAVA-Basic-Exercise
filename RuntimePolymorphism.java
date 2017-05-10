abstract class Drawing{
	//enforcing that this method must be implemented
	abstract public void draw();
}

class Circle extends Drawing{
	public void draw(){
		System.out.println("I'll draw a circle");
	}
}

class Line extends Drawing{
	public void draw(){
		System.out.println("I'll draw a line");
	}
}

class Square extends Drawing{
	public void draw(){
		System.out.println("I'll draw a square");
	}
}

class RuntimePolymorphism{
	//enforcing that an object of Drawing is required which in turn requires implementation of draw method
	public static void doDrawing(Drawing x){
		x.draw();
	}
	
	public static void main(String x[]){
		Circle c = new Circle();
		Line l = new Line();
		Square s = new Square();
		doDrawing(c);
		doDrawing(l);
		doDrawing(s);
	}
}