package Inheritance;

public class MyOwnCar {

	public static void main(String[] args) {
		Car[] cars = new Car[4];
		cars[0] = new Truck(300, 1000, "Red", 3500);
		cars[1] = new Ford(450,1500,"White",2018,98);
		cars[2] = new Ford(400,1400,"White",2018,50);
		cars[3] = new Sedan(400, 1300, "Black", 25);
		
		for (Car car:cars ) {
			System.out.print("Gia sale: ");
			System.out.println(car.getRegularPrice());
		}

	}

}
