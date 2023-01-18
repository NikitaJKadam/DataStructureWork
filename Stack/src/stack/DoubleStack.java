package stack;

public class DoubleStack {
	private int[] arr;
	private int size;
	private int top1, top2;

	public DoubleStack(int size) {
		this.size = size;
		arr = new int[size];
		top1 = ((size / 2) + 1);
		top2 = size / 2;
	}

	// stack 1----top 1----push1()----pop1()

	public void push1(int data) {
		if (top1 > 0) {
			top1 = top1 - 1;
			arr[top1] = data;
			return;
		} else {
			System.out.println("Stack is full");
		}
	}

	public int pop1() {
		if (top1 <= size / 2) {
			int data = arr[top1];
			top1 = top1 + 1;
			return data;
		} else {
			System.out.println("Stack is empty");
			return -999;
		}
	}
	
	// stack 2----top 2-----push2()----pop2()
	public void push2(int data) {
		if (top2 < size - 1)
			top2 = top2 + 1;
		arr[top2] = data;
	}

	public int pop2() {
		if (top2 >= size / 2 + 1) {
			int data = arr[top2];
			top2 = top2 - 1;
			return data;
		}
		return -999;
	}
}



