package kadai;

import java.util.ArrayList;
import java.util.Scanner;

public class Kadai46_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//人数を読み込む
		System.out.print("人数 : ");
		int num = scn.nextInt();
		System.out.println("点数を入力せよ。");

		ArrayList<Integer> x = new ArrayList<>();

		int sum = 0;

		int max = 0;

		int min = 100;


		for(int i = 0; i < num; i++) {
			System.out.print((i + 1 + "番目の点数 : "));
			x.add(scn.nextInt());
		}

		for(int i = 0; i < num; i++) {
			sum = sum + x.get(i);

			if(max < x.get(i)) {
				max = x.get(i);
			}

			if(min > x.get(i)) {
				min = x.get(i);
			}
		}

		System.out.println("合計点は" + (double)sum + "点です。");//(double)をsumの前につけるとsumの数値がdoubleになる
		System.out.println("平均点は" + (sum / num) + "点です。");
		System.out.println("最高点は" + max + "点です。");
		System.out.println("最低点は" + min + "点です。");

		scn.close();
	}
}


