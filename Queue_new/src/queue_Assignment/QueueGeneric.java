package queue_Assignment;

import customException.CustomHandlingException;

public class QueueGeneric<T> {
	private T [] arr;
	private int front=-1,rear=-1;
	
	public QueueGeneric() {
		arr =(T[]) new Object[5];
		front =-1;
		rear=-1;
	}
	public QueueGeneric(int size) {
		arr =(T[]) new Object[5];
		front =-1;
		rear=-1;
	}
	public void enqueue(T data) throws CustomHandlingException {
		if(isFull() == false) {
			rear = rear+1;
			arr[rear] = data;
			// check front == -1
			if(front == -1) {
				front =0;
			}
			//System.out.println("Enqueue"+data+" front "+front+" rear"+ rear);
		}
		else {			
			throw new CustomHandlingException("Queue is full");
		}
			
	}
	public T dequeue() throws CustomHandlingException {
		if( isEmpty() == false) {
			T temp = arr[front];
			front = front +1;
			//System.out.println("Dequeue"+temp+" front "+front+" rear"+ rear);
			return temp;
		}
		else {				
			//System.out.println("q is empty");
			throw new CustomHandlingException("Queue is empty");		
		}
	}
	
	public boolean isFull() {
		if( rear == (arr.length -1)) {			
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isEmpty() {
		if((front == -1) || (front > rear)) {
			return true;
		}
		else
			return false;
	}
}
