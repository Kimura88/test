package question;

public class Mondai11{
	public static void main(String[] args) {
		String[] a = {"5", "23", "a", "89", "b", "c"};
		Mondai11 obj = new Mondai11();
		int[] b = obj.makeArray1(a);


		for(int i : b) {
			System.out.println(i);
		}
		System.out.println();
	}

	int[] makeArray1(String[] a) {
		int[] b = new int[a.length];
		for(int i = 0; i < a.length; i++){
			try {
				b[i] = Integer.parseInt(a[i]);
			}catch(NumberFormatException e) {
			}
		}
		return b;
	}

	int[] makeArray2(String[] a) {
		int[] b = new int[a.length];
		try {
			for(int i = 0; i < a.length; i++) {
				b[i] = Integer.parseInt(a[i]);
			}
		}catch(NumberFormatException e) {
		}
		return b;
	}

	int[] makeArray3(String[] a) {
		int[] b = new int[a.length];
		try {
			for(int i = 0; i < a.length; i++) {
				b[i] = Integer.parseInt(a[i]);
			}
			return b;
		}catch(NumberFormatException e) {
			return new int[a.length];
		}
	}
}