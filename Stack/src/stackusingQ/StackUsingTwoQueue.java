package stackusingQ;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {
	
	Queue<Integer> q1 = new LinkedList<>();
	Queue<Integer> q2 = new LinkedList<>();
	
	public void push(int data) {
		
		while(!q1.isEmpty()) {
			q2.add(q1.remove());
		}
		q1.add(data);
		while(!q2.isEmpty()) {
			q1.add(q2.remove());
		}
		
	}
	public int pop() {
		if(!q1.isEmpty()) 
			return q1.remove();
		return -999;
		
	}
}
