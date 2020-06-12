package Question4;

public class Book {
	private String name;
	private String category;
	
	public Book(String name, String category) {
		this.name = name;
		this.category = category;
	}
	
	public double getPrice(double size) {
		if (category.equals("rare"))
			return size * 10000;
		else
			return size * 10;
	}
	
	public int getYear(double price) {
		if (price > 10000)
			return 1920;
		else
			return 2000;
	}
}
