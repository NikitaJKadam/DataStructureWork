package genericStack;

import custom_exception.CustomHandlingException;

public class GStack<T> {
	private T [] arr;
	private int size,top;
	
	@SuppressWarnings("unchecked")
	public GStack()
	{
		size=10;
		top=-1;
		arr=(T[]) new Object[size];
	}
	@SuppressWarnings("unchecked")
	public GStack(int size)
	{
		this.size=size;
		top=-1;
		arr=(T[]) new Object[size];
	}
	//is empty function
	public boolean isEmpty()
	{
		return top==-1;
	}
	//is Full function
	public boolean isFull()
	{
		return top==size-1;		
	}
	//to insert the element
	public boolean push(T data)throws CustomHandlingException
	{
		if(!isFull())
		{
			top=top+1;
			arr[top]=data;
			return true;
		}
		throw new CustomHandlingException("Stack is full!!!"); 
	}
	//to pop the element
	public T pop()throws CustomHandlingException
	{
		if(!isEmpty())
		{
			T temp=arr[top];
			top=top-1;
			return temp;
		}
		throw new CustomHandlingException("Stack is empty!!!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
