package DLL;

public class DoublyLL {
	private Node head;

	public DoublyLL() {
		head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	// insert by value
	public boolean insertByValue(int data) {
		Node newNode = new Node(data);
		if (newNode == null)
			return false;
		if (head == null) {
			head = newNode;
			return true;
		}
		// to insert at last
		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(newNode);
		newNode.setPrev(last);
		return true;
	}

	// insert by position
	public boolean insertByPosition(int data, int pos) {
		// to check for invalid position
		if (pos <= 0 || (head == null && pos > 1)) {
			return false;
		}

		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}

		// if pos is one i.e insert at first
		if (pos == 1) {
			if (head != null) {
				newNode.setNext(head);
				head.setPrev(newNode);
			}
			head = newNode;
			return true;
		}

		// at pos>1
		Node prev = head;
		// to locate one before pos
		for (int i = 1; i < pos - 1; i++) {
			prev = prev.getNext();
			if (prev == null)
				return false;
		}
		// now at given pos
		newNode.setPrev(prev);
		if (prev.getNext() != null) {
			newNode.setNext(prev.getNext());
			prev.getNext().setPrev(newNode);
		}
		prev.setNext(newNode);
		return true;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	// delete by position
	public boolean deleteByPos(int pos) {
		if (head == null) {
			return false;
		}
		if (pos == 1) {
			head = head.getNext();
			// if head next is null then we cant set null prev to null
			if (head != null) {
				head.setPrev(null);
				return true;
			}
		}
		// pos>1
		Node del = head;
		for (int i = 1; i < pos; i++) {
			del = del.getNext();
			if (del == null)
				return false; // if invalid position
		}
		// locating del node
		del.getPrev().setNext(del.getNext());
		if (del.getNext() != null) {
			del.getNext().setPrev(del.getPrev());
		}
		return true;
	}

	// delete by value
	public boolean deleteByValue(int data) {
		if (head == null)
			return false;

		if (head.getData() == data) {
			head = head.getNext();
			if (head != null) {
				head.setPrev(null);
				return true;
			}
		}
		//to delete all occurances
		while (true) {
			Node del = head;
			while (del.getData() != data) {
				del = del.getNext();
				if (del == null) {
					// System.out.println("Data not found in dll");
					return false;// if data not found
				}
			}
			del.getPrev().setNext(del.getNext());
			if (del.getNext() != null) {
				del.getNext().setPrev(del.getPrev());
			}
		}
	}

}
