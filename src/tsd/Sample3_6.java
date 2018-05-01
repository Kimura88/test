package tsd;

public class Sample3_6 {
	public static void main(String[] args) {

		for(int x = 1 ; x <= 10 ; x++) {
			System.out.print(x);
		}

		System.out.println(); //改行するだけ

		int y = 1;//初期化はループ外でもいい
		for(;  y<=10 ; y++) {
			System.out.print(y);
		}

	}
}