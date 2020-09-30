package practice;

import java.util.PriorityQueue;

public class QueueCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=10; i>0; i--) {
			queue.add(i);
			System.out.println("The new item is:" + queue);
		}
			System.out.println(queue.peek());
			System.out.println("Queue size is:" + queue.size());
			
			queue.poll();
			System.out.println("Queue size after poll is:" + queue.size());
			
			System.out.println("The new head is:" + queue.peek());

			
	}

}
