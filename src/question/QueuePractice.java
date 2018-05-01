package question;

import java.util.PriorityQueue;

public class QueuePractice {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq1 = new PriorityQueue<>();

		pq1.add(20);
		pq1.add(30);
		pq1.add(10);

		System.out.println(pq1.poll());
		System.out.println(pq1.poll());
		System.out.println(pq1.poll());

		System.out.println(pq1.poll());

//		System.out.println("---");

//		PriorityQueue<Integer> pq2 = new PriorityQueue<>(3, new MyComparator());
//
//		pq2.add(20);
//		pq2.add(30);
//		pq2.add(10);
//
//		System.out.println(pq2.poll());
//		System.out.println(pq2.poll());
//		System.out.println(pq2.poll());
	}
}

//class MyComparator implements Comparator{
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		int x = (int) o1;
//		int y = (int) o2;
//
//		if(x < y) {
//			return 1;
//		}else if(x > y) {
//			return -1;
//		}else {
//			return 0;
//		}
//	}
//}

//実行結果
//10
//20
//30
//null
//---
//30
//20
//10