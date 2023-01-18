package simpleQueque;

import CustomException.customHandlingException;

public class TestGenricQue {

	public static void main(String[] args) {
		QueGenric<Emp>q=new QueGenric<Emp>();
		try {
			q.enquque(new Emp(1, "nikita"));
			q.enquque(new Emp(2, "sanket"));
			q.enquque(new Emp(3, "vaish"));
			q.display();
			System.out.println("deque");
			System.out.println(q.dequque());
			System.out.println(q.dequque());
			System.out.println(q.dequque());
			System.out.println(q.dequque());
			
			
			
		} catch (customHandlingException e) {			
			e.printStackTrace();
		}
	}

}
