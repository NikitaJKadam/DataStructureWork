package circularQueue;

import CustomException.customHandlingException;

public class testCircularQue {

	public static void main(String[] args) {
		CircularQueue cq=new CircularQueue();
		try {
			cq.enqueue(20);
			cq.enqueue(40);
			cq.enqueue(70);
			cq.enqueue(80);
			cq.enqueue(90);
			cq.enqueue(60);
			cq.display();
			System.out.println(cq.dequeue());
			System.out.println(cq.dequeue());
			System.out.println(cq.dequeue());
			System.out.println(cq.dequeue());
			System.out.println(cq.dequeue());
			System.out.println(cq.dequeue());
			
			
		} catch (customHandlingException e) {			
			e.printStackTrace();
		}

	}

}
