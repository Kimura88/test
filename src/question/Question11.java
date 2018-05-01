package question;

public class Question11 {
	public static void main(String[] args) {
		String[] a = {"5", "23", "a", "89", "b", "c"};
		Question11 obj = new Question11();
		int [] b = obj.makeArray1(a);

		for(int i : b) {
			System.out.print(i);
		}

		System.out.println();

		int[] c = obj.makeArray2(a);
		for(int i : c) {
			System.out.print(i);
		}

		System.out.println();

		int[] d = obj.makeArray3(a);
		for(int i : d) {
			System.out.print(i);
		}
	}

	//戻り値：{5, 23, 0, 89, 0, 0}
	int[] makeArray1(String[] a) {
		int[] b = new int[a.length];

		//String配列のループ
		for (int i = 0; i < a.length; i++) {
			try {
				b[i] = Integer.parseInt(a[i]);//例外発生
			} catch (NumberFormatException e) {
//				b[i] = 0;　//初期値0だから代入不要
			}
		}
		return b;
	}

	//戻り値：array2 = {5, 23, 0, 0, 0, 0}
	int[] makeArray2(String[] a) {
		int[] c = new int[a.length];
//		int i = 0;
		try {
			for(int i = 0; i < a.length; i++) {
				c[i] = Integer.parseInt(a[i]);//例外発生
			}
		}catch(NumberFormatException e) {
//			c[i] = 0;
		}
		return c;
	}

	//戻り値：{0, 0, 0, 0, 0, 0}
	int[] makeArray3(String[] a) {
		int[] d = new int[a.length];
		try {
			for(int i = 0; i < a.length; i++) {
				d[i] = Integer.parseInt(a[i]);
			}
			return d;
		}catch(NumberFormatException e){
			return new int[a.length];
		}

		}
}