package stackusingQ;

public class Tester {

	public static void main(String[] args) {
//		StackUsingTwoQueue stk = new StackUsingTwoQueue();
//		stk.push(10);
//		stk.push(20);
//		stk.push(30);
//		stk.push(40);
//		System.out.println(stk.pop());
		
       StackUsingOneQueue stk1 = new StackUsingOneQueue();
       stk1.push(50);
       stk1.push(60);
       stk1.push(70);
       System.out.println(stk1.pop());
       System.out.println(stk1.pop());
       System.out.println(stk1.pop());
	}

}
