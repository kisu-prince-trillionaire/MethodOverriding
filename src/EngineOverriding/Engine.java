package EngineOverriding;

public class Engine {
	void show() {
		System.out.println("Engine");
	}
}

class Bike extends Engine {
	void show() {
		System.out.println("Bike Engine");
	}
}

class Car extends Engine {
	void show() {
		System.out.println("Car Engine");
	}
}

class Aeroplane extends Engine {
	void show() {
		System.out.println("Aeroplane Engine");
	}
}

class Helicopter extends Engine {
	void show() {
		System.out.println("Helicopter Engine");
	}
}

class Ship extends Engine {
	void show() {
		System.out.println("Ship Engine");
	}
}
