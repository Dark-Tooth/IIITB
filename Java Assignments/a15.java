
/*Write a Program IterativeSumFor that accepts an integer from the standard input and prints
the value of the sum 1 + 2 + 3 + ... + n. Use for-loop. (IterativeSumFor.java)*/
package a1a;
import java.util.*;
public class a15 {
	
	public long addsum(int n)
	{
		long sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		a15 a=new a15();
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=in.nextInt();
		System.out.println("Sum = "+a.addsum(n));
		

	}

}
