package tsd;

class Animal{
	private String name;
	private String voice;

	public Animal() {
		System.out.println("動物を登録しました。");
	}
	public void setAnimal(String n, String v) {
		name = n;
		voice = v;
	}
	public void showAnimal() {
		System.out.println("名前は" + name + "で" + voice + "と鳴きます。");
	}
}

class Dogs extends Animal{
	public Dogs(){
		//スーパークラスのコンストラクタを呼び出す
		System.out.println("犬が登録されました。");
	}
}

public class Sample6_1 {
	public static void main(String[] args) {
		Dogs d1 = new Dogs();
		d1.setAnimal("クッキー", "わんわん");
		d1.showAnimal();
	}
}
