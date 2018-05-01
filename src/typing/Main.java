package typing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scn = new Scanner(System.in);
		File inputFile = new File("\\\\192.168.3.62\\public\\研修資料\\data.txt");
		BufferedReader in = null;

		ArrayList<String> array1 = new ArrayList<>();

		try {
			//問題を読み込む
			in = new BufferedReader(new FileReader(inputFile));

			String line;
			while((line = in.readLine()) != null) {
				array1.add(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
			throw new FileNotFoundException("ファイルがありません");

		}finally {
			try {
				if(in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("タイピングゲームを開始します。");
		System.out.println("何かキーを入力してください：");
		System.out.println();

		//5問連続で表示
		for(int i = 0; i < 5; i++) {
			System.out.println("*************第" + (i + 1) + "問*************");

			//ランダムで数字を生成
			int idx = new Random().nextInt(array1.size());

			//ArrayListから要素を一つ取り出す
			String str = array1.get(idx);

			//1行目に漢字の問題、２行目に漢字変換されていない問題を表示
			String line1 = str.split(",")[0];
			String line2 = str.split(",")[1];

			System.out.println(line1);
			System.out.println(line2);
			System.out.println();

			//ユーザーの入力を受け付けて
			//入力と表示した問題が同じかどうかを判定する


			while(true) {
				System.out.println("【入力してください】");
				String str2 = scn.nextLine();
				System.out.println();

				if(line2.equals(str2)) {
					System.out.println("正解です。");
					//正解の場合次の問題
					break;
				}else {
					System.out.println("不正解です。");
					//不正解の場合同じ問題
					//入力してくださいを表示している場所まで戻る
				}

			}

			//5問連続で表示し、表示する問題は同じデータを2回出さない
			array1.remove(idx);

		}
		scn.close();
		System.out.println("**************************");
		System.out.println("終了しました。おつかれさまでした。");
	}

}

