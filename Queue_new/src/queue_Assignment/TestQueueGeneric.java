package queue_Assignment;

import customException.CustomHandlingException;

public class TestQueueGeneric {

	public static void main(String[] args) {
		
		QueueGeneric<Employee>q=new QueueGeneric<Employee>();
		try {
			q.enqueue(new Employee(229229,"Vaishnavi"));
			q.enqueue(new Employee(229176,"Nikita"));
			q.enqueue(new Employee(229200,"Sakshi"));
			q.enqueue(new Employee(229210,"Shraddha"));
			q.enqueue(new Employee(229225,"Swara"));
			
			System.out.println("Dequeue:"+q.dequeue());
			System.out.println("Dequeue:"+q.dequeue());
			System.out.println("Dequeue:"+q.dequeue());
			System.out.println("Dequeue:"+q.dequeue());	
			
			
		} catch (CustomHandlingException e) {			
			e.printStackTrace();
		}
	}

}
