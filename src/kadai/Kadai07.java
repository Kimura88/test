package kadai;

public class Kadai07 {
	public static void main(String[] args) {
		int a = 33;
		int b = 25;

		System.out.println("それらの差は");

		if((a-b) <= 10) {
			System.out.println("10以下です。");
		}else if((a-b) >= 11) {
			System.out.println("11以上です。");
		}else if((b-a) <= 10) {
			System.out.println("10以下です。");
		}else if((b-a) >= 11) {
			System.out.println("11以上です。");
		}
	}
}
