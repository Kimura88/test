package bmi2;

abstract class HumanBeings{
	private String name;//Human,Childそれぞれで定義していたフィールドをスーパークラスにまとめる
	private double height;
	private double weight;
	private double max;
	private double min;

	public HumanBeings(String name, double height, double weight, double max, double min) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.max = max;
		this.min = min;
	}

	public String getName() {//name,height,weightのゲッターをスーパークラスにまとめる
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public double getMAX() {
		return max;
	}

	public double getMIN() {
		return min;
	}
}

class Human extends HumanBeings{//継承
//	public static final double MAX = 25.0;
//	public static final double MIN = 18.5;

	public Human(String name, double height, double weight){
		super(name, height, weight, 25.0, 18.5);
	}

//	public double getMAX() {
//		return MAX;
//	}
//
//	public double getMIN() {
//		return MIN;
//	}
}

class Child extends HumanBeings{//継承
//	public static final double MAX = 18.0;
//	public static final double MIN = 15.0;

	public Child(String name, double height, double weight){
		super(name, height, weight, 18.0, 15.0);
	}

//	public double getMAX() {
//		return MAX;
//	}
//
//	public double getMIN() {
//		return MIN;
//	}
}

class BMI{
	public static double calc(HumanBeings hb) {//Human,Childそれぞれで定義していたものをスーパークラスをつかって一つにまとめる
		//BMI = 体重/身長/身長
		return hb.getWeight() / hb.getHeight() / hb.getHeight();
	}

	public static String judge(HumanBeings hb) {
		double bmi = calc(hb);
		if(hb.getMAX() < bmi) {
			return "太りすぎです";
		}else if(hb.getMIN() < bmi) {
			return "標準です";
		}else {
			return "痩せすぎです";
		}
	}
}

public class Main02 {
	public static void main(String[] args) {
		HumanBeings hb1 = new Human("kato", 1.77, 69.5);//暗黙的型変換(Human)
		System.out.println("----- BMI -----");
		System.out.println(hb1.getName() + "さんのBMIは" + BMI.calc(hb1));
		System.out.println(BMI.judge(hb1));
		System.out.println("---------------");

		System.out.println();

		HumanBeings hb2 = new Child("taro", 1.77, 69.5);//暗黙的型変換(Child)
		System.out.println("----- BMI -----");
		System.out.println(hb2.getName() + "ちゃんのBMIは" + BMI.calc(hb2));
		System.out.println(BMI.judge(hb2));
		System.out.println("---------------");
	}
}