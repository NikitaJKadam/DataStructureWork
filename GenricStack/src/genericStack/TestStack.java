package genericStack;

import custom_exception.CustomHandlingException;

public class TestStack {

	public static void main(String[] args) {
		GStack<Integer> stack=new GStack<Integer>();
		try {
			//inserting elements
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
			stack.push(50);
			stack.push(60);
			stack.push(70);
			//poping the elements
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());			
			
		} catch (CustomHandlingException e) {			
			e.printStackTrace();
		}
	}
}
