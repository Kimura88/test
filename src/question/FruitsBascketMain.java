package question;

import java.util.ArrayList;



class FruitsBascket{
	private ArrayList<Fruits>fruitsList = new ArrayList<>();
	private int limit;

	public FruitsBascket(int limit) {
		this.limit = limit;
	}
	public void put(Fruits fruits) {
		if(fruitsList.size() == limit) {
			System.out.println(fruits.getName() + "もう入りません。");
			return;
		}

	System.out.println(fruits.getName() + "が入りました。");
	fruitsList.add(fruits);
	}

	public Fruits take(int index) {
		return fruitsList.remove(index);
	}
}
public class FruitsBascketMain {


	public static void main(String[] args) {


		FruitsBascket fb = new FruitsBascket(1);
		fb.put(new Fruits("orange","yellow",80));
		fb.put(new Fruits("banana","green",90));

		Fruits f = fb.take(0);
	}
}

