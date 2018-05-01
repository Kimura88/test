package question;

class Animal extends Object{
	private int age;
	//引数ありのコンストラクタを作った
	public Animal(int age) {
		super();//Objectクラスのデフォルトコンストラクタ
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void showWalk() {
		System.out.println("歩く");
	}
}
class Dog extends Animal{
	//デフォルトコンストラクタ作られない
	public Dog(int a) {
		super(a);
	}
	public void showBite() {
//		super.showWalk();
		System.out.println("噛みつく");
	}
}
class Cat extends Animal{
	public Cat(int a) {
		super(a);
	}
	public void showScratch() {
//		super.showWalk();
		System.out.println("ひっかく");
	}
}
public class DogCatMain {
	public static void main(String[] args) {
		Dog d = new Dog(2);
		Cat c = new Cat(3);

		d.showWalk();
		d.showBite();

		c.showWalk();
		c.showScratch();

	}
}
