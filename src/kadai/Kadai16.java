package kadai;

import java.util.Scanner;

public class Kadai16 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int y = 1;

		while(y == 1) {
			System.out.print("整数値 : ");
			int x = scn. nextInt();
			if(x == 0) {
				System.out.println("その値は0です。");
			}else if(x > 0) {
				System.out.println("その値は正です。");
			}else {
				System.out.println("その値は負です。");
			}
			System.out.print("もう一度? 1…Yes / 0…No : ");
			y = scn. nextInt();
        }
		scn.close();
	}
}
