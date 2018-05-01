package fruitskadai;

public class MainFruits {

	public static void main(String[] args) {
		Fruits f1 = new Fruits("orange", "orange", 100);
		Fruits f2 = new Fruits("apple", "red", 110);
		Fruits f3 = new Fruits("banana", "yellow", 100);

		System.out.println(f1.getName());
		System.out.println(f1.getColor());
		System.out.println(f1.getPrice());

		System.out.println(f2.getName());
		System.out.println(f2.getColor());
		System.out.println(f2.getPrice());

		System.out.println(f3.getName());
		System.out.println(f3.getColor());
		System.out.println(f3.getPrice());

	}

}

class Fruits{
	private String name;
	private String color;
	private int price;

	Fruits(String name, String color, int price){
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}
}