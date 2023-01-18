package circular_queue;
import java.util.Scanner;

import customException.CustomHandlingException;

public class TestMyProcessQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{		
		CircularQueueGeneric<MyProcess> cq=new CircularQueueGeneric<MyProcess>(5);
		System.out.println("--------Enqueue----------");
		cq.enqueue(new MyProcess(1, "process1", "owner1"));
		cq.enqueue(new MyProcess(1, "process2", "owner2"));
		cq.enqueue(new MyProcess(1, "process3", "owner3"));
		cq.enqueue(new MyProcess(1, "process4", "owner4"));
		cq.enqueue(new MyProcess(1, "process5", "owner5"));
		System.out.println("count : "+cq.count);
		
		System.out.println("--------Dequeue----------");
		
		System.out.println("Dequeue :"+ cq.dequeue());
		System.out.println("Dequeue :"+ cq.dequeue());
		System.out.println("Dequeue :"+ cq.dequeue());
		System.out.println("Dequeue :"+ cq.dequeue());
		System.out.println("Dequeue :"+ cq.dequeue());	
		System.out.println("count : "+cq.count);
		
		System.out.println("--------Again Enqueue----------");
		
		cq.enqueue(new MyProcess(1, "process6", "owner6"));
		cq.enqueue(new MyProcess(1, "process7", "owner7"));
		cq.enqueue(new MyProcess(1, "process8", "owner8"));
		cq.enqueue(new MyProcess(1, "process9", "owner9"));
		cq.enqueue(new MyProcess(1, "process10", "owner10"));
		System.out.println("count : "+cq.count);
		
		System.out.println("--------Again Dequeue----------");
		
		System.out.println("Dequeue :"+ cq.dequeue());
		System.out.println("Dequeue :"+ cq.dequeue());
		System.out.println("Dequeue :"+ cq.dequeue());
		System.out.println("Dequeue :"+ cq.dequeue());
		System.out.println("Dequeue :"+ cq.dequeue());	
		System.out.println("count : "+cq.count);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
