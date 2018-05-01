package kadai;

import java.util.Scanner;

public class Kadai19 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		System.out.print("整数A : " );
		int b = scn.nextInt();
		System.out.print("整数B : " );
		
		if(a >= b) {
			while(a >= b) {
				System.out.print(b + " ");
				b++;
			}
		}else {
			while(b >= a) {
				System.out.print(a + " ");
				b++;
			}
		scn.close();
		}
	}
}


