package simpleQueque;

import CustomException.customHandlingException;

public class TestQuque {

	public static void main(String[] args) {
		Quque q=new Quque();
		try {
			q.enquque(20);
			q.enquque(50);
			q.enquque(70);
			q.enquque(80);
			q.enquque(100);
			q.enquque(120);
			q.enquque(90);
			q.enquque(30);
			q.display();
			System.out.println("Inserting into queque");
			System.out.println(q.dequque());
			System.out.println(q.dequque());
			System.out.println(q.dequque());
			System.out.println(q.dequque());
			System.out.println(q.dequque());
			System.out.println(q.dequque());
			System.out.println(q.dequque());
			System.out.println(q.dequque());
			System.out.println(q.dequque());
			
			
		} catch (customHandlingException e) {			
			e.printStackTrace();
		}

	}

}
