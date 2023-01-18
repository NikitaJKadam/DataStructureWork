package stack;
import java.util.Scanner;
public class DecToBin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		StackGeneric<Integer> st= new StackGeneric<Integer>();
		
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		while(n > 0)
		{
			st.push(n % 2);
			n=n/2;			
		}
		while(!(st.isEmpty())){
			
			System.out.print(st.pop()+" ");
		}
				
	}
	

}
