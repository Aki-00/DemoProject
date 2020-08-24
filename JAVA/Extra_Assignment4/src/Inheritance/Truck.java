package Inheritance;

public class Truck extends Car {

private int weight;

public Truck(int speed, double regularPrice, String color,int weight) {
	super(speed, regularPrice, color);
	this.weight = weight;
	}

public int getWeight() {
	return weight;
}



@Override
	public double getSalePrice() {
		if (weight>2000) {
			return super.getSalePrice()*0.9;
		}else return super.getSalePrice()*0.8;
		
	}

}