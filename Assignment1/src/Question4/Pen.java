package Question4;

public class Pen {
	private String brand;
	private String type;
	
	public Pen(String brand, String type) {
		this.brand = brand;
		this.type = type;
	}
	
	public double getPrice(double length, double width) {
		if (type.equals("Marker"))
			return length * width * 10;
		else
			return length * width;
	}
	
	public int getYear(double price, double length, double width) {
		if (price > 200 && length > 1.5 && width > 0.5)
			return 1990;
		else
			return 2020;
	}
}
