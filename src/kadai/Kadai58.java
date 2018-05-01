package kadai;

import java.util.Scanner;

public class Kadai58 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("整数a : ");
		int a = scn.nextInt();
		System.out.print("整数b : ");
		int b = scn.nextInt();
		System.out.print("整数c : ");
		int c = scn.nextInt();

		Test58 t = new Test58();

		int result = t.min(a, b, c);
		System.out.println("最小値は" + result + "です。");

		scn.close();
	}
}

class Test58{
	int min(int a, int b, int c) {
		int min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		return min;
	}
}