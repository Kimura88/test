package kadai;

public class Kadai03 {
	public static void main(String[] args) {
		int a  = -10;
		if(a % 5 == 0) {
			System.out.println("その値は5で割り切れます。");
		}else if(a < 0) {
			System.out.println("正でない値が入力されました。");//最初に持ってくる　-10で割り切れてしまう
		}else {
			System.out.println("その値は5で割り切れません。");
		}
	}

}
