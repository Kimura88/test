package fruitskadai;

import java.util.ArrayList;
import java.util.List;

public class MainFruits03 {

	public static void main(String[] args) {
		//フルーツバスケットを作る
		FruitsBasket fb = new FruitsBasket(3);

		//フルーツをバスケットに入れる
		Fruits f1 = new Fruits("orange", "orange", 100);
		fb.put(f1);
		Fruits f2 = new Fruits("apple", "red", 110);
		fb.put(f2);
		Fruits f3 = new Fruits("banana", "yellow", 120);
		fb.put(f3);

		Fruits f4 = new Fruits("peach", "pink", 130);
		fb.put(f4);

		//バスケットからフルーツを取り出す
		Fruits f5 = fb.take(0);
		
		short s = 5;
		int i = s;//暗黙的型変換
		
		short s2 = 5;
		int i2 = s2;
		
		Integer wi = new Integer(s);
		
	}

}

class FruitsBasket{
	private List<Fruits> basket = new ArrayList<Fruits>();
	private int limit;

	public FruitsBasket(int limit) {
		this.limit = limit;
	}

	public void put(Fruits fruits) {
		if(basket.size() >= limit) {
			System.out.println("バスケットはいっぱいです。");
			return;
		}
		basket.add(fruits);
	}

	public Fruits take(int index) {
		return basket.remove(index);
	}
}