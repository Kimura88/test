package kadai;

import java.util.Scanner;

public class Kadai57 {
	public static void main(String[] args) {
		//入力を受け取る
		//signOfメソッドを実行
		//実行結果の出力
		//if書かない
		Scanner scn = new Scanner(System.in);//Scannerのインスタンス化
		Test57 t = new Test57();

		System.out.print("整数x : ");

		int result = t.signOf(scn.nextInt());
		System.out.println("signOf(x)は" + result + "です。");

		scn.close();
	}
}

class Test57{
	//signOfメソッドを作る
	//sysout入れない

	int signOf(int n) {

		if(n == 0) {
			n = 0;
		}else if(n < 0) {
			n = -1;
		}else {
			n = 1;
		}
		return n;
	}
}
