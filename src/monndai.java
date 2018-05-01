//abstract class AbsSuper{
//	public abstract void show();
//}
//class Sub extends AbsSuper{
//	void show() {
//		System.out.println("s");
//	}
//}

//class Parent{}
//class Child extends Parent{}
public class monndai {
//	public void check(Parent p) {
//		if(p instanceof Child)
//			System.out.println("Child");
//		else if(p instanceof Parent)
//			System.out.println("Parent");
//	}
	public static void main(String[] args) {
//		Parent p = new Child();
//		new monndai().check(p);

		String str1 = "12345";
		String str2 = "20.5";
		String str3 = "TRUE";

		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		boolean b = Boolean.parseBoolean(str3);
		System.out.println(i + " " + d + " " + b);

		String s1 = "h";
		String s2 = new String(s1);
		if(s1 == s2) {
			System.out.println("a");
		}else {
			System.out.println("b");
		}

//		byte x = 5;
//		int y = 6 * x++;
//		int z = x * y;
//		System.out.println(z);


	}
}

