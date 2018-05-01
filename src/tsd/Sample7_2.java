package tsd;

public class Sample7_2 {
	public static void main(String[] args) {
		int x = 15;
		int y = 0;
		try {
			System.out.println("x / y :" + x / y);//ArithmeticExceptionが発生
			System.out.println("x * y :" + x * y);//実行されない
		}catch(ArithmeticException e) {
//			System.out.println("発生した例外 : " + e);
			e.printStackTrace();
		}finally {
			System.out.println("finallyブロック。必ず実行されます。");
		}
		System.out.println("x - y : " + (x - y));
	}
}
