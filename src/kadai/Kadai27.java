package kadai;

public class Kadai27 {
	public static void main(String[] args) {

		int x = 20;//入力値

		//System.out.print("1+2+3+4+5+6+7=");
		//↓
		//System.out.print("1+");
//		System.out.print("2+");
//		System.out.print("3+");
//		System.out.print("4+");
//		System.out.print("5+");
//		System.out.print("6+");
//		System.out.print("7=");
//		↓

		int sum = 0;
		for(int i = 1; i<= x; i++) {
			sum = sum + i;

			if(i < x) {//1～6まで
				System.out.print(i + " +");
			}else {//7の時
				System.out.print(i + " = ");
			}
		}
		System.out.print(sum);
	}
}
