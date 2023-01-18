package stack;

public class DStack {
	private int arr[];
	private int top1,top2;
	private int size;
	
	public DStack(int size)
	{
		this.size=size;
		arr=new int[size];
		top1=(size/2)+1;
		top2=size/2;		
	}
	//stack1
	public void push1(int data)
	{
		if(top1 > 0)
		{
			top1=top1-1;
			arr[top1]=data;
			return;
		}
		else
		{
			System.out.println("stack is full");
		}
	}
	public int pop1()
	{
		if(top1 <= size/2)
		{
			int temp=arr[top1];
			top1=top1+1;			
			return temp;					
		}
		else
		{
			System.out.println("stack1 is empty");
			return -1;
		}
	}

	//stack2
	public void push2(int data)
	{
		if(top2 < size-1)
		{
			top2=top2+1;
			arr[top2]=data;
			return;		
		}
		else
		{
			System.out.println("stack is full");
		}
	}
	public int pop2()
	{
		if(top2 >= (size/2)+1)
		{
			int temp=arr[top2];
			top2=top2-1;			
			return temp;					
		}
		else
		{
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
