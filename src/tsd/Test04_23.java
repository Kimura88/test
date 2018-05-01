package tsd;

public class Test04_23 {

	public static void main(String[] args) {
		int x = 10;
		Test04_23 t = new Test04_23();
		
		t.testMethod(new Int(){
			@Override
			public void method(String s) {
				System.out.println(s);
			}
		});
	}
	
	void testMethod(Int i) {
		System.out.println("testMethod");
		i.method("hello");
	}
}

interface Int{
	public void method(String s);
}