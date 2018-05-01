package tsd;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample4_5 {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		String st1 = "ready";
		String st2 = "set";
		String st3 = "go";

		myList.add(st1);
		myList.add(st2);
		myList.add(st3);

		//①通常for文
//		for(int i = 0; i < myList.size(); i++) {
//			String st = myList.get(i);
//			System.out.println(st);
//		}

		//②拡張for文
//		for(Strng st : myList) {
//			System.out.println(st);
//		}

		//③Iteratorクラス(反復子）
		String st = null;
		Iterator<String> itr = myList.iterator();
		while(itr.hasNext()) {//hasnext()　次があるかどうか教えてくれる
			st = itr.next();//next()　次の要素に進む
			System.out.println(st);
		}
	}
}
