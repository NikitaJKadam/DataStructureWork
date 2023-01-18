package stack;

public class StackGeneric<T> {
	private T arr[];
	private int top;
	private int size;
	
	public StackGeneric()
	{
		size=10;
		arr= (T[]) new Object[size];
		top=-1;		
	}
		
	public StackGeneric(int size)
	{
		this.size=size;
		arr= (T[]) new Object[size];
		top=-1;		
	}
			
	public boolean isEmpty()
	{
		return top== -1;
	}
	public boolean isFull()
	{
		return top == size-1;
	}
	
	public void push(T data)
	{
		if(!isFull())
		{
			top=top+1;
			arr[top]=data;
			return;			
		}
		else
		{ 
			System.out.println("Stack is full");
		}
	}
	public T pop()
	{
		if(!isEmpty())
		{
			T temp=arr[top];
			top=top-1;
			return temp;
		}
		else {
			System.out.println("stack is empty");
			return null;
		}
	}
	

}
