package stack;

public class TestDStack {

	public static void main(String[] args) {
		DStack ds=new DStack(15);
		ds.push1(10);
		ds.push1(20);
		ds.push1(30);
		ds.push1(40);
		ds.push1(50);
		
		ds.push2(100);
		ds.push2(120);
		ds.push2(130);
		ds.push2(140);
		ds.push2(150);
		System.out.println("----Stack1----");
		System.out.println(ds.pop1());
		System.out.println(ds.pop1());
		System.out.println(ds.pop1());
		System.out.println(ds.pop1());
		System.out.println(ds.pop1());
		
		System.out.println("----Stack2----");
		System.out.println(ds.pop2());
		System.out.println(ds.pop2());
		System.out.println(ds.pop2());
		System.out.println(ds.pop2());
		System.out.println(ds.pop2());
		
		
	}

}
