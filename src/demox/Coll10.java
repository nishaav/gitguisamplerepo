package demox;

import java.util.PriorityQueue;

public class Coll10 {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("Srikanth");
		pq.add("Dhanesh");
		pq.add("Aditya");
		pq.add("Syamala");
		pq.add("Pratik");
		pq.add("Rahul");
		System.out.println(pq);
		System.out.println(pq.element());//top of the queue
		System.out.println(pq.isEmpty());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.offer("Rahul"));
		System.out.println(pq);
		System.out.println(pq.size());
		pq.clear();
		System.out.println(pq);
		

	}

}
