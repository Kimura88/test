
public class Class01 {
	public static void main(String[] args) {
//		Test2 t1 = new Test2;
//		t1.method(100);
//		Test2 t2 = new Test2;
//		t2.method(200);

	}
}


class Test2{
	int x;

	void method(int a) {
		System.out.println("method called");
		method2(a);
	}
	void method2(int b) {
		System.out.println("method2 called");
		 x =b;
	}

}