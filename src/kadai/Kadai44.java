package kadai;

import java.util.Scanner;

public class Kadai44 {
	public static void main(String[] args) {
		//①要素数を読み込む
		Scanner scn = new Scanner(System.in);

		System.out.print("要素数 : ");
		int count = scn.nextInt();

		int[] a = new int[count];

		for(int i = 0; i < count; i++) {
			System.out.print("a[" + i + "] = ");

			a[i] = scn.nextInt();
		}

		System.out.print("{");
		for(int i = 0; i < count; i++) {
			if(i < count - 1) {
				System.out.print(a[i] + ", ");
			}else {
				System.out.print(a[i]);
			}
		}
		System.out.print("}");
		scn.close();
	}
}