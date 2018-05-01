package kadai;

import java.util.Scanner;

public class Kadai20 {
	public static void main(String[] aargs) {
		Scanner scn = new Scanner (System.in);

		System.out.println("カウントダウンします。");
		System.out.print("正の整数値 : ");
		int x = scn.nextInt();
		scn.close();

		while(x >= 0) {
			System.out.println(x);
			x--;
		}
	}
}
