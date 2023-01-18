package simpleQueque;

import CustomException.customHandlingException;

public class Quque {
	private int []arr;
	private int front;
	private int rear;
	private int size;

	public Quque()
	{
		arr=new int[10];
		front=-1;
		rear=-1;
	}
	public Quque(int size)
	{
		arr=new int[size];
		front=-1;
		rear=-1;
	}
	//is full checking
	public boolean isFull()
	{
		return (rear==arr.length-1);
	}
	public boolean isEmpty()
	{
		if((front == -1) || (front > rear))
			return true;
		else
			return false;
	}
	public void enquque(int data) throws customHandlingException
	{
		if(isFull()==false)
		{
			rear=rear+1;
			arr[rear]=data;			
			if(front==-1)
				front=0;
		}
		else
		{
			throw new customHandlingException("Quque is full");
		}
	}
	public int dequque() throws customHandlingException
	{
		if(isEmpty()==false)
		{
			int temp=arr[front];
			front=front+1;			
			return temp;
		}
		else
		{
			throw new customHandlingException("quque is empty!!!");
		}
	}
	public void display()
	{
		for(int i=front; i<=rear;i++)
		{
			System.out.print(arr[i]+" ");
		}
//		for(int n:arr)
//			System.out.print(n+" ");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

