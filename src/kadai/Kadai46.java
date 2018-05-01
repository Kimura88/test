package kadai;

import java.util.Scanner;

public class Kadai46 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//人数を読み込む
		System.out.print("人数 : ");
		int num = scn.nextInt();
		System.out.println("点数を入力せよ。");

		int x[] = new int[num];

		double sum = 0;

		double ave = 0.0;

		int max = 0;

		int min = 100;

		//点数のループ
		for(int i = 0; i < num; i++) {
			System.out.print((i + 1) + "番の点数 : ");
			x[i] = scn.nextInt();

			sum = sum + x[i];

//			ave = sum / num;

			if(max < x[i]) {
				max = x[i];
			}

			if(min > x[i]) {
				min = x[i];
			}
		}
		ave = sum / num;
		System.out.println("合計点は" + sum + "点です。");//(double)をsumの前につけるとsumの数値がdoubleになる
		System.out.println("平均点は" + ave + "点です。");
		System.out.println("最高点は" + max + "点です。");
		System.out.println("最低点は" + min + "点です。");

		scn.close();
	}
}

