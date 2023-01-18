package circular_queue;

public class MyProcess {
	private int pid;
	private String pname;
	private String owner;	
	
	public MyProcess(int pid, String pname, String owner) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "MyProcess [pid=" + pid + ", pname=" + pname + ", owner=" + owner + "]";
	}
	

}
