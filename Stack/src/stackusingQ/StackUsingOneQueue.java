package stackusingQ;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {
	
	Queue<Integer> q = new LinkedList<>();
	
	public void push(int data) {
		
		int s=q.size();
		q.add(data);
		for(int i =0 ;i<s;i++) {
			q.add(q.remove());
		}
	}
	public int pop() {
		if(!q.isEmpty())
			return q.remove();
		return -9999;
	}
}
