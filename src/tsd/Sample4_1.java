package tsd;

public class Sample4_1 {
	public static void main(String[] args) {

	int[] iar = new int[5];

	iar[0] = 12;
	iar[1] = 3;
	iar[2] = 28;
	iar[3] = 427;
	iar[4] = 33;

	System.out.println("iarの値は " + iar[0] + "です。");
	System.out.println("iarの値は " + iar[1] + "です。");
	System.out.println("iarの値は " + iar[2] + "です。");

	String[] sar = { "One" , "Two" , "Three" };

	System.out.println("iarの値は " + sar[0] + "です。");
	System.out.println("iarの値は " + sar[1] + "です。");
	System.out.println("iarの値は " + sar[2] + "です。");
	int len = sar.length;
	System.out.println("配列sarの要素の数は " + len + "です。");
	}
}