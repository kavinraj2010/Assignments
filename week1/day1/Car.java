package demo;

public class Car {

	public void start() {
		System.out.println("Engine Start");
	}
	
	public void accelerate() {
		System.out.println("Moves on");
	}
	
	public void stop() {
		System.out.println("Engine off");
	}
	public static void main(String[] args) {
		
		Car action=new Car();
		action.start();
		action.accelerate();
		action.stop();

	}
	
}
