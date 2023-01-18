package sll;

import java.util.Stack;

public class LinkedList {
	private Node head;

	public LinkedList() {
		head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null)
			return false;
		// if ll is empty
		if (head == null) {
			head = newNode;
			return true;
		}
		// insert at last
		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(newNode);
		return true;
	}

	public void display() {
		Node last = head;
		while (last != null) {
			System.out.print(last.getData() + " ");
			last = last.getNext();
		}
		System.out.println();
	}

	// insert by position
	public boolean insertByPos(int position, int data) {
		// to check position is valid or not
		if (position <= 0 || (head == null && position > 1))
			return false;

		Node newNode = new Node(data);
		// check nn is created or not
		if (newNode == null)
			return false;

		// if position ==1
		if (position == 1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}
		// insert at position except 1
		Node prev = head;
		// to get position previous node
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			// to check if position is grater than size of list then return false
			if (prev == null) {
				System.out.println("invalid position");
				return false;
			}
		}
		// locate the required node
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
	}

	// delete by position
	public boolean deleteByPosition(int position) {
		if (position <= 0 || (head == null))
			return false;
		if (position == 1) {
			head = head.getNext();
			return true;
		}
		// pos other than 1
		Node prev = head;
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev.getNext() == null) {
				// deletable node not found
				System.out.println("Invalid position");
				return false;
			}
		}
		Node del = prev.getNext();
		prev.setNext(del.getNext());
		return true;
	}

	// delete by value
	public boolean deleteByValue(int data) {
		if (head == null)
			return false;
		// if head contains given data i.e delete the first node
		if (head.getData() == data) {
			// just shift the head
			head = head.getNext();
			return true;
		}
		// delete other than first node

		Node prev = head;
		Node del = head;
		// moving del and prev is one before del
		while (del.getData() != data) {
			prev = del;
			del = del.getNext();
			if (prev.getNext() == null) {
				System.out.println("value not found");
				return false;
			}
		}
		prev.setNext(del.getNext());
		return true;
	}

	// using stack
	public void displayRev() {
		Stack<Node> stack = new Stack<Node>();
		Node temp = head;
		// pushing node
		while (temp != null) {
			stack.push(temp);
			temp = temp.getNext();
		}
		// pop out nodes and print data
		while (!(stack.isEmpty())) {
			System.out.print(stack.pop().getData() + " ");
		}
		System.out.println();
	}

	// With recursion
	public void displayRev(Node head) {
		if (head == null)
			return;
		displayRev(head.getNext());
		System.out.print(head.getData() + " ");
	}

	// searching any element
	public boolean searchElemnt(int data) {
		Node temp = head;
		if (head == null)
			return false;
		while (temp != null) {
			if (temp.getData() == data) {
				System.out.println("data found");
				return true;
			}
			temp = temp.getNext();
		}
		System.out.println("data not found");
		return false;
	}

	public void deleteAlternate(int position) {
		Node prev = head;
		Node del = head;
		if (position == 1) {
			head = head.getNext();
			prev = head;
			del = prev.getNext();
		}
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
		}
		del = prev.getNext();
		while (del != null) {
			prev.setNext(del.getNext());
			if (del.getNext() == null)
				return;
			del = del.getNext().getNext();
			prev = prev.getNext();
		}
	}

	public void sortDescend() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.getNext();
		}
		temp = head;
		int arr[] = new int[count];
		// while (temp != null) {
		for (int i = 0; i < count; i++) {
			arr[i] = temp.getData();
			temp = temp.getNext();
		}
		// }
		int temp1 = 0;
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (arr[i] < arr[j]) {
					temp1 = arr[i];
					arr[i] = arr[j];
					arr[j] = temp1;
				}
			}
		}
//		for (int i = 0; i < count; i++) {
//			System.out.print(arr[i] + " ");
//		}
		for(int n:arr)
		{
			System.out.print(n+" ");
		}
	}

	public void findMiddle() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.getNext();
		}
		if(count == 0)
			return;
		// if count is even
		temp = head;
		if (count % 2 == 0) {
			for (int i = 1; i < count / 2; i++) {
				temp = temp.getNext();
				if (temp == null)
					return;
			}
			System.out.println("middle elements:" + temp.getData() + " " + temp.getNext().getData() + "");
		} else {
			for (int i = 1; i < (count + 1) / 2; i++) {
				temp = temp.getNext();
				if (temp == null)
					return;
			}
			System.out.println("middle elements:" + temp.getData() + " ");
		}
		System.out.println();
	}

	// to check palindrome or not
	public void checkPalindrome() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.getNext();
		}
		
		int arr[] = new int[count];
		temp = head;
		for (int i = 0; i < count; i++) {
			arr[i] = temp.getData();
			temp = temp.getNext();
		}
//		for (int i = 0; i < count; i++) {
//			System.out.print(arr[i] + " ");
//		}	
		
		for (int i = 0; i <= arr.length - 1; i++) 
		{
			if (arr[i] != arr[count-1]) {
				System.out.println("not palindrome");				
				return;
			}
			--count;			
		}
		System.out.println("palindrome");

	}

}
