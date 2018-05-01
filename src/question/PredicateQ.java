package question;

import java.util.function.Predicate;

public class PredicateQ {
	public static void main(String[] args) {
		PredicateImpl p1 = new PredicateImpl() ;
		System.out.println(p1.test("hogehogepiyopiyo"));

		Predicate<String> p2 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length() >= 10;
			}

		};
		System.out.println(p2.test("hogehogepiyopiyo"));

		Predicate<String> p3 = (String t) -> {
			return t.length() >= 10;
		};
		System.out.println(p3.test("hogehogepiyopiyo"));
	}
}

class PredicateImpl implements Predicate<String>{

	@Override
	public boolean test(String t) {
		return t.length() >= 10;
	}

}