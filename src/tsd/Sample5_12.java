package tsd;

class WorkAc{
	private int a;
	int b;
	public void met(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("a= " + this.a + " b= " + this.b);
	}
	public void show() {
		System.out.println("a= " + this.a + " b= " + this.b);
	}
}

class Sample5_12 {
	public static void main(String[] args) {
		WorkAc w1 = new WorkAc();

		System.out.println("--- aに3を代入、bに13を代入 ---");
		w1.met(3, 13);
//		w1.a = 2; コンパイルエラー
		System.out.println("--- bに４を代入 ---");
		w1.b = 4;//代入可能
		w1.show();
	}
}
