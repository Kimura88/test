package bmi3;

interface Information{
	//name,height,weight,MAX,MINの抽象メソッドをインターフェイス内に定義
	public abstract String getName();
	public abstract double  getHeight();
	public abstract double  getWeight();
	public abstract double getMAX();
	public abstract double getMIN();
}

class Human implements Information{
	private String name;
	private double height;
	private double weight;
	public static final double MAX = 25.0;
	public static final double MIN = 18.5;

	public Human(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	//インターフェイス内で定義した抽象メソッドをそれぞれオーバーライドする
	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getHeight() {
		return height;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public double getMAX() {
		return MAX;
	}

	@Override
	public double getMIN() {
		return MIN;
	}
}

class Child implements Information{
	private String name;
	private double height;
	private double weight;
	public static final double MAX = 18.0;
	public static final double MIN = 15.0;

	public Child(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	//インターフェイス内で定義した抽象メソッドをそれぞれオーバーライドする
	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getHeight() {
		return height;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public double getMAX() {
		return MAX;
	}

	@Override
	public double getMIN() {
		return MIN;
	}

}

class BMI{
	public static double calc(Information i) {
		//体重/身長/身長
		return i.getWeight() / i.getHeight() / i.getHeight();
	}
	public static String judge(Information i) {
		double bmi = calc(i);
		if(i.getMAX() < bmi) {
			return "太りすぎです";
		}else if(i.getMIN() < bmi) {
			return "標準です";
		}else {
			return "痩せすぎです";
		}
	}

}

public class Main03 {
	public static void main(String[] args) {
		Human h = new Human("kato", 1.77, 69.5);
		System.out.println("----- BMI -----");
		System.out.println(h.getName() + "さんのBMIは" + BMI.calc(h));
		System.out.println(BMI.judge(h));
		System.out.println("---------------");

		System.out.println();

		Child c = new Child("taro", 1.77, 69.5);
		System.out.println("----- BMI -----");
		System.out.println(c.getName() + "ちゃんのBMIは" + BMI.calc(c));
		System.out.println(BMI.judge(c));
		System.out.println("---------------");
	}
}