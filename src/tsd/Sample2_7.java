package tsd;

public class Sample2_7 {
	public static void main(String[] args) {
		int a = 10;
		int b =2;

		System.out.println("a + b = " + a + b);
//		System.out.println("a - b = " + （a - b)）;//コンパイルエラー
		System.out.println("a * b = " + a * b);//優先順位で掛け算が先にされる
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
		System.out.println("-a    = " + -a);

	}
}
