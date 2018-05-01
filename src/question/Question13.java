package question;

public class Question13 {

	public static void main(String[] args) {
		System.out.println(new SummaryImpl().exec(10, 5));

		System.out.println(new Summary() {
			@Override
			public int exec(int a, int b) {
				return a + b;
			}}.exec(10,5));

		Summary s = (int a, int b) -> {
			return a + b;
		};
		System.out.println(s.exec(10, 5));
	}

}

interface Summary{
	public int exec(int a, int b);
}

class SummaryImpl implements Summary{

	@Override
	public int exec(int a, int b) {
		return a + b;
	}

}