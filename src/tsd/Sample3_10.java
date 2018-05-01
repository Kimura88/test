package tsd;

public class Sample3_10 {
	public static void main(String[] args) {
		for(int i = 0;; i++) {//真ん中をi < 3にする
			if(i == 3) {
				break;
			}
			System.out.println("i =  " + i);
		}
		System.out.println("for文の後の処理" );
	}
}
