package DLL;

public class TestDLL {

	public static void main(String[] args) {
		DoublyLL dll=new DoublyLL();
		dll.insertByValue(65);
		dll.insertByValue(90);
		dll.insertByValue(80);
		dll.insertByValue(65);
		dll.insertByValue(70);
		dll.insertByValue(60);
		dll.insertByValue(50);
		dll.display();
		dll.insertByPosition(25, 0);//invalid position				
		dll.insertByPosition(35, 3);
		dll.insertByValue(50);
		dll.display();
		dll.insertByPosition(45, 5);
		dll.insertByValue(50);
		dll.display();
		dll.insertByPosition(55, 2);
		dll.insertByPosition(65, 3);		
		dll.display();
		dll.deleteByPos(2);
		dll.display();
		dll.deleteByValue(50);
		dll.display();
		dll.deleteByValue(65);
		dll.display();
		
	}

}
