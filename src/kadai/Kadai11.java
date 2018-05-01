package kadai;

import java.util.Random;

public class Kadai11{
	public static void main(String[] args) {
		int x = new Random().nextInt(3);
		switch(x) {
		case 0:
			x = 0;//指定する必要なし
			System.out.println("グー");
			break;
		case 1:
			x = 1;
			System.out.println("チョキ");
			break;
		default:
			x = 2;
			System.out.println("パー");
		}
	}
}
