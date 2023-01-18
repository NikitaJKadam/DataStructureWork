package customException;

@SuppressWarnings("serial")
public class CustomHandlingException  extends Exception{
	String msg;
	
	public CustomHandlingException(String msg)
	{
		super(msg);
	}

}
