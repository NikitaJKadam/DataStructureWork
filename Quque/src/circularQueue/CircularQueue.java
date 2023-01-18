package circularQueue;

import CustomException.customHandlingException;

public class CircularQueue {
	private int arr[];
	private int front;
	private int rear;
	private int size;
	private int count;
	public CircularQueue()
	{
		arr=new int[10];
		front=-1;
		rear=-1;
		count=0;
	}
	public CircularQueue(int size)
	{
		arr=new int[size];
		front=-1;
		rear=-1;
		count=0;
	}
	//isfull checking
	public boolean isFull()
	{
		return (count==arr.length);
	}
	public boolean isEmpty()
	{
		return count==0;
	}
	//inserting the element
	public void enqueue(int data) throws customHandlingException
	{
		if(isFull()==false)
		{
			rear=(rear+1)%arr.length;//to circulate(move) in circle
			arr[rear]=data;
			count=count+1;
			if(front==-1)
				front=0;
		}		
		else
		{
			throw new customHandlingException("queue is full!!!");
		}
	}
	//removing the element from que
	public int dequeue() throws customHandlingException
	{
		if(!isEmpty())
		{
			int temp=arr[front];
			front=(front+1)%arr.length;
			count=count-1;
		    return temp;
		}
		else
			throw new customHandlingException("queue is empty");
	}
	public void display()
	{
		for(int i=front; i<=rear;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
