package Inheritance;

public class Ford extends Car {

	private int year;
	int manufacturerDiscount;
	
	public Ford(int speed, double regularPrice, String color,int year,int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
		}

	public int getYear() {
		return year;
	}

	@Override
	public double getSalePrice() {
		return super.getSalePrice()-manufacturerDiscount;
	}
}
