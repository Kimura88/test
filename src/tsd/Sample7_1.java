package tsd;

public class Sample7_1 {
	public static void main(String[] args) {
		int x = 15;
		int y = 0;
		try {
			System.out.println("x / y :" + x / y);//ArithmeticExceptionが発生
			System.out.println("2 * y :" + x * y);//実行されない
		}catch(ArithmeticException ae) {
			System.out.println("発生した例外 : " + ae);
		}
		System.out.println("x - y : " + (x - y));//try-catch 範囲外なので実行
	}
}
