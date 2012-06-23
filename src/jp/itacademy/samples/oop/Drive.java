package jp.itacademy.samples.oop;

import jp.itacadmy.samples.oop.car.Car;

public class Drive {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.addGas(4);
		car1.drive();
		
		Car car2 = new Truck();
		car2.addGas(4);
		car2.drive();
	}
}
