package GenericLL;

public class TestLL {

	public static void main(String[] args) {
		LinkedList<Emp> list= new LinkedList<Emp>();
		list.insert(new Emp(1, "nikita"));
		list.insert(new Emp(2, "vaish"));
		list.display();
		list.deleteByValue(new Emp(1, "nikita"));
		list.display();
	}
}
		