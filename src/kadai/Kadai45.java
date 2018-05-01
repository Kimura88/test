package kadai;

import java.util.Random;
import java.util.Scanner;

public class Kadai45 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("要素数 : ");
		int x = scn.nextInt();
		scn.close();

		int[] y = new int[x];

		System.out.println();

		for(int i = 0; i < y.length; i++) {
			y[i] = new Random().nextInt(10) + 1;
		}
		for(int j = 10; j > 0; j--) {
			for(int i = 0; i < y.length; i++) {
				if(j <= y[i]) {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
		}
		for(int i = 0; i < y.length; i++) {
			System.out.print("--");
		}
		System.out.println();
		for(int i = 0; i < y.length; i++) {
			System.out.print(i % 10 + " ");
		}
	}
}

