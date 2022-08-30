package EngineOverriding;

public class EngineOverridingMain {

	public static void main(String[] args) {
		Engine e;
		e = new Engine();
		e.show();
		e = new Bike();
		e.show();
		e = new Car();
		e.show();
		e = new Aeroplane();
		e.show();
		e = new Helicopter();
		e.show();
		e = new Ship();
		e.show();
	}

}
