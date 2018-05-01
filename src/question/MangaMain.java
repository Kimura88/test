package question;

class Book{
	private String name;
	private int price;
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void showRead() {
		System.out.println("読む");
	}
}

class Manga extends Book{
	public Manga(String name, int price) {
		super(name, price);
	}
	public void showLook() {
		System.out.println("見る");
	}
}

class Novel extends Book{
	public Novel(String name, int price) {
		super(name, price);
	}
	public void showImagine() {
		System.out.println("想像する");
	}
}
public class MangaMain {
	public static void main(String[] args) {
		Manga m = new Manga("HUNTERxHUNTER", 432);
		Novel n = new Novel("変身", 346);

		m.showRead();
		m.showLook();

		n.showRead();
		n.showImagine();
	}
}
