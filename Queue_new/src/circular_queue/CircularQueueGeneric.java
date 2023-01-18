package circular_queue;

import customException.CustomHandlingException;

public class CircularQueueGeneric<T> {
	public T [] arr;
	public int front, rear, count;
	public CircularQueueGeneric() {
		arr = (T[])new Object[5];
		front= rear=-1;
		count =0;
	}
	public CircularQueueGeneric(int size) {
		arr = (T[])new Object[size];
		front= rear=-1;
		count =0;
	}
	public void enqueue(T data) throws CustomHandlingException {
		if(isFull() == false) {
		rear = (rear+1) % arr.length;
		arr[rear] = data;
		if(front==-1) {
			front=0;
		}
		count = count +1;
		System.out.println("Enqueue "+data);
		}
		else {
			throw new CustomHandlingException("Queue is Full!!!!!");
		}
	}
	public T dequeue() throws CustomHandlingException {
		if(isEmpty() == false) {
			T temp = arr[front];
			front = (front + 1) % arr.length;
			count = count-1;
			return temp;
		}
		else {
			throw new CustomHandlingException("Queue is empty!!!!");
		}
	}
	public boolean isEmpty() {
		if(count == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isFull() {
		if(count == arr.length) {
			return true;
		}
		else {
			return false;
		}
	}
}
