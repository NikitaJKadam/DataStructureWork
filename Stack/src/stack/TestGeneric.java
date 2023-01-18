package stack;

public class TestGeneric {
	public static void main(String [] args)
	{
	StackGeneric<Emp> st=new StackGeneric<Emp>(3);
	st.push(new Emp(1, "nikita"));
	st.push(new Emp(1, "sanket"));
	st.push(new Emp(1, "vaish"));
	st.push(new Emp(1, "vaish"));
	
	System.out.println(st.pop());
	System.out.println(st.pop());
	System.out.println(st.pop());
	System.out.println(st.pop());
	}
}
