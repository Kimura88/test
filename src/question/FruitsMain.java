package question;

class Fruits{
	private String name;
	private String color;
	private int price;

	public Fruits(String n,String c,int p) {
		name = n;
		color = c;
		price = p;
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


	public void show() {
		System.out.println("果物の名前は " + name + " 色は " + color + " 価格は " + price);
	}
}



public class FruitsMain {
	public static void main(String[] args) {
		Fruits[] f1 = {new Fruits("orange","yellow",80),
				       new Fruits("banana","green",90),
				       new Fruits("apple","red",100)};

		for(Fruits f2 : f1) {
			f2.show();
		}


	}
}

