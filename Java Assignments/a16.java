package a1a;
/*Write a program IterativeSumWhile that accepts an integer from the standard input and
prints the value of the sum 1 + 2 + 3 + ... + n. Use while-loop. (IterativeSumWhile.java)*/
import java.util.*;

public class a16 {
	
	public long whilesum(int n)
	{
		long sum=0,i=1;
		while(i<=n)
		{
			sum+=i;
			i++;
		}
		return sum;
	}
	

	public static void main(String[] args) {
		a16 a=new a16();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the nuber");
		int n=in.nextInt();		
		System.out.println("Sum = "+a.whilesum(n));

	}

}
