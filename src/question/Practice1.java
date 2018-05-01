package question;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Kuraberu k = new Kuraberu();

		Scanner scn = new Scanner(System.in);
		System.out.print("属性値 a : ");
		k.a = scn.nextInt();
		System.out.print("属性値 b : ");
		k.b = scn.nextInt();

		System.out.println("大きいほうの値は" + k.getBigger());
		System.out.println("小さなほうの値は" + k.getSmaller());

		scn.close();
	}
}

class Kuraberu{
	int a;
	int b;

	int getBigger() {
		if(a < b) {
			return b;
		}else {
			return a;
		}
	}

	int getSmaller() {
		if(b < a) {
			return b;
		}else {
		return a;
		}
	}
}
