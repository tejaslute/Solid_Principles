

import java.lang.*;

class Vehicle{
	
	private void startEngine() {
		System.out.println("Engine started  ");
	}
	 // If private methodds then accss that in public methods and use .
	public void engine() {
		startEngine();
	}
}

class Car extends Vehicle{
	
	public void run() {
		System.out.print("car is runnitn");
	}
}
public class Liskov {
		
	public void engineStart(Vehicle v)
	{
		v.engine();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v= new Vehicle();
		System.out.println("Start engine of vehicle ");
		//v.engine();
		
		Liskov l= new Liskov();
		l.engineStart(v);
		Car c = new Car();
		
		System.out.println("Start engine of Car ");
		l.engineStart(c);
		//c.engine();

	}

}
