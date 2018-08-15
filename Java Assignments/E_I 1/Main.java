package p1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		/*SavingAccount a1=new SavingAccount("Amir",330);
		CurrentAccount a2=new CurrentAccount("Shar",320);
		a1.deposit(250);
		a2.deposit(400);
		a2.withdraw(500);
		System.out.println(a1.getbal());
		System.out.println(a2.getbal());*/
		
		
	  ArrayList<SavingAccount> sl=new ArrayList<>();
	  ArrayList<CurrentAccount> cl=new ArrayList<>();
		sl.add(new SavingAccount("Amir",330));
		sl.add(new SavingAccount("Shar",321));
		cl.add(new CurrentAccount("Samir",415));
		cl.add(new CurrentAccount("Zuh",123));
		sl.get(0).deposit(200);
		sl.get(1).deposit(500);
		cl.get(0).deposit(300);
		cl.get(1).deposit(700);
		sl.get(0).addinterest(5);
		System.out.println(sl.get(0).withdraw(150));
		System.out.println(cl.get(1).withdraw(150));
	
		
		//sl.get(0).getbal();
		for (SavingAccount s: sl)
		{
			System.out.println(s.toString());
		}
		for (CurrentAccount c: cl)
		{
			System.out.println(c.toString());
		}
		
		
		

	}

}
