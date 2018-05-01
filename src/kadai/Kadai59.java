package kadai;

import java.util.Scanner;

public class Kadai59 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("整数a : ");
		int a = scn.nextInt();
		System.out.print("整数b : ");
		int b = scn.nextInt();
		System.out.print("整数c : ");
		int c = scn.nextInt();
		scn.close();

		Test59 t = new Test59();

		System.out.println("中央値は" + t.med(a, b, c) + "です。");
	}
}

class Test59{
	int med(int a, int b, int c ) {
		int med = b;
		if((a >= c && a <= b)||(a >= b && a <= c)) {
			med = a;
		}else if((c >= b && c <= a)||(c >= a && c <= b)){
			med = c;
		}
		return med;
	}
}